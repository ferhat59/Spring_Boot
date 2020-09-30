package com.springdocker.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Control {
    @GetMapping
    public String mesaj() {
        return "HELLO WORLD";
    }
}
