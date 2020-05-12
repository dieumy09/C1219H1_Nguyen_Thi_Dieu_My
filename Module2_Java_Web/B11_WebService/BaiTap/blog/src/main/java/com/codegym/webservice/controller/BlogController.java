package com.codegym.webservice.controller;


import com.codegym.webservice.model.Blog;
import com.codegym.webservice.model.Category;
import com.codegym.webservice.service.BlogService;
import com.codegym.webservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Blog>> list(){
        List<Blog> blogs = blogService.findAll();
        if (blogs==null){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> view(@PathVariable("id") Blog blog){
        if (blog==null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Blog>(blog, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Void> create(@RequestBody Blog blog, UriComponentsBuilder uriComponentsBuilder){
        blog.setDatePost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uriComponentsBuilder.path("/blog/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Blog> edit(@PathVariable("id") Long id, @RequestBody Blog blog){
        Blog currentBlog = blogService.findById(id).orElse(null);
        if ((blog==null) || (currentBlog==null)){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        currentBlog.setNameBlog(blog.getNameBlog());
        currentBlog.setCategory(blog.getCategory());
        currentBlog.setSummary(blog.getSummary());
        currentBlog.setContent(blog.getContent());
        blogService.save(currentBlog);
        return new ResponseEntity<Blog>(currentBlog, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Blog> remove(@PathVariable("id") Blog blog){
        if (blog==null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
        }
    }
}
