package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Category;
import com.sibur.involvement.server.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getByID(long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public void remove(long id) {
        categoryRepository.deleteById(id);
    }
}
