package com.example.springgreeting.controllers;

import com.example.springgreeting.Util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
    Util util = new Util();

    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/reverse")
    public StringBuilder reverse(@RequestParam("name") String name) {

        return util.reverseName(name);
    }
}
