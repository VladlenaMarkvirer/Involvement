package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Note;
import com.sibur.involvement.server.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    @ResponseBody
    public List<Note> getAllNotes() {
        return noteService.getAll();
    }

    @RequestMapping(value = "/notes/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Note getNote(@PathVariable("id") long noteID) {
        return noteService.getByID(noteID);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    @ResponseBody
    public Note saveNote(@RequestBody Note note) {
        return noteService.save(note);
    }

    @RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteNote(@PathVariable("id") long noteID) {
        noteService.remove(noteID);
    }
}
