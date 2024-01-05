package com.codulate.doorsystem.server.doorsystemserver.requests;

public class AddDoorRequest {
    private String name;

    public AddDoorRequest(String name) {
        this.name = name;
    }

    public AddDoorRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
