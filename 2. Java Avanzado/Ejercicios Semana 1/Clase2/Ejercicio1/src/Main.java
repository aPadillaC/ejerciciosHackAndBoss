import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * Ejercicio Nº 1 - Simulación de un centro de atención al cliente
         *
         * • Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden
         * atender llamadas telefónicas concurrentemente.
         * • Cada agente se representa como un hilo independiente.
         * • Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada
         * llamada. Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente.
         * • Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.
         **/

        Llamada llamada1 = new Llamada("Cliente 1", "Tarifa de datos", "Resuelto");
        Llamada llamada2 = new Llamada("Cliente 2", "Facturación", "No Resuelto");
        Llamada llamada3 = new Llamada("Cliente 3", "Rooming", "Resuelto");
        Llamada llamada4 = new Llamada("Cliente 4", "Aplazamiento de terminal", "No Resuelto");
        Llamada llamada5 = new Llamada("Cliente 5", "Avería", "Resuelto");
        Llamada llamada6 = new Llamada("Cliente 6", "Varios", "No resuelto");


        ArrayList<Llamada> listadoLlamadas = new ArrayList<>();

        listadoLlamadas.add(llamada1);
        listadoLlamadas.add(llamada2);
        listadoLlamadas.add(llamada3);
        listadoLlamadas.add(llamada4);
        listadoLlamadas.add(llamada5);
        listadoLlamadas.add(llamada6);

        Agente agente1 = new Agente(1);
        Agente agente2 = new Agente(2);


        for( int i = 0; i < listadoLlamadas.size(); i++){

            if ( i % 2 == 0) {
                agente1.recibirLlamadas(listadoLlamadas.get(i));
            }
            else {
                agente2.recibirLlamadas(listadoLlamadas.get(i));
            }
        }

        agente1.start();
        agente2.start();
    }
}