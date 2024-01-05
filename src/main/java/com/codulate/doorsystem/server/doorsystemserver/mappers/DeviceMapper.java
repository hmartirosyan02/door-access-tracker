package com.codulate.doorsystem.server.doorsystemserver.mappers;

import com.codulate.doorsystem.server.doorsystemserver.models.Device;
import com.codulate.doorsystem.server.doorsystemserver.models.Door;
import com.codulate.doorsystem.server.doorsystemserver.repositories.DoorRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddDeviceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DeviceMapper {
    private final DoorRepository doorRepository;

    @Autowired
    public DeviceMapper(DoorRepository doorRepository){
        this.doorRepository = doorRepository;
    }

    public Device addDeviceRequestToEntity(AddDeviceRequest addDeviceRequest){
        Device device = new Device();
        device.setSerialNumber(addDeviceRequest.getSerialNumber());
        Optional<Door> oDoor = doorRepository.findById(addDeviceRequest.getDoorId());
        if(oDoor.isEmpty()){
            throw new RuntimeException("Invalid door id");
        }
        device.setDoor(oDoor.get());
        return device;
    }
}
