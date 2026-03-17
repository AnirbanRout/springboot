package com.springboot.springproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApp {

    @GetMapping("/")
    public String response() {
        return "reponse from the root file...";
    }

}
