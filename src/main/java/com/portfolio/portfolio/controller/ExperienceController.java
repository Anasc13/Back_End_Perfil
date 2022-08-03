
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Experience;
import com.portfolio.portfolio.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-8b019.web.app/education/")
@RestController
@RequestMapping(value = "/experience")
public class ExperienceController {
    
    @Autowired 
    IExperienceService interExperience;
    
    @GetMapping ("/traer")
    public List<Experience> getExperience(){
        return interExperience.getExperience();      
    }
    
    @PostMapping ("/crear")
    public void agregarExperience(@RequestBody Experience expe) {
        interExperience. crearExperience (expe);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarExperience (@PathVariable Long id) {
        interExperience.deleteExperience(id);
    }
        
    @PutMapping ("/editar/")
    public void editarExperience (@RequestBody Experience expe){
        interExperience.crearExperience(expe);
    }
}
