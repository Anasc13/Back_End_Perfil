
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
public class Acerca implements Serializable  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String about;

    public Acerca() {
    }

    public Acerca(Long id, String about) {
        this.id = id;
        this.about = about;
    }

}
