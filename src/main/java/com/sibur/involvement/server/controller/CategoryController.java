package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Category;
import com.sibur.involvement.server.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategories() {
        return categoryService.getAll();
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Category getCategory(@PathVariable("id") long categoryID) {
        return categoryService.getByID(categoryID);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    @ResponseBody
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCategory(@PathVariable("id") long categoryID) {
        categoryService.remove(categoryID);
    }
}
