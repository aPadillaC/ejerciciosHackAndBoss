
package com.hackandboss.torneobasket.persistencia;

import com.hackandboss.torneobasket.logica.Equipo;
import com.hackandboss.torneobasket.logica.Partido;
import java.util.List;


public class ControladoraPersistencia {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();

    public void crearEquipo(Equipo equipo) {
        
        equipoJPA.create(equipo);
    }

    public List<Equipo> listaEquipos() {
        
        return equipoJPA.findEquipoEntities();
    }

    public Equipo buscarEquipo(int id) {
        
        return equipoJPA.findEquipo(id);
    }

    public void crearPartido(Partido partido) {
        
        partidoJPA.create(partido);
    }

    public List<Partido> listaPartidos() {
        
        return partidoJPA.findPartidoEntities();
    }
    
}
