package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getByID(long id);
    Category save(Category category);
    void remove(long id);
}
