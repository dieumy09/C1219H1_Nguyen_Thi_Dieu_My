package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/")
    public String form(Model model){
        model.addAttribute("value1","");
        model.addAttribute("value2", "");
        model.addAttribute("operator","");
        model.addAttribute("result","");
        return "form";
    }

    @PostMapping("/calculated")
    public String result(@RequestParam("value1") int value1, @RequestParam("value2") int value2, @RequestParam("operator") String operator, Model model){
        float result = this.calculated(value1,value2,operator);
        model.addAttribute("value1",value1);
        model.addAttribute("value2",value2);
        model.addAttribute("operator",operator);
        model.addAttribute("result",result);
        return "form";
    }

    public float calculated(int value1, int value2, String operator){
        switch (operator) {
            case "Addition(+)":
                return value1 + value2;
            case "Subtraction(-)":
                return value1 - value2;
            case "Multiplication(x)":
                return value1 * value2;
            case "Division(/)":
                if (value2 != 0){
                    return value1 / value2;
                } else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default: throw new RuntimeException("invalid operation");
        }
    }

}
