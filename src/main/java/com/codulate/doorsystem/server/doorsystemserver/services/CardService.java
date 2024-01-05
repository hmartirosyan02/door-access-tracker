package com.codulate.doorsystem.server.doorsystemserver.services;

import com.codulate.doorsystem.server.doorsystemserver.mappers.CardMapper;
import com.codulate.doorsystem.server.doorsystemserver.models.Card;
import com.codulate.doorsystem.server.doorsystemserver.repositories.CardRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.liangyuen.RaspRC522;

@Service
public class CardService {
    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    @Autowired
    public CardService(CardRepository cardRepository, CardMapper cardMapper){
        this.cardRepository = cardRepository;
        this.cardMapper = cardMapper;
    }

    public void addCard(AddCardRequest addCardRequest){
        Card card = cardMapper.addCardRequestToEntity(addCardRequest);
        cardRepository.save(card);
    }
}
