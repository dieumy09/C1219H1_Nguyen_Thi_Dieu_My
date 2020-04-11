package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String translate(@RequestParam String keyword , Model model ){
        model.addAttribute("keyword", keyword);
        Map<String, String> wordList = new HashMap<>();
        wordList.put("Hello","Xin Chao");
        wordList.put("Book", "Sach");
        wordList.put("Monkey", "Con khi");
        wordList.put("Duck", "con vit");
        String value = wordList.get(keyword);
        model.addAttribute("value",value);
        return "index";
    }
}

