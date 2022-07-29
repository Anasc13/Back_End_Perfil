
package com.portfolio.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String mail;
    private String position;
    private String ubication;
    private String companyName;
    private String companyImg;
    private String companyUrl;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String mail, String position, String ubication, String companyName, String companyImg, String companyUrl) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.position = position;
        this.ubication = ubication;
        this.companyName = companyName;
        this.companyImg = companyImg;
        this.companyUrl = companyUrl;
    }
    
    
}
