package com.example.Journal.mongorepo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.Journal.Entity.Entity;
public interface Journalrepo extends MongoRepository<Entity,String>{
    
}


