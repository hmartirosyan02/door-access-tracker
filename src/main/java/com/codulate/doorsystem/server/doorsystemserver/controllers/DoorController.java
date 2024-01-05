package com.codulate.doorsystem.server.doorsystemserver.controllers;

import com.codulate.doorsystem.server.doorsystemserver.requests.AddDoorRequest;
import com.codulate.doorsystem.server.doorsystemserver.services.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/door")
public class DoorController {
    private final DoorService doorService;

    @Autowired
    public DoorController(DoorService doorService){
        this.doorService = doorService;
    }

    @PostMapping(value = "/add")
    public void addDoor(@RequestBody AddDoorRequest addDoorRequest){
        doorService.addDoor(addDoorRequest);
    }

}
