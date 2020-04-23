package com.codegym.model;

import javax.persistence.*;

@Entity
//@Table(name = "Blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "described")
    private String described;

    @Column(name = "date_create")
    private String dateCreate;

    public Blog() {
    }

    public Blog(String title, String described, String dateCreate){
        this.title = title;
        this.described = described;
        this.dateCreate = dateCreate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString(){
        return String.format("Blog[ title is %s, describe is %s, createDate is %s", title, described, dateCreate);
    }
}
