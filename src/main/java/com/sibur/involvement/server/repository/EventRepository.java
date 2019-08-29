package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
