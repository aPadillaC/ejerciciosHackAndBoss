
package com.hackandboss.ejerciciovotaciones.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Voto implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String partido;

    public Voto() {
    }
    
    

    public Voto(int id, String partido) {
        this.id = id;
        this.partido = partido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Voto{" + "partido=" + partido + '}';
    }
    
    
}
