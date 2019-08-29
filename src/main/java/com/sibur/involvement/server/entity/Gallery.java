package com.sibur.involvement.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="gallery")
public class Gallery implements Serializable {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event eventGallery;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    private Photo photoGallery;

    public Gallery() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEventGallery() {
        return eventGallery;
    }

    public void setEventGallery(Event eventGallery) {
        this.eventGallery = eventGallery;
    }

    public Photo getPhotoGallery() {
        return photoGallery;
    }

    public void setPhotoGallery(Photo photoGallery) {
        this.photoGallery = photoGallery;
    }
}
