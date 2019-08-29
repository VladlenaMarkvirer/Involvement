package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Event;

import java.util.List;

public interface EventService {
    List<Event> getAll();
    Event getByID(long id);
    Event save(Event event);
    void remove(long id);
}
