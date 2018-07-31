package com.bit.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String ping() {
        return "Hello Boot";
    }

}