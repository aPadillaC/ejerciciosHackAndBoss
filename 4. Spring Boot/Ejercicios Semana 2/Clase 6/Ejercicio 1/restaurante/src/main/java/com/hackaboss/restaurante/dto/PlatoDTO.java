package com.hackaboss.restaurante.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class PlatoDTO {

    private String nombre;
    private Double cantidadCalorias;
    private IngredienteDTO ingredienteMayorCalorias;
    private List<IngredienteDTO> ingredientes;

    public PlatoDTO() {

        ingredientes = new ArrayList<>();
    }

    public PlatoDTO(String nombre, IngredienteDTO ingredienteMayorCalorias, List<IngredienteDTO> ingredientes) {

        this.nombre = nombre;
        this.ingredienteMayorCalorias = ingredienteMayorCalorias;
        this.ingredientes = ingredientes;

        cantidadCalorias = ingredientes.stream()
                .mapToDouble(IngredienteDTO::getCalories)
                .sum();
    }

}
