package com.example.estudiantesUniversidad.controller;

import com.example.estudiantesUniversidad.dto.CalificacionesDTO;
import com.example.estudiantesUniversidad.model.Calificacion;
import com.example.estudiantesUniversidad.model.Estudiante;
import com.example.estudiantesUniversidad.service.CalificacionesService;
import com.example.estudiantesUniversidad.service.EstudianteService;
import com.example.estudiantesUniversidad.service.ICalificacionesService;
import com.example.estudiantesUniversidad.service.IEstudianteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GestionNotasController {

    IEstudianteService iEstudianteService;
    ICalificacionesService iCalificacionesService;

    public GestionNotasController() {

        iEstudianteService = new EstudianteService();
        iCalificacionesService = new CalificacionesService();
    }

    // Alumnos

    @GetMapping("/alumnos")
    public List<Estudiante> estudiantes() {

        return iEstudianteService.listadoEstudiantes();
    }


    // Calificaciones

    @GetMapping("/calificaciones/{numMatricula}")
    public Calificacion calificacionesEstudiante(@PathVariable Long numMatricula) {

        return iCalificacionesService.obtenerCalificaciones(numMatricula);
    }


    @GetMapping("/calificaciones/ordendesc")
    public List<CalificacionesDTO> calificaciones() {

        return iCalificacionesService.listadoCalificaciones();
    }

}
