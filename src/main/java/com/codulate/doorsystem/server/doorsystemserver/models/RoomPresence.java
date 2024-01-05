package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

@Table
@Entity
public class RoomPresence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cardHolder_id")
    private CardHolder cardHolder;

    public RoomPresence(Long id, String status, CardHolder cardHolder) {
        this.id = id;
        this.status = status;
        this.cardHolder = cardHolder;
    }

    public RoomPresence() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }
}
