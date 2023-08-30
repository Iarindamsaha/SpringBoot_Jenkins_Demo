package com.example.jenkins.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class MyController {

    @GetMapping("/{name}")
    public String returnName(@PathVariable String name){

        return "Hello , " + name + " . Welcome To Our Demo Project";

    }
}
