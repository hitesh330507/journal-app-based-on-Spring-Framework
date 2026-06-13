package com.example.Journal.JournalApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Journal.Entity.psqlentity;
import com.example.Journal.Services.JavaApplicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/journal")
public class Journalpsql {

    @Autowired
    private JavaApplicationService javaApplicationService;
    @PostMapping("/psql")
    public boolean postMethodName(@RequestBody psqlentity entity) {
        javaApplicationService.create(entity);
        return true;
    }
    @DeleteMapping("/psql/{id}")
    public boolean deleteMethodpsql(@PathVariable String id)  {
        javaApplicationService.deletebyid(id);
        return true;
    }

    @GetMapping("/psql")
    public List<psqlentity> getallentries() {
        return javaApplicationService.getall();
    }
    
}
