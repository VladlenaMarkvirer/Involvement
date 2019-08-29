package com.sibur.involvement.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="photo")
public class Photo implements Serializable {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long id;

    @Column(name = "description", length=200)
    private String description;

    @Column(name = "image")
    private byte[] image;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person personPhoto;

    @OneToMany(mappedBy = "photoGallery", fetch = FetchType.EAGER)
    private Collection<Gallery> galleryCollection;

    public Photo() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Person getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(Person personPhoto) {
        this.personPhoto = personPhoto;
    }

    public Collection<Gallery> getGalleryCollection() {
        return galleryCollection;
    }

    public void setGalleryCollection(Collection<Gallery> galleryCollection) {
        this.galleryCollection = galleryCollection;
    }

}
