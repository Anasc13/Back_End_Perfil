
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Acerca;
import com.portfolio.portfolio.repository.AcercaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class AcercaService implements IAcercaService{
    
    @Autowired
    public AcercaRepository acerRepository;
    
    @Override
    public List<Acerca> getAcerca(){
        return acerRepository.findAll();
    }
    
    @Override
    public void crearAcerca (Acerca acer) {
        acerRepository.save(acer);
    }
      
    @Override
    public void deleteAcerca (Long id) {
        acerRepository.deleteById(id);
    } 
    
    @Override
    public Acerca buscarAcerca (Long id) {
        return acerRepository.findById(id).orElse(null);
    }
    
 
}
    