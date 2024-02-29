
package com.hackandboss.ejercicio2.model.persistencia;

import com.hackandboss.ejercicio2.model.Platillo;
import com.hackandboss.ejercicio2.model.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tacte
 */
public class ControladoraPersistencia {
    
    PlatillosJpaController platilloJPA = new PlatillosJpaController();
    
    
    // Método para crear
    public void crearPlatillo(Platillo platillo) {
        
      platilloJPA.create(platillo);
    }
    
    
    // Método para borrar
    public void borrarPlatillo(int id) {
      
       try {
           
           platilloJPA.destroy(id);
       }
       catch(NonexistentEntityException ex) {
           
           Logger.getLogger(ControladoraPersistencia.class.getName())
                   .log(Level.SEVERE, null, ex);
       }
    }
    
    
    // Mtodo para traer el listado de platillos
    public List<Platillo> traerPlatillos () {
        
        return platilloJPA.findPlatillosEntities();
    }
    
    
    // Método para modificar un platillo
    public void modificarPlatillo(Platillo platillo) {
        
        try{
            platilloJPA.edit(platillo);
        }
        catch(Exception ex) {
            Logger.getLogger( ControladoraPersistencia.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
