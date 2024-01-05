package com.codulate.doorsystem.server.doorsystemserver.controllers;

import com.codulate.doorsystem.server.doorsystemserver.requests.AddCardRequest;
import com.codulate.doorsystem.server.doorsystemserver.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/card")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @PostMapping(value = "/add")
    public void addCard(@RequestBody AddCardRequest addCardRequest){
        cardService.addCard(addCardRequest);
    }
}
