package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {
    
    @RequestMapping("/showuseragent/{userAgent}")
    public String showUserAgent(@PathVariable String userAgent, Model model){
        model.addAttribute("userAgent", userAgent);
        return "userAgent";
    }
}
