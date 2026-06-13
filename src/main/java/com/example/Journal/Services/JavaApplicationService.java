package com.example.Journal.Services;

import java.util.List;

import com.example.Journal.Entity.Entity;
import com.example.Journal.mongorepo.Journalrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.Journal.Entity.psqlentity;
import com.example.Journal.psqlrepo.psqljparepo;
@Component
public class JavaApplicationService {

     @Autowired
     private Journalrepo journalRepo;

     public void saveEntity(Entity entity) {
         journalRepo.save(entity);
     }

    @Autowired
    private psqljparepo psqlRepo;

    public void create(psqlentity entity){
        psqlRepo.save(entity);
    }

    public void deletebyid(String id)
    {
        psqlRepo.deleteById(id);
    }

    public List<psqlentity>  getall() {
        return psqlRepo.findAll();
    }
}