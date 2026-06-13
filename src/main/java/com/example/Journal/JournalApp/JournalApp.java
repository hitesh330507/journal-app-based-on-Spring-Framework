package com.example.Journal.JournalApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Journal.Entity.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// @SuppressWarnings("unused")
@RestController
@RequestMapping("/journal")
public class JournalApp {
    // private Entity entity;
    Map<Long, Entity> entityMap = new HashMap<>();

    @PostMapping()
    public Map<Long, Entity> postMethodName(@RequestBody List<Entity> entity) {
        for (Entity e : entity)
            entityMap.put(Long.parseLong(e.getId()), e);
        return entityMap;
    }

    @GetMapping()
    public Map<Long, Entity> getMethodName() {
        return entityMap;
    }

    @PutMapping("/{id}")
    public Map<Long, Entity> postMethodName(@PathVariable Long id, @RequestBody Entity entity) {
        entityMap.put(id, entity);
        return entityMap;
    }

    @DeleteMapping("/{id}")
    public Map<Long, Entity> deleteMethodName(@PathVariable Long id) {
        entityMap.remove(id);
        return entityMap;
    }

    @GetMapping("/{id}")
    public Entity getMethodName(@PathVariable Long id) {
        return entityMap.get(id);
    }
}
