package com.sibur.involvement.server.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name="note")
public class Note implements Serializable {

    //java.util.Date now = new java.util.Date();

    @Id
    @GeneratedValue(generator = "increment", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "note_id_seq", sequenceName = "note_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "theme", length=50)
    private String theme;

    @Column(name = "text", length=500)
    private String text;

    @Column(name = "time")
    private Date time; // = new Date(Long.parseLong(now.toString()));

    @Column(name="isanonimus")
    private boolean isanonimus = false;

    @OneToMany(mappedBy = "notePackage", fetch = FetchType.EAGER)
    private Collection<Package> packageCollectionCollection;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event eventNote;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person personNote;

    public Note() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isIsanonimus() {
        return isanonimus;
    }

    public void setIsanonimus(boolean isanonimus) {
        this.isanonimus = isanonimus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Collection<Package> getPackageCollectionCollection() {
        return packageCollectionCollection;
    }

    public void setPackageCollectionCollection(Collection<Package> packageCollectionCollection) {
        this.packageCollectionCollection = packageCollectionCollection;
    }

    public Event getEventNote() {
        return eventNote;
    }

    public void setEventNote(Event eventNote) {
        this.eventNote = eventNote;
    }

    public Person getPersonNote() {
        return personNote;
    }

    public void setPersonNote(Person personNote) {
        this.personNote = personNote;
    }
}
