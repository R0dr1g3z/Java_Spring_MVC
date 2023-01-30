package com.example.spring_mvc.controller;

import java.time.DayOfWeek;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreeTimeController {
    @RequestMapping("/free-time")
    @ResponseBody
    public String freeTime() {
        DayOfWeek day = DayOfWeek.SATURDAY;
        LocalTime time = LocalTime.of(11, 0);
        LocalTime time2 = LocalTime.of(9, 0);
        LocalTime time3 = LocalTime.of(17, 0);
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return "FREE";
        }
        for (DayOfWeek d : DayOfWeek.values()) {
            if (d == day && time.isAfter(time2) && time.isBefore(time3)) {
                return "WORKING DON'T CALL";
            }
        }
        return "AFTER WORK";
    }
}