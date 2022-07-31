
package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    }
