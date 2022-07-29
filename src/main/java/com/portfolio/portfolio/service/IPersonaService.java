
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersonas ();
    
    public void crearPersona (Persona perso);   
          
    public void deletePersona (Long id);
    
    public Persona buscarPersona (Long id);
    
}
