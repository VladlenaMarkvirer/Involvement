package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Event;
import com.sibur.involvement.server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getByID(long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public Event save(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public void remove(long id) {
        eventRepository.deleteById(id);
    }
}
