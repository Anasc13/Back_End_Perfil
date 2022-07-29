
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Persona;
import com.portfolio.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    public PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersonas(){
        return persoRepository.findAll();
    }
    
    @Override
    public void crearPersona(Persona perso) {
        persoRepository.save(perso);
    }
      
    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    } 
    
    @Override
    public Persona buscarPersona(Long id) {
        return persoRepository.findById(id).orElse(null);
    }
    
}
