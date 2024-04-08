package com.example.estudiantesUniversidad.dto;

import com.example.estudiantesUniversidad.model.Estudiante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class CalificacionesDTO {

    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private String nombreEstudiante;
}
