package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String getForm(){
        return "index";
    }

    @PostMapping("/form")
    @ResponseBody
    public String postForm(HttpServletRequest req){
        String paramName = req.getParameter("paramName");
        String paramDate = req.getParameter("paramDate");
        return "Name: " + paramName + "<br>Date: " + paramDate;
    }
}
