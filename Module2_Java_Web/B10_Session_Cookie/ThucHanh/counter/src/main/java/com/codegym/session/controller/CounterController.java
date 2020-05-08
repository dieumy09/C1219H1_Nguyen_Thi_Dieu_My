package com.codegym.session.controller;

import com.codegym.session.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public MyCounter setUpCounter(){
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }
}
