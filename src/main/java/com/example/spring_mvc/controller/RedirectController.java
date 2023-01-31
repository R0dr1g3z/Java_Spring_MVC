package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
    
    @RequestMapping("/first")
    public String first(){
        return "first";
    }

    @RequestMapping("/second")
    public String second(){
        return "redirect:third";
    }

    @RequestMapping("/third")
    public String third(){
        return "third";
    }
}
