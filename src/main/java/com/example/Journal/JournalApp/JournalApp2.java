package com.example.Journal.JournalApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Journal.Entity.Entity;
import com.example.Journal.Services.JavaApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/journal")
public class JournalApp2 {
    @Autowired
    private JavaApplicationService javaApplicationService;
    @PostMapping("/db")
    public String postMethodName(@RequestBody Entity entity) {
        javaApplicationService.saveEntity(entity);
        return "true";
    }
    
}
