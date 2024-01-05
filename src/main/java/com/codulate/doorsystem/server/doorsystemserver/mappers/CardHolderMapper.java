package com.codulate.doorsystem.server.doorsystemserver.mappers;

import com.codulate.doorsystem.server.doorsystemserver.models.CardHolder;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardHolderRequest;
import org.springframework.stereotype.Component;

@Component
public class CardHolderMapper {
    public CardHolder addCardHolderRequestToEntity(AddCardHolderRequest addCardHolderRequest){
        CardHolder cardHolder = new CardHolder();
        cardHolder.setFirstName(addCardHolderRequest.getFirstName());
        cardHolder.setLastName(addCardHolderRequest.getLastName());
        cardHolder.setPassportNumber(addCardHolderRequest.getPassportNumber());
        return cardHolder;
    }
}
