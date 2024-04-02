package com.hackaboss.conversorUnidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class ConversorUnidadesController {

    @GetMapping("/{centimetros}")
    public String conversorCentimetrosAMetros(@PathVariable double centimetros) {

        return centimetros + " centímetros equivale a " + centimetros/100 + " metros";
    }


}
