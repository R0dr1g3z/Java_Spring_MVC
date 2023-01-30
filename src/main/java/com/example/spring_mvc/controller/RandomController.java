package com.example.spring_mvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {
    @RequestMapping("/show-random")
    @ResponseBody
    public int showRandom(){
        Random r = new Random();
        return r.nextInt(100 - 1) + 1;
    }
}
