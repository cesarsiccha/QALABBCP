package com.example.proyecto1.controller;

import com.example.proyecto1.model.Persona;
import com.example.proyecto1.repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @GetMapping("/listado")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> getAllPerson(){
        LOGGER.info("Hizo la peticion de listado");
        return personaRepository.findAll();
    }


    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public void createPerson(@RequestBody Persona persona){
        LOGGER.info("Hizo la peticion de nuevo");

        personaRepository.save(persona);
    }

    @GetMapping("/obtener/{idPersona}")
    public ResponseEntity<Persona> getPerson(@PathVariable(value = "idPersona") String idPersona){

        LOGGER.info("Hizo la peticion de obtener por id");
        Optional<Persona> persona=personaRepository.findById(idPersona);
        if(persona.isPresent()){
            return new ResponseEntity<>(persona.get(),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(persona.get(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{idPersona}")
    public String deletePerson(@PathVariable(value = "idPersona") String idPersona){
        LOGGER.info("Hizo la peticion de eliminar por id");
        personaRepository.deleteById(idPersona);

        return "Se elimino correctamente el producto";
    }

    @PutMapping("/actualizar/{idPersona}")
    public Persona updatePerson(@RequestBody Persona persona,@PathVariable(value = "idPersona") String idPersona){

        LOGGER.info("Hizo la peticion de actualizar");
        persona.setIdPersona(idPersona);
        personaRepository.save(persona);

        return persona;
    }
}
