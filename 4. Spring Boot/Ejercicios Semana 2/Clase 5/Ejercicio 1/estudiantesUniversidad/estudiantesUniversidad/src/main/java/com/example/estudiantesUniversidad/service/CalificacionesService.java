package com.example.estudiantesUniversidad.service;

import com.example.estudiantesUniversidad.dto.CalificacionesDTO;
import com.example.estudiantesUniversidad.model.Calificacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionesService implements ICalificacionesService{

    IEstudianteService iEstudianteService = new EstudianteService();
    List<Calificacion> listadoCalificaciones = List.of(
            new Calificacion(1, 8.0, 7.5, 9.0, 8.16, iEstudianteService.listadoEstudiantes().get(0)),
            new Calificacion(2, 7.0, 8.5, 8.0, 7.83, iEstudianteService.listadoEstudiantes().get(1)),
            new Calificacion(3, 9.0, 9.5, 8.5, 9.0, iEstudianteService.listadoEstudiantes().get(2))
    );

    @Override
    public Calificacion obtenerCalificaciones(Long numMatricula) {
        return listadoCalificaciones.stream()
                .filter( calif -> calif.getAlumno().getNumMatricula().equals(numMatricula))
                .findFirst()
                .orElse(new Calificacion());
    }

    @Override
    public List<CalificacionesDTO> listadoCalificaciones() {
        return listadoCalificaciones.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPromedio(), c1.getPromedio()))
                .map( calificacion -> new CalificacionesDTO(calificacion.getCalificacion1(),
                        calificacion.getCalificacion2(), calificacion.getCalificacion3(), calificacion.getAlumno().getNombre()))
                .toList();

    }
}
