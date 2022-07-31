package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Experience;
import com.portfolio.portfolio.repository.ExperienceRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository expeRepository;
    
    @Override
    public List<Experience> getExperience(){
        return expeRepository.findAll();
    }
    
    @Override
    public void crearExperience (Experience expe) {
        expeRepository.save(expe);
    }
      
    @Override
    public void deleteExperience (Long id) {
        expeRepository.deleteById(id);
    } 
    
    @Override
    public Experience buscarExperience (Long id) {
        return expeRepository.findById(id).orElse(null);
    }
}
