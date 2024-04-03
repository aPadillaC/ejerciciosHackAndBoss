package com.hackaboss.gestionEventosAcademicos.controller;

import com.hackaboss.gestionEventosAcademicos.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("eventos")
public class EventoController {

    List<Evento> listaEventos = new ArrayList<>();

    // Crear evento
    @PostMapping
    public String crearEvento(@RequestBody Evento evento){

        listaEventos.add(evento);

        return "Creado el evento " + evento.getTitulo() + " con ID " + evento.getId();
    }



    // Ver listado eventos
    @GetMapping
    public List<Evento> listadoEventos() {

        return listaEventos;
    }



    // Ver un evento por ID
    @GetMapping("/{id}")
    public Evento verEvento( @PathVariable int id) {

        return listaEventos.stream()
                .filter( evento -> evento.getId() == id)
                .findFirst()
                .orElse(new Evento());
    }
}
