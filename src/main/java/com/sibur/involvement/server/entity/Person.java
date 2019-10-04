package com.sibur.involvement.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name="person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long id;

    @Column(name = "name", length=50)
    private String name;

    @Column(name="surname", length=50)
    private String surname;

    //template: [ivanov]@sibur.ru
    @Column(name="email", nullable = false, length=50)
    private String email;

    @Column(name="password", nullable = false, length=30)
    private String password;

    @Column(name="points", scale = 2)
    private java.math.BigDecimal points = java.math.BigDecimal.valueOf(0.0);

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @Column(name = "avatar")
    private byte[] avatar;

    @Column(name="spent", scale = 2)
    private java.math.BigDecimal spent = java.math.BigDecimal.valueOf(0.0);

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public void setSpent(BigDecimal spent) {
        this.spent = spent;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public BigDecimal getSpent() {
        return spent;
    }

}
