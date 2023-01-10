package com.example.first.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi")
    public String niceToMeetYou(){
        return "greeting"; //templates/greeting.mustache -> transmit to the browser.
    }
}
