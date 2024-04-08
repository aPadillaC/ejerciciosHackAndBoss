package com.example.estudiantesUniversidad.service;

import com.example.estudiantesUniversidad.dto.CalificacionesDTO;
import com.example.estudiantesUniversidad.model.Calificacion;

import java.util.List;

public interface ICalificacionesService {

    public Calificacion obtenerCalificaciones(Long numMatricula);
    public List<CalificacionesDTO> listadoCalificaciones();
}
