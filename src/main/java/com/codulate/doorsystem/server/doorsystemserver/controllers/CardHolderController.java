package com.codulate.doorsystem.server.doorsystemserver.controllers;

import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardHolderRequest;
import com.codulate.doorsystem.server.doorsystemserver.services.CardHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cardHolder")
public class CardHolderController {
    private final CardHolderService cardHolderService;

    @Autowired
    public CardHolderController(CardHolderService cardHolderService){
        this.cardHolderService = cardHolderService;
    }

    @PostMapping(value = "/add")
    public void addCardHolder(@RequestBody AddCardHolderRequest addCardHolderRequest){
        cardHolderService.addCardHolder(addCardHolderRequest);
    }

}
