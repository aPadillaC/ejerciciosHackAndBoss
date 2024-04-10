package com.hackaboss.restaurante.service;

import com.hackaboss.restaurante.dto.IngredienteDTO;
import com.hackaboss.restaurante.model.Ingrediente;

import java.util.List;

public interface IIngredienteService {

    List<Ingrediente> getIngredientes();

    IngredienteDTO buscarIngredienteID(Integer id);

}
