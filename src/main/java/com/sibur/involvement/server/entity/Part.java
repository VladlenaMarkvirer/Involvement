package com.sibur.involvement.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="part")
public class Part implements Serializable {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long id;

    @Column(name = "confirmed")
    private Boolean confirmed = false;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event eventPart;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person personPart;

    public Part() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Event getEventPart() {
        return eventPart;
    }

    public void setEventPart(Event eventPart) {
        this.eventPart = eventPart;
    }

    public Person getPersonPart() {
        return personPart;
    }

    public void setPersonPart(Person personPart) {
        this.personPart = personPart;
    }

}
