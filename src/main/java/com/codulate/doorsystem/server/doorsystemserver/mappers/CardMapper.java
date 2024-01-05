package com.codulate.doorsystem.server.doorsystemserver.mappers;

import com.codulate.doorsystem.server.doorsystemserver.models.Card;
import com.codulate.doorsystem.server.doorsystemserver.models.CardHolder;
import com.codulate.doorsystem.server.doorsystemserver.models.Door;
import com.codulate.doorsystem.server.doorsystemserver.repositories.CardHolderRepository;
import com.codulate.doorsystem.server.doorsystemserver.repositories.DoorRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Component
public class CardMapper {
    private final CardHolderRepository cardHolderRepository;
    private final DoorRepository doorRepository;

    @Autowired
    public CardMapper(CardHolderRepository cardHolderRepository, DoorRepository doorRepository) {
        this.cardHolderRepository = cardHolderRepository;
        this.doorRepository = doorRepository;
    }

    public Card addCardRequestToEntity(AddCardRequest addCardRequest){
        Card card = new Card();
        card.setSerialNumber(addCardRequest.getSerialNumber());
        card.setStatus("Active");
        card.setCreatedDate(new Date());
        List<CardHolder> cardHolders = cardHolderRepository.findAllById(addCardRequest.getCardHolderIds());
        card.setCardHolders(new HashSet<>(cardHolders));
        List<Door> doors = doorRepository.findAllById(addCardRequest.getDoorIds());
        card.setDoors(new HashSet<>(doors));
        return card;
    }
}
