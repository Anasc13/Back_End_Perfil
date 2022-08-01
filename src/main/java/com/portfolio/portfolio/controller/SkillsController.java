
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Skills;
import com.portfolio.portfolio.service.ISkillsService;
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
@RequestMapping(value = "/skills")
public class SkillsController {
    
    @Autowired 
    private ISkillsService interSkills;
    
    @GetMapping ("/traer")
    public List<Skills> getSkills(){
        return interSkills.getSkills();      
    }
    
    @PostMapping ("/crear")
    public void agregarSkills(@RequestBody Skills ski) {
        interSkills.crearSkills(ski);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarSkills (@PathVariable Long id) {
        interSkills.deleteSkills(id);
    }
        
    @PutMapping ("/editar/")
    public void editarSkills (@RequestBody Skills ski){
        interSkills.crearSkills(ski);
    }
    
}
