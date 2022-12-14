
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
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String position;
    private String company;
    private String img;
    private String mode;
    private String start;
    private String end;
    private String timeElapsed;

    public Experience() {
    }

    public Experience(Long id, String position, String company, String img, String mode, String start, String end, String timeElapsed) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.img = img;
        this.mode = mode;
        this.start = start;
        this.end = end;
        this.timeElapsed = timeElapsed;
    }
    
 
}
