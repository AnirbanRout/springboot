package com.springboot.springproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SidePage {

    @GetMapping("/greet")
    public String greet() {
        return "hello world!!";
    }

}
