package com.codegym.webservice.service;

import com.codegym.webservice.model.Category;

import java.util.Optional;

public interface CategoryService {
    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    Category save(Category category);

    void delete(Category category);
}
