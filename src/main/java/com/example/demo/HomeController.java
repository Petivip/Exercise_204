package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String carForm(Model model){
        model.addAttribute("car",new Car());
        return "index";
    }
    @PostMapping("/carform")
    public String loadCarForm(@Valid Car car, BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        return "view";
    }
}
