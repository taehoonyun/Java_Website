package com.example.first.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
 public class firstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","Taehoon");
        return "greeting"; //templates/greeting.mustache -> transmit to the browser.
    }
    @GetMapping("bye")
    public String sayGoodBye(Model model){
        model.addAttribute("username","Taehoon");
        return "goodbye";
    }
}
