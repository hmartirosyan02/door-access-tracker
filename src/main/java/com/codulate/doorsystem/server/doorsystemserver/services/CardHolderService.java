package com.codulate.doorsystem.server.doorsystemserver.services;

import com.codulate.doorsystem.server.doorsystemserver.mappers.CardHolderMapper;
import com.codulate.doorsystem.server.doorsystemserver.models.CardHolder;
import com.codulate.doorsystem.server.doorsystemserver.repositories.CardHolderRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardHolderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardHolderService {
    private final CardHolderRepository cardHolderRepository;
    private final CardHolderMapper cardHolderMapper;

    @Autowired
    public CardHolderService(CardHolderRepository cardHolderRepository, CardHolderMapper cardHolderMapper){
        this.cardHolderRepository = cardHolderRepository;
        this.cardHolderMapper = cardHolderMapper;
    }

    public void addCardHolder(AddCardHolderRequest addCardHolderRequest){
        CardHolder cardHolder = cardHolderMapper.addCardHolderRequestToEntity(addCardHolderRequest);
        cardHolderRepository.save(cardHolder);
    }
}
