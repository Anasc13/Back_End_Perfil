
package com.portfolio.portfolio.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String percentage;

    public Skills() {
    }

    public Skills(Long id, String name, String percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
    
    
}
  
