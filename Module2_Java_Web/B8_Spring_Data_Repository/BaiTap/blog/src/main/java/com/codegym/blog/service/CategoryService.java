package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoryService {

    Iterable<Category> findAll();


    Optional<Category> findById(Long id);

    Category save(Category category);

    void delete(Category category);

}