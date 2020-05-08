package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("success","hello my my");
        return "home";
    }
}
