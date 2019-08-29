package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
