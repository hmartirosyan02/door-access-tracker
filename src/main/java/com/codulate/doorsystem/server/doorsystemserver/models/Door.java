package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

import java.util.Set;

@Table
@Entity
public class Door {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToOne(mappedBy = "door")
    private Device device;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "card_door", joinColumns = @JoinColumn(name = "door_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id"))
    private Set<Card> cards;

    @OneToMany(mappedBy = "door")
    private Set<Timetable> timetables;

    public Door(Long id, String name, Device device, Set<Card> cards, Set<Timetable> timetables) {
        this.id = id;
        this.name = name;
        this.device = device;
        this.cards = cards;
        this.timetables = timetables;
    }

    public Door() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public Set<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(Set<Timetable> timetables) {
        this.timetables = timetables;
    }
}
