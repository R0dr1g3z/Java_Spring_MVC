package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiplyController {
    
    @RequestMapping("/multiply/{size}")
    public String multiply(@PathVariable int size, Model model){
        model.addAttribute("size");
        return "multiply";
    }
}
