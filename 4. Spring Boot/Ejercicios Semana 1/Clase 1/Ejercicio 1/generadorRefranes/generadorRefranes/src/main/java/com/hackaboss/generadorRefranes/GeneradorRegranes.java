package com.hackaboss.generadorRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class GeneradorRegranes {

    @GetMapping
    public String enviarRefran() {

        Random random = new Random();

        List<String> listaRefranes = List.of("No hay mal que por bien no venga", "Al que madruga Dios le ayuda",
                "Cuando el río suena, agua lleva", "La primavera, la sangre altera");


        String refranSeleccionado = listaRefranes.get(random.nextInt(4));

        return refranSeleccionado;
    }
}
