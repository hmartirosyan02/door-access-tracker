package com.codulate.doorsystem.server.doorsystemserver.mappers;

import com.codulate.doorsystem.server.doorsystemserver.models.Door;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddDoorRequest;
import org.springframework.stereotype.Component;

@Component
public class DoorMapper {

    public Door addDoorRequestToEntity(AddDoorRequest addDoorRequest){
        Door door = new Door();
        door.setName(addDoorRequest.getName());
        return door;
    }
}
