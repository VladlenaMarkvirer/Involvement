package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getByID(long id);
    Person save(Person person);
    void remove(long id);
}
