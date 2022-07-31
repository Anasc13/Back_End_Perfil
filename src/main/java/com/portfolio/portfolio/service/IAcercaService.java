
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Acerca;
import java.util.List;

public interface IAcercaService {
    
    public List<Acerca> getAcerca ();
    
    public void crearAcerca (Acerca acer);   
          
    public void deleteAcerca (Long id);
    
    public Acerca buscarAcerca (Long id);
}
