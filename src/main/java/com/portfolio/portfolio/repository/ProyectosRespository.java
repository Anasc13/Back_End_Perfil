
package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRespository extends JpaRepository <Proyectos, Long>{
    
}
