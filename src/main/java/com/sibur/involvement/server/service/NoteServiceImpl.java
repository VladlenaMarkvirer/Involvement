package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Note;
import com.sibur.involvement.server.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note getByID(long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public Note save(Note note) {
        return noteRepository.saveAndFlush(note);
    }

    @Override
    public void remove(long id) {
        noteRepository.deleteById(id);
    }
}
