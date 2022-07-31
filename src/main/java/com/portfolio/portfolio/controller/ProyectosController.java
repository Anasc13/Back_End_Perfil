
package com.portfolio.portfolio.controller;


import com.portfolio.portfolio.entity.Proyectos;
import com.portfolio.portfolio.service.IProyectosService;
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
public class ProyectosController {
    @Autowired 
    private IProyectosService interProyectos;
    
    @GetMapping ("/proyecto/traer")
    public List<Proyectos> getProyecto(){
        return interProyectos.getProyecto();      
    }
    
    @PostMapping ("/proyecto/crear")
    public void agregarProyecto(@RequestBody Proyectos proy) {
        interProyectos.crearProyecto(proy);
    }
    
    @DeleteMapping ("/proyectoborrar/{id}")
    public void borrarProyecto (@PathVariable Long id) {
        interProyectos.deleteProyecto(id);
    }
        
    @PutMapping ("/proyecto/editar/")
    public void editarProyecto(@RequestBody Proyectos proy){
        interProyectos.crearProyecto(proy);
    }
}
