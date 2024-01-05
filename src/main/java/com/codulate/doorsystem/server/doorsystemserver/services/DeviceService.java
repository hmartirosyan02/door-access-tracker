package com.codulate.doorsystem.server.doorsystemserver.services;

import com.codulate.doorsystem.server.doorsystemserver.mappers.DeviceMapper;
import com.codulate.doorsystem.server.doorsystemserver.models.Device;
import com.codulate.doorsystem.server.doorsystemserver.repositories.DeviceRepository;
import com.codulate.doorsystem.server.doorsystemserver.requests.AddDeviceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    private final DeviceMapper deviceMapper;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository, DeviceMapper deviceMapper){
        this.deviceRepository = deviceRepository;
        this.deviceMapper = deviceMapper;
    }

    public void addDevice(AddDeviceRequest addDeviceRequest){
        Device device = deviceMapper.addDeviceRequestToEntity(addDeviceRequest);
        deviceRepository.save(device);
    }
}
