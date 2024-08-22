package com.example.getmap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowrld {
	
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
