package com.example.datdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "hello Dat";
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world";
    }
}
