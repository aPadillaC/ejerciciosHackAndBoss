package com.example.estudiantesUniversidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private Long numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

}
