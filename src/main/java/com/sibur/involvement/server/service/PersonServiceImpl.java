package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Person;
import com.sibur.involvement.server.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getByID(long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public Person save(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Override
    public void remove(long id) {
        personRepository.deleteById(id);
    }
}
