package com.codegym.webservice.service;

import com.codegym.webservice.model.Blog;
import com.codegym.webservice.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id){
        return blogRepository.findById(id);
    }

    @Override
    public Blog save(Blog blog){
        return blogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog){
        blogRepository.delete(blog);
    }
}
