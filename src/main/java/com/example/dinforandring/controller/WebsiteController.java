package com.example.dinforandring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("/")
    public String forside(){
        return "home/forside";
    }

    @GetMapping("/om")
    public String om(){
        return "om/om";
    }

    @GetMapping("/sessioner")
    public String sessioner(){
        return "sessioner/sessioner";
    }
}
