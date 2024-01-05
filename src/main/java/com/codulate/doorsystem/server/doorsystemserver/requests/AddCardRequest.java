package com.codulate.doorsystem.server.doorsystemserver.requests;

import java.util.Set;

public class AddCardRequest {
    private String serialNumber;

    private Set<Long> cardHolderIds;

    private Set<Long> doorIds;
    public AddCardRequest(String serialNumber, Set<Long> cardHolderIds, Set<Long> doorIds) {
        this.serialNumber = serialNumber;
        this.cardHolderIds = cardHolderIds;
        this.doorIds = doorIds;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Set<Long> getCardHolderIds() {
        return cardHolderIds;
    }

    public void setCardHolderIds(Set<Long> cardHolderIds) {
        this.cardHolderIds = cardHolderIds;
    }

    public Set<Long> getDoorIds() {
        return doorIds;
    }

    public void setDoorIds(Set<Long> doorIds) {
        this.doorIds = doorIds;
    }
}
