
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Education;
import com.portfolio.portfolio.service.IEducationService;
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

@CrossOrigin(origins = "https://portfolio-8b019.web.app/portfolio/education")
@RestController
@RequestMapping(value = "/education")
public class EducationController {
    
    @Autowired 
    IEducationService interEducation;
    
    @GetMapping ("/traer")
    public List<Education> getEducation(){
        return interEducation.getEducation();      
    }
    
    @PostMapping ("/crear")
    public void agregarEducation(@RequestBody Education edu) {
        interEducation.crearEducation(edu);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarEducation (@PathVariable Long id) {
        interEducation.deleteEducation(id);
    }
        
    @PutMapping ("/editar/")
    public void editarEducation (@RequestBody Education edu){
        interEducation.crearEducation(edu);
    }
}
