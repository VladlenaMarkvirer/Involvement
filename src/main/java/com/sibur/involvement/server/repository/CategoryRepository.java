package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
