
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> getProyecto();
    
    public void crearProyecto (Proyectos proy);   
          
    public void deleteProyecto (Long id);
    
    public Proyectos buscarProyecto (Long id);
    
}
