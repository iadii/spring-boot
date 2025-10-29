package com.Basic.learn.routes;

import com.Basic.learn.controller.Car;
import com.Basic.learn.controller.Padhai;
import com.Basic.learn.controller.Postin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {

    @Autowired
    private Car car;

    @Autowired
    private Padhai pd;

    @Autowired
    private Postin postin;

    @GetMapping("")
    public String sayHello() {
        return car.fun();
    }


    @GetMapping("/sum")
    public int summation(@RequestParam int a, @RequestParam int b) {
        return pd.Sum(a,b);
    }

    @PostMapping("/hii")
    public String hii(@RequestParam String a, @RequestParam String b) {
        return postin.method(a, b);
    }
}
