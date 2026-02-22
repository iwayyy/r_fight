package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Todo;

@Controller
public class indexController {

    private final TodoRepository repository;

    public indexController(TodoRepository repository) {
        this.repository = repository;
    }

    //データ登録後にフォームを空にする
    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("todo", new Todo());
        return "index";
    }


    //データの登録（create）
    @PostMapping("/create")
    public String Create(@ModelAttribute Todo todo){
        repository.save(todo);
        return "redirect:/";
    }
}
