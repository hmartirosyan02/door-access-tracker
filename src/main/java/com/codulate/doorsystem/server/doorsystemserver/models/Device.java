package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

@Entity
@Table
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String serialNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "door_id")
    private Door door;

    public Device(Long id, String serialNumber, Door door) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.door = door;
    }

    public Device() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
