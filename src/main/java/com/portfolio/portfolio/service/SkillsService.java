
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Skills;
import com.portfolio.portfolio.repository.SkillsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skiRepository;
    
    @Override
    public List<Skills> getSkills(){
        return skiRepository.findAll();
    }
    
    @Override
    public void crearSkills (Skills ski) {
        skiRepository.save(ski);
    }
      
    @Override
    public void deleteSkills(Long id) {
        skiRepository.deleteById(id);
    } 
    
    @Override
    public Skills buscarSkills(Long id) {
        return skiRepository.findById(id).orElse(null);
    }
    
}
