
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Experience;
import com.portfolio.portfolio.entity.Persona;
import com.portfolio.portfolio.service.IExperienceService;
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
public class ExperienceController {
    
    @Autowired 
    private IExperienceService interExperience;
    
    @GetMapping ("/experience/traer")
    public List<Experience> getExperience(){
        return interExperience.getExperience();      
    }
    
    @PostMapping ("/experience/crear")
    public void agregarExperience(@RequestBody Experience expe) {
        interExperience. crearExperience (expe);
    }
    
    @DeleteMapping ("/experienceborrar/{id}")
    public void borrarExperience (@PathVariable Long id) {
        interExperience.deleteExperience(id);
    }
        
    @PutMapping ("/experience/editar/")
    public void editarExperience (@RequestBody Experience expe){
        interExperience.crearExperience(expe);
    }
}
