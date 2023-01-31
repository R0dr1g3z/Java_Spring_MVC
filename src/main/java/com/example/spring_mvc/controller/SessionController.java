package com.example.spring_mvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("loginStart")
public class SessionController {
    
    @RequestMapping("/session")
    @ResponseBody
    public String session(HttpSession sess, Model model){
        LocalDateTime date = (LocalDateTime) sess.getAttribute("loginStart");
        if (date == null){
            date = LocalDateTime.now();
            model.addAttribute("loginStart", date);
        }
        return date.toString();
    }
}
