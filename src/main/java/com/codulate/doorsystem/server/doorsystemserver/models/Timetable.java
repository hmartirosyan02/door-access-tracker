package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "event_type")
    private String eventType;
    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "CardHolder_id", nullable = false)
    private CardHolder cardHolder;

    @ManyToOne
    @JoinColumn(name = "door_id", nullable = false)
    private Door door;

    public Timetable(long id, String eventType, Date date, CardHolder cardHolder, Door door) {
        this.id = id;
        this.eventType = eventType;
        this.date = date;
        this.cardHolder = cardHolder;
        this.door = door;
    }

    public Timetable() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
