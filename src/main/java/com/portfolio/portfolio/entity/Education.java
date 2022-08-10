
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
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String school;
    private String title;
    private String img;
    private String career;
    private String score;
    private String start;
    private String end;

    public Education() {
    }

    public Education(Long id, String school, String title, String img, String career, String score, String start, String end) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.score = score;
        this.start = start;
        this.end = end;
    }

    
    
}
