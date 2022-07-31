
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List<Skills> getSkills();
    
    public void crearSkills (Skills ski);   
          
    public void deleteSkills (Long id);
    
    public Skills buscarSkills (Long id);
    
}
