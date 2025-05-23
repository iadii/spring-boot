package com.eazybytes.eazystore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Adii";
    }

    @PutMapping("/hello")
    public String sayHelloPut() {
        return "Hello put method";
    }

    @PostMapping("/hello")
    public String sayHelloPost() {
        return "Hello post method";
    }
}
