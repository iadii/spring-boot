package com.Learn.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @GetMapping
    public String getProducts(){
        return "Here are your products";
    }

    @PostMapping
    public String postProduct() {
        System.out.println("POST /api/v1/products was called");
        return "put your products";
    }

}
