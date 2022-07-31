
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> getExperience();
    
    public void crearExperience (Experience expe);   
          
    public void deleteExperience (Long id);
    
    public Experience buscarExperience (Long id);
}
