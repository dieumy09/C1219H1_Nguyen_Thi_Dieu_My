package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ConverterController {
    @GetMapping("/converter")
    public String converter(@RequestParam Float rate, Float usd, Model model){
        Float vnd = rate * usd;
        model.addAttribute("rate",rate);
        model.addAttribute("usd",usd);
        model.addAttribute("vnd", vnd);
        return "index";

    }
}
