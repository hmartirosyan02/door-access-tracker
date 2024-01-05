package com.codulate.doorsystem.server.doorsystemserver.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class CardHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String passportNumber;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "cardHolder_card", joinColumns = @JoinColumn(name = "cardHolder_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id"))
    private Set<Card> cards;

    @OneToOne(mappedBy = "cardHolder")
    private RoomPresence roomPresence;

    @OneToMany(mappedBy = "cardHolder")
    private Set<Timetable> timetables;

    @OneToMany(mappedBy = "cardHolder")
    private Set<StayDuration> stayDurations;

    public CardHolder(Long id, String firstName, String lastName, String passportNumber, Set<Card> cards, RoomPresence roomPresence, Set<Timetable> timetables) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.cards = cards;
        this.roomPresence = roomPresence;
        this.timetables = timetables;
    }

    public CardHolder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public RoomPresence getRoomPresence() {
        return roomPresence;
    }

    public void setRoomPresence(RoomPresence roomPresence) {
        this.roomPresence = roomPresence;
    }

    public Set<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(Set<Timetable> timetables) {
        this.timetables = timetables;
    }
}
