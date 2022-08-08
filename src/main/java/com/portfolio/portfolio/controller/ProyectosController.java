
package com.portfolio.portfolio.controller;


import com.portfolio.portfolio.entity.Proyectos;
import com.portfolio.portfolio.service.IProyectosService;
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

@CrossOrigin(origins = "https://portfolio-8b019.web.app/proyecto")
@RestController
@RequestMapping(value = "/proyecto")
public class ProyectosController {
    @Autowired 
    private IProyectosService interProyectos;
    
    @GetMapping ("/traer")
    public List<Proyectos> getProyecto(){
        return interProyectos.getProyecto();      
    }
    
    @PostMapping ("/crear")
    public void agregarProyecto(@RequestBody Proyectos proy) {
        interProyectos.crearProyecto(proy);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarProyecto (@PathVariable Long id) {
        interProyectos.deleteProyecto(id);
    }
        
    @PutMapping ("/editar/")
    public void editarProyecto(@RequestBody Proyectos proy){
        interProyectos.crearProyecto(proy);
    }
}
