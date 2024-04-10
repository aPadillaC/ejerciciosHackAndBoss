package com.hackaboss.restaurante.controller;

import com.hackaboss.restaurante.dto.IngredienteDTO;
import com.hackaboss.restaurante.dto.PlatoDTO;
import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.model.Plato;
import com.hackaboss.restaurante.service.IIngredienteService;
import com.hackaboss.restaurante.service.IPlatoService;
import com.hackaboss.restaurante.service.IngredienteService;
import com.hackaboss.restaurante.service.PlatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class restauranteController {

    IIngredienteService ingredienteService = new IngredienteService();
    IPlatoService platoService = new PlatoService();



    @GetMapping("/ingredientes")
    public List<Ingrediente> getIngredientes() {

        return ingredienteService.getIngredientes();

    }

    @GetMapping("/platos")
    public List<Plato> getPlatos() {

        return platoService.getPlatos();

    }


    @GetMapping("/verPlato/{plato}")
    public PlatoDTO verPlato(@PathVariable String plato) {

        return platoService.buscarPlato(plato);
    }
}
