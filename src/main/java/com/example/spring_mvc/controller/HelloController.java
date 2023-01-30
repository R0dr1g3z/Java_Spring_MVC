package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloName(@PathVariable String firstName, @PathVariable String lastName){
        return String.format("Welcome %s %s", firstName, lastName);
    }

    @RequestMapping("/helloView")
    public String helloView(HttpServletRequest req, Model model){
        model.addAttribute("color", "white");
        model.addAttribute("backgroundColor", "black");
        return "home";
    }
}
