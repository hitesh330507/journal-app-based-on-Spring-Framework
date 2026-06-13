package com.example.Journal.Health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthchecker {
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
