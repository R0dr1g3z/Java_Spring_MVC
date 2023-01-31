package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @RequestMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookie(@PathVariable String value1, @PathVariable String value2, HttpServletResponse resp) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        return "add cookies";
    }

    @RequestMapping("/getcookies")
    @ResponseBody
    public String getCookies(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies();
        StringBuilder sb = new StringBuilder();
        for (Cookie c : cookies) {
            sb.append(String.format("Cookie: %s Value: %s <br>", c.getName(), c.getValue()));
        }
        return sb.toString();
    }
}
