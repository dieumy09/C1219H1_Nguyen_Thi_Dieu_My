package com.codegym.cookie.controller;

import com.codegym.cookie.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {
    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    }

    @RequestMapping("/login")
    public String index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model){
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("value",cookie);
        return "login";
    }

    @PostMapping("/dologin")
    public String doLogin(@ModelAttribute("user") User user, @CookieValue(value = "setUser", defaultValue = "") String setUser,
                          Model model, HttpServletResponse response, HttpServletRequest request){
        if (user.getEmail().equals("dieumy@gmail.com") && user.getPassword().equals("1234")){
            if (user.getEmail() != null){
                setUser = user.getEmail();
            }
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);

            Cookie[] cookies = request.getCookies();
            for (Cookie c : cookies){
                if (c.getName().equals("setUser")){
                    model.addAttribute("value", c);
                    break;
                } else {
                    c.setValue("");
                    model.addAttribute("value", c);
                    break;
                }
            }
            model.addAttribute("message", "Welcome!!!!");
        } else {
            user.setEmail("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("value", cookie);
            model.addAttribute("message", "Login failed. Try again!!!");
        }

        return "login";

    }
}
