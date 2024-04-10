package com.hackaboss.restaurante.service;

import com.hackaboss.restaurante.dto.PlatoDTO;
import com.hackaboss.restaurante.model.Plato;

import java.util.List;

public interface IPlatoService {


    List<Plato> getPlatos();

    PlatoDTO buscarPlato(String plato);

}
