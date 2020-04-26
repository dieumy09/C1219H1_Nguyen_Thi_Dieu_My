package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.repository.CategoryRepository;
import com.codegym.blog.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private PostServiceImpl postService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryRepository.findAll();
    }

    @GetMapping("")
    public ModelAndView listBlog(Pageable pageable) {
        Page<Blog> blogs = blogRepository.findAll(pageable);
        return new ModelAndView("list", "blogs", blogs);
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam("name") String name, Pageable pageable){
        Page<Blog> blogs;
        if(name != null){
            blogs = postService.findAllByNameBlogContaining(name, pageable);
        } else {
            blogs = postService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @PostMapping("/sort")
    public ModelAndView sort(Pageable pageable){
        List<Blog> blogs = postService.findAllByOrderByDatePostAsc();
        int start = (int) pageable.getOffset();
        int end = (start + pageable.getPageSize()) > blogs.size() ? blogs.size() : (start + pageable.getPageSize());
        Page<Blog> pages = new PageImpl<Blog>(blogs.subList(start, end), pageable, blogs.size());
        ModelAndView modelAndView = new ModelAndView("/blog/sort");
        modelAndView.addObject("blogs",pages);
        return modelAndView;
    }



    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        return new ModelAndView("/blog/create", "blog", new Blog());
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blog.setDatePost(LocalDate.now());
        postService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView showFullBlog(@PathVariable Long id) {
        Optional<Blog> blog = postService.findById(id);
        if (blog != null) {
            return new ModelAndView("/blog/view", "blog", blog);

        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Blog blog = postService.findById(id).orElse(null);
        if (blog != null) {
            return new ModelAndView("/blog/edit", "blog", blog);
        } else {
            return new ModelAndView("/error");
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView editBlog(@ModelAttribute("blog") Blog blog) {
        postService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Blog> blog = postService.findById(id);
        if (blog != null) {
            return new ModelAndView("/blog/delete", "blog", blog);
        } else {
            return new ModelAndView("/error");
        }
    }

    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog) {
        blogRepository.deleteById(blog.getId());
        return "redirect:/";
    }
}
