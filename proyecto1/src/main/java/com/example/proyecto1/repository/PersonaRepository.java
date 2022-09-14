package com.example.proyecto1.repository;

import com.example.proyecto1.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona,String> {
}
