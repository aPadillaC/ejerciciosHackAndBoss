package com.hackaboss.generadorDatosCuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class DatosCuriosos {

    @GetMapping
    public String darDato() {

            Random random = new Random();

            List<String> listaRefranes = List.of(
                    "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo",
                    "Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso",
                    "Australia es más ancha que la Luna", "La gente es más creativa en la ducha",
                    "Venus es el único planeta que gira en el sentido de las agujas del reloj");


            String refranSeleccionado = listaRefranes.get(random.nextInt(listaRefranes.size()));

            return refranSeleccionado;
    }
}
