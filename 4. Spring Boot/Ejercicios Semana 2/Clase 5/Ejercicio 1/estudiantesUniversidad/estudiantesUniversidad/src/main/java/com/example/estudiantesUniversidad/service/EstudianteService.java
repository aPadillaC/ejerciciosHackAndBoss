package com.example.estudiantesUniversidad.service;

import com.example.estudiantesUniversidad.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteService implements IEstudianteService{

    List<Estudiante> listadoEstudiantes = List.of(
            new Estudiante(1L, "Juan", "Perez", "1998-05-15"),
            new Estudiante(2L, "Maria", "Gomez", "1999-03-20"),
            new Estudiante(3L, "Pedro", "Lopez", "1997-12-10")
    );

    @Override
    public List<Estudiante> listadoEstudiantes() {

        return listadoEstudiantes;
    }
}
