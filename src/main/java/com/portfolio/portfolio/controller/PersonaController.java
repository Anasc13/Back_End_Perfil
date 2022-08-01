
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Persona;
import com.portfolio.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
@RestController
@RequestMapping(value = "/personas")
public class PersonaController {
    
    @Autowired 
    private IPersonaService interPersona;
    
    @GetMapping ("/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersona();      
    }
    
    @PostMapping ("/crear")
    public void agregarPersona(@RequestBody Persona perso) {
        interPersona.crearPersona(perso);
    }
    
    @DeleteMapping ("borrar/{id}")
    public void borrarPersona (@PathVariable Long id) {
        interPersona.deletePersona(id);
    }
        
    @PutMapping ("/editar/")
    public void editarPersona (@RequestBody Persona perso){
        interPersona.crearPersona(perso);
    }
}
