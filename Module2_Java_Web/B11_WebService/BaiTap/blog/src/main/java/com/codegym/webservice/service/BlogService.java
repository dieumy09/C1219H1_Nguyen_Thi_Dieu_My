package com.codegym.webservice.service;

import com.codegym.webservice.model.Blog;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService  {
    List<Blog> findAll();

    Optional<Blog> findById(Long id);

    Blog save(Blog blog);

    void delete(Blog blog);
}
