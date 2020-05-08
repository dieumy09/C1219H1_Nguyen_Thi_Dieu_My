package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface PostService {

    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> findById(Long id);

    Blog save(Blog blog);

    void delete(Blog blog);

    Page<Blog> findAllByNameBlogContaining(String nameBlog, Pageable pageable);
}