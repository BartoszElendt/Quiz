package com.example.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HelathcheckRestController {

    @GetMapping
    public String healthcheck(){
        return "It's working!";
    }
}
