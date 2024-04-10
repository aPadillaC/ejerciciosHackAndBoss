package com.hackaboss.restaurante.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.restaurante.dto.IngredienteDTO;
import com.hackaboss.restaurante.model.Ingrediente;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Service
public class IngredienteService implements IIngredienteService{

    private List<Ingrediente> ingredientes = loadDataBase();

    private List<Ingrediente> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
        List<Ingrediente> ingre= null;
        try {
            ingre= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingre;
    }


    public List<Ingrediente> getIngredientes(){

        return ingredientes;
    }

    @Override
    public IngredienteDTO buscarIngredienteID(Integer id) {


        return ingredientes.stream()
                .filter( i -> i.getId().equals(id))
                .findFirst()
                .map(IngredienteService::toIngredienteDTO)
                .orElse(new IngredienteDTO());

    }


    private static IngredienteDTO toIngredienteDTO(Ingrediente ingrediente) {

        return new IngredienteDTO(ingrediente.getName(), ingrediente.getCalories());
    }
}
