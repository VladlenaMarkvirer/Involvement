package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAll();
    Note getByID(long id);
    Note save(Note note);
    void remove(long id);
}
