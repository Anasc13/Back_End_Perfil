
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Education;
import com.portfolio.portfolio.repository.EducationRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService implements IEducationService {
    
    @Autowired
    public EducationRepository eduRepository;
    
    @Override
    public List<Education> getEducation(){
        return eduRepository.findAll();
    }
    
    @Override
    public void crearEducation(Education edu) {
        eduRepository.save(edu);
    }
      
    @Override
    public void deleteEducation(Long id) {
        eduRepository.deleteById(id);
    } 
    
    @Override
    public Education buscarEducation(Long id) {
        return eduRepository.findById(id).orElse(null);
    }
    
}
