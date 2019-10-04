package com.sibur.involvement.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name="event")
public class Event implements Serializable {

    //java.util.Date now = new java.util.Date();

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long id;

    @Column(name = "name", length=50, nullable = false)
    private String name;

    @Column(name="price", scale = 2)
    private java.math.BigDecimal price = java.math.BigDecimal.valueOf(0.0);

    @Column(name = "date_start")
    private Date date_start;// = new Date(Long.parseLong(now.toString()));

    @Column(name = "date_end")
    private Date date_end;// = new Date(Long.parseLong(now.toString()));

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "description", length=1000)
    private String description;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id_owner", referencedColumnName = "id")
    private Person personEvent;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Person getPersonEvent() {
        return personEvent;
    }

    public void setPersonEvent(Person personEvent) {
        this.personEvent = personEvent;
    }

}
