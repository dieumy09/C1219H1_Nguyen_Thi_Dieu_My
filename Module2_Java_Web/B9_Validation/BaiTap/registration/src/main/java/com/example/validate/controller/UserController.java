package com.example.validate.controller;

import com.example.validate.model.User;
import com.example.validate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public ModelAndView showForm(){
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/validateUser")
    public ModelAndView checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        List<User> userList = userService.findAllByEmail(user.getEmail());
        if ( userList.size() != 0){
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("message","Email used. Input new email!");
            user.setEmail("");
            modelAndView.addObject("user", user);
            return modelAndView;
        } else {
            if(bindingResult.hasFieldErrors()){
                ModelAndView modelAndView = new ModelAndView("index");
                return modelAndView;
            } else  {
                userService.save(user);
                ModelAndView modelAndView = new ModelAndView("result");
                return modelAndView;
            }
        }

    }
}
