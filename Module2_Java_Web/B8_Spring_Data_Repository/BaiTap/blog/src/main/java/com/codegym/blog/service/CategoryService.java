package com.codegym.blog.service;

import com.codegym.blog.model.Category;
import com.codegym.blog.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoryService {

    Iterable<Category> findAll();


    Optional<Category> findById(Long id);

    Category save(Category category);

    void delete(Category category);

    Page<Post> findPosts(Category category, Pageable pageable);
}