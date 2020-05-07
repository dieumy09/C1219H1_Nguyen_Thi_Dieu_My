package com.codegym.blog.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCategory;

    @OneToMany(targetEntity = Blog.class, cascade = CascadeType.ALL)
    private List<Blog> blogs;

    public Category() {
    }

    public Category(String nameCategory, List<Blog> blogs) {
        this.nameCategory = nameCategory;
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
