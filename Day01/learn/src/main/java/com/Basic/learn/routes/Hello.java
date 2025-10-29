package com.Basic.learn.routes;

import com.Basic.learn.controller.Car;
import com.Basic.learn.controller.Padhai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public int summation(@RequestParam int a, @RequestParam int b) {
        return pd.Sum(a,b);
    }
}
