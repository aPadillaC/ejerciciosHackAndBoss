
package com.hackandboss.torneobasket.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Partido implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    
    @OneToOne
    private Equipo equipo1;
    
    @OneToOne
    private Equipo equipo2;
    
    private int resEquip1;
    private int resEquip2;

    public Partido() {
    }

    public Partido(int id, LocalDate fecha, Equipo equipo1, Equipo equipo2, int resEquip1, int resEquip2) {
        this.id = id;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resEquip1 = resEquip1;
        this.resEquip2 = resEquip2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getResEquip1() {
        return resEquip1;
    }

    public void setResEquip1(int resEquip1) {
        this.resEquip1 = resEquip1;
    }

    public int getResEquip2() {
        return resEquip2;
    }

    public void setResEquip2(int resEquip2) {
        this.resEquip2 = resEquip2;
    }
    
    
    
    
}
