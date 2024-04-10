package com.hackaboss.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {

    private Integer id;
    private String nombre;
    private Double precio;
    private List<Integer> ingredientes;


    public Plato(Integer id, String nombre, List<Integer> ingredientes){

        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
}
