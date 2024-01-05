package com.codulate.doorsystem.server.doorsystemserver.controllers;

import com.codulate.doorsystem.server.doorsystemserver.requests.AddDeviceRequest;
import com.codulate.doorsystem.server.doorsystemserver.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/device")
@RestController
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @PostMapping(value = "/add")
    public void addDevice(@RequestBody AddDeviceRequest addDeviceRequest){
        deviceService.addDevice(addDeviceRequest);
    }
}
