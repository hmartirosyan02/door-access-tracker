package com.codulate.doorsystem.server.doorsystemserver.requests;

public class AddDeviceRequest {
    private String serialNumber;

    private Long doorId;

    public AddDeviceRequest(String serialNumber, Long doorId) {
        this.serialNumber = serialNumber;
        this.doorId = doorId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getDoorId() {
        return doorId;
    }

    public void setDoorId(Long doorId) {
        this.doorId = doorId;
    }
}
