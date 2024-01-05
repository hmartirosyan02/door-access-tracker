package com.codulate.doorsystem.server.doorsystemserver.services;

import com.codulate.doorsystem.server.doorsystemserver.mappers.DoorMapper;
import com.codulate.doorsystem.server.doorsystemserver.models.Door;
import com.codulate.doorsystem.server.doorsystemserver.repositories.DoorRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddDoorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoorService {
    DoorRepository doorRepository;

    DoorMapper doorMapper;

    @Autowired
    public DoorService(DoorRepository doorRepository, DoorMapper doorMapper){
        this.doorRepository = doorRepository;
        this.doorMapper = doorMapper;
    }

    public void addDoor(AddDoorRequest addDoorRequest){
        Door door = doorMapper.addDoorRequestToEntity(addDoorRequest);
        doorRepository.save(door);
    }
}
