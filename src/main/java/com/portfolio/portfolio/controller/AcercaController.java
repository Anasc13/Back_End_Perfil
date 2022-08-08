
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.entity.Acerca;
import com.portfolio.portfolio.service.IAcercaService;
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


@CrossOrigin(origins = "https://portfolio-8b019.web.app/portfolio/acerca")
@RestController
@RequestMapping(value = "/acerca")
public class AcercaController {
    @Autowired 
    IAcercaService interAcerca;
    
    
    @GetMapping ("/traer")
       public  List<Acerca> getAcerca(){
        return interAcerca.getAcerca();      
    }
    
    @PostMapping ("/crear")
    public void agregarAcerca (@RequestBody Acerca acer) {
        interAcerca.crearAcerca(acer);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarAcerca (@PathVariable Long id) {
        interAcerca.deleteAcerca(id);
    }
        
    @PutMapping ("/editar/")
    public void editarAcerca (@RequestBody Acerca acer){
        interAcerca.crearAcerca(acer);
    }
}
