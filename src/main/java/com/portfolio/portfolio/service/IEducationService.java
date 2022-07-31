
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEducation();
    
    public void crearEducation (Education edu);   
          
    public void deleteEducation (Long id);
    
    public Education buscarEducation (Long id);
}

    
    
    
    