package com.hackaboss.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private Integer id;
    private String name;
    private Double calories;


}
