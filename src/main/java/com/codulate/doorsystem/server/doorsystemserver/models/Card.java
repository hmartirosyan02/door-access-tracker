package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String serialNumber;
    @Column
    private Date createdDate;
    @Column
    private String status;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "card_door", joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "door_id"))
    private Set<Door> doors;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "cardHolder_card", joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "cardHolder_id"))
    private Set<CardHolder> cardHolders;

    public Card(Long id, String serialNumber, Date createdDate, String status, Set<Door> doors, Set<CardHolder> cardHolders) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.createdDate = createdDate;
        this.status = status;
        this.doors = doors;
        this.cardHolders = cardHolders;
    }

    public Card() {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Door> getDoors() {
        return doors;
    }

    public void setDoors(Set<Door> doors) {
        this.doors = doors;
    }

    public Set<CardHolder> getCardHolders() {
        return cardHolders;
    }

    public void setCardHolders(Set<CardHolder> cardHolders) {
        this.cardHolders = cardHolders;
    }
}
