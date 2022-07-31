
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void crearPersona (Persona perso);   
          
    public void deletePersona (Long id);
    
    public Persona buscarPersona (Long id);
    
}
