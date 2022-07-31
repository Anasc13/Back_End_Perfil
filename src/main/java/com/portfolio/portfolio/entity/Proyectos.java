
package com.portfolio.portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String img;
    private String name;
    private String description;
    private String start;
    private String finish;
    private String link;

    public Proyectos() {
    }

    public Proyectos(Long id, String img, String name, String description, String start, String finish, String link) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.description = description;
        this.start = start;
        this.finish = finish;
        this.link = link;
    }
    
    
}
