package com.codegym.blog.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_blog")
    private String nameBlog;
    @Column(name = "quick_view")
    private String quickView;
    @Column(name = "content")
    private String content;




    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(String nameBlog, String quickView, String content) {
        this.nameBlog = nameBlog;
        this.quickView = quickView;
        this.content = content;
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

    public String getQuickView() {
        return quickView;
    }

    public void setQuickView(String quickView) {
        this.quickView = quickView;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
