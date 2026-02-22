package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/index")
    public String hello(Model model){
        String message = "Hello World from HelloController!!!";
        model.addAttribute("msg");
        return "index";
    }
}
