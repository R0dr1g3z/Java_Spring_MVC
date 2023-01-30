package com.example.spring_mvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {
    @RequestMapping("/show-random")
    @ResponseBody
    public int showRandom() {
        Random r = new Random();
        return r.nextInt(100 - 1) + 1;
    }

    @RequestMapping("/random/{min}/{max}")
    @ResponseBody
    public String randomMax(@PathVariable int max, @PathVariable int min) {
        Random r = new Random();
        int number = r.nextInt(max - min) + min;
        return "Drawn number: " + number;
    }
}
