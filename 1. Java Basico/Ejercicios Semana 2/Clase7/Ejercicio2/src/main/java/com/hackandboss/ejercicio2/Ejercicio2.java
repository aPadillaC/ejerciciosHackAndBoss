
package com.hackandboss.ejercicio2;

import com.hackandboss.ejercicio2.model.Platillo;
import com.hackandboss.ejercicio2.model.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author tacte
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        // Creamos una instancia de la clase Platillo
        Platillo platillo1 = new Platillo("Paella", "Libro secreto", 44);
      
        // Se envia el objetoa la BBDD
        controlPersis.crearPlatillo(platillo1);
      
        controlPersis.crearPlatillo(new Platillo ("Pizza", "Receta 100% italiana", 23));
        controlPersis.crearPlatillo(new Platillo ("Puchero", "Como el de tu abuela", 35));
      
      
        // Borramos un platillo por su id
        controlPersis.borrarPlatillo(2);
      
      
        // Editamos uno de los platillos
        platillo1.setPrecio(35);
        controlPersis.modificarPlatillo(platillo1);
      
      
        // Mostrar todos los platillos guardandolos en una List
        List<Platillo> listadoPlatillos = controlPersis.traerPlatillos();
        
        // Recorremos la List de platillos con for each
        System.out.println("----Lista de platillos----");
        for (Platillo platillo : listadoPlatillos) {
           System.out.println(platillo.toString());
        }
    }
}
