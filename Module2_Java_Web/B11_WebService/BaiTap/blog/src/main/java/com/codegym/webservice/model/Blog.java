package com.codegym.webservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_blog")
    private String nameBlog;

    @Column(name = "summary")
    private String summary;

    @Column(name = "content")
    private String content;

    @Column(name = "date_post")
    private Date datePost;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
