package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
