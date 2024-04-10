package com.hackaboss.restaurante.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.restaurante.dto.IngredienteDTO;
import com.hackaboss.restaurante.dto.PlatoDTO;
import com.hackaboss.restaurante.model.Ingrediente;
import com.hackaboss.restaurante.model.Plato;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class PlatoService implements IPlatoService{

    IIngredienteService ingredienteService = new IngredienteService();

    private List<Plato> platos = loadDataBase();

    private List<Plato> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Plato>> typeRef = new TypeReference<>() {};
        List<Plato> listaPlatos= null;
        try {
            listaPlatos= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPlatos;
    }

    @Override
    public List<Plato> getPlatos(){

        return platos;
    }

    @Override
    public PlatoDTO buscarPlato(String plato) {

        Plato platoBuscado = platos.stream()
                .filter( p -> p.getNombre().equalsIgnoreCase(plato))
                .findFirst()
                .orElse(new Plato());

        return toPlatoDTO(platoBuscado);
    }


    private PlatoDTO toPlatoDTO(Plato plato) {

        List<IngredienteDTO> ingredientesDTO = plato.getIngredientes().stream()
                .map( ing -> ingredienteService.buscarIngredienteID(ing))
                .toList();

        IngredienteDTO ingredienteMayorCalorias = ingredientesDTO.stream()
                .sorted(Comparator.comparingDouble(IngredienteDTO::getCalories).reversed())
                .findFirst()
                .orElse(new IngredienteDTO());

        return new PlatoDTO(plato.getNombre(), ingredienteMayorCalorias, ingredientesDTO);
    }

}
