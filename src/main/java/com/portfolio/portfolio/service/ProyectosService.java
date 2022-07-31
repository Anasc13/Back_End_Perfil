
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Proyectos;
import com.portfolio.portfolio.repository.ProyectosRespository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService implements IProyectosService  {
    
    @Autowired
    public ProyectosRespository proyecRespository;
    
    @Override
    public List<Proyectos> getProyecto(){
        return proyecRespository.findAll();
    }
    
    @Override
    public void crearProyecto (Proyectos proy) {
        proyecRespository.save(proy);
    }
      
    @Override
    public void deleteProyecto(Long id) {
        proyecRespository.deleteById(id);
    } 
    
    @Override
    public Proyectos buscarProyecto (Long id) {
        return proyecRespository.findById(id).orElse(null);
    }
    
}
