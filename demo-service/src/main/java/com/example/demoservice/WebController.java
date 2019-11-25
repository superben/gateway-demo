package com.example.demoservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/echo")
    public String echo() {
        return "hello";
    }
}
