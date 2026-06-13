package com.example.Journal.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="journal")
public class psqlentity {
    @Id
     private String id;
     @Column(name = "title",nullable = false)
     private String title;
     @Column(name = "description", nullable = false)
     private String description;
     public String getId() {
         return id;
     }
     public void setId(String id) {
         this.id = id;
     }
     public String getTitle() {
         return title;
     }
     public void setTitle(String title) {
         this.title = title;
     }
     public String getDescription() {
         return description;
     }
     public void setDescription(String description) {
         this.description = description;
     }

     
}
