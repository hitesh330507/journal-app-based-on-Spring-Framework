package com.example.Journal.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "journal")
public class Entity {
    @Id
    private String id;
    private String title;
    private String description;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
