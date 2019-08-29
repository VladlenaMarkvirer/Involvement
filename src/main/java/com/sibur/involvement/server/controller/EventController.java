package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Event;
import com.sibur.involvement.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Event getEvent(@PathVariable("id") long eventID) {
        return eventService.getByID(eventID);
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public Event saveEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteEvent(@PathVariable("id") long eventID) {
        eventService.remove(eventID);
    }
}
