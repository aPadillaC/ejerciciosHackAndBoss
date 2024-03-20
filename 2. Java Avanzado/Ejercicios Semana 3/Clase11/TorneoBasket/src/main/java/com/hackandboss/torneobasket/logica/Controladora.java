
package com.hackandboss.torneobasket.logica;

import com.hackandboss.torneobasket.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> listaEquipos() {
        
        return controlPersis.listaEquipos();
    }

    public void crearPartido(Partido partido) {
        
        controlPersis.crearPartido(partido);
    }

    public Equipo buscarEquipo(int id) {
        
        return controlPersis.buscarEquipo(id);
    }

    public List<Partido> listaPartidos() {
        
        return controlPersis.listaPartidos();
    }
    
}
