package com.example.Journal.psqlrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Journal.Entity.psqlentity;

public interface psqljparepo extends JpaRepository<psqlentity, String> {
    
}
