import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 2 - Simulación de cadena de producción

         * • Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden
         * realizar tareas concurrentemente.
         * • Cada trabajador se representa como un hilo independiente.
         * • Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad
         * y embalar productos.
         * • Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo
         * de la fábrica.
         * • Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de
         * coordinación entre las tareas.
         **/

        ArrayList<Tarea> listaTareas = new ArrayList<>();

        listaTareas.add(new Tarea("Tarea1", "estación1"));
        listaTareas.add(new Tarea("Tarea2", "estación2"));
        listaTareas.add(new Tarea("Tarea3", "estación3"));
        listaTareas.add(new Tarea("Tarea4", "estación1"));
        listaTareas.add(new Tarea("Tarea5", "estación2"));
        listaTareas.add(new Tarea("Tarea6", "estación3"));
        listaTareas.add(new Tarea("Tarea7", "estación1"));
        listaTareas.add(new Tarea("Tarea8", "estación2"));
        listaTareas.add(new Tarea("Tarea9", "estación3"));



        Trabajador trabajador1 = new Trabajador("Trabajador1");
        Trabajador trabajador2 = new Trabajador("Trabajador2");

        Random random = new Random();


        for( int i = 0; i < listaTareas.size(); i++){

            int filtro = random.nextInt(2);
            
            if ( filtro % 2 == 0) {
                trabajador1.añadirTarea(listaTareas.get(i));
            }
            else {
                trabajador2.añadirTarea(listaTareas.get(i));
            }
        }


        // Iniciar los trabajadores
        trabajador1.start();
        trabajador2.start();


    }
}