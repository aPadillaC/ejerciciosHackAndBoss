
package com.hackandboss.ejerciciovotaciones.persistencia;

import com.hackandboss.ejerciciovotaciones.logica.Voto;
import java.util.List;

public class ControladoraPersistencia {
    
    VotoJpaController votoJPA = new VotoJpaController();

    public void crearVoto(Voto selectedOption) {
        
        votoJPA.create(selectedOption);
    }

    public List<Voto> totalVoto() {
        
        return votoJPA.findVotoEntities();
    }
}
