package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

import java.util.Date;

@Table
@Entity
public class StayDuration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date date;
    @Column
    private int duration;
    @ManyToOne
    @JoinColumn(name = "cardHolder_id", nullable = false)
    private CardHolder cardHolder;

    public StayDuration(Long id, Date date, int duration, CardHolder cardHolder) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.cardHolder = cardHolder;
    }

    public StayDuration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }
}
