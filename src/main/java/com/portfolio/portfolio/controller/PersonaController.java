
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Persona;
import com.portfolio.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired 
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersona();      
    }
    
    @PostMapping ("/personas/crear")
    public void agregarPersona(@RequestBody Persona perso) {
        interPersona.crearPersona(perso);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarPersona (@PathVariable Long id) {
        interPersona.deletePersona(id);
    }
        
    @PutMapping ("/personas/editar/")
    public void editarPersona (@RequestBody Persona perso){
        interPersona.crearPersona(perso);
    }
}
