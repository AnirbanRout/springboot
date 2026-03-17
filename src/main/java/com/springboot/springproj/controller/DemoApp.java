package com.springboot.springproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApp {

    @GetMapping("/")
    public String response() {
        return "home page...";
    }

    @GetMapping("/login")
    public String res2() {
        return "<h1>login page</h1>";
    }

    @GetMapping("/register")
    public String res3() {
        return "registration page...";
    }

    @GetMapping("/help")
    public String res4() {
        return "help page...";
    }

}
