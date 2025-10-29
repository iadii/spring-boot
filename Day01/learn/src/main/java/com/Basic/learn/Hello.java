package com.Basic.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private Car car;

    @Autowired
    private Padhai pd;

    @GetMapping("")
    public String sayHello() {
        return car.fun();
    }
    

    @GetMapping("/sum")
    public int summation() {
        return pd.Sum();
    }
}
