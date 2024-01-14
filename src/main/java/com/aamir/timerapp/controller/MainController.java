package com.aamir.timerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//@RestController
@Controller
@RequestMapping("/api")
public class MainController {

    @RequestMapping("/time")
    public String getTimer(){
        return LocalDateTime.now().toString();
    }

    @GetMapping("/timer")
    public String getTimerPage(){
        return "timer";
    }
}
