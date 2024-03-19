
package com.hackandboss.ejerciciovotaciones.logica;

import com.hackandboss.ejerciciovotaciones.persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVoto(Voto selectedOption) {
        
        controlPersis.crearVoto(selectedOption);
    }

    public Map<String, Long> totalVoto() {
        
        List<Voto> totalVoto = controlPersis.totalVoto();
        
        return totalVoto.stream()
                .collect(Collectors.groupingBy(Voto::getPartido, Collectors.counting()));
        
        
    }
    
}
