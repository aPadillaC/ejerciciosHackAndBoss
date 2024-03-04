public class Main {

    public static void main(String[] args) throws ReservaInvalidaException {

        /**
         * Ejercicio Nº 1 - Reserva de Vuelos - Individual
         *
         * Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios pueden
         * realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de
         * sientos deseados. Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados
         * y maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.
         *
         * Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones
         * excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.
         */

        // Creo una instancia de Aerolinea
        Aerolinea aerolinea = new Aerolinea();

        // Creo un vuelo
        Vuelo vuelo = new Vuelo("Málaga", "15-08-2024", 5);
        aerolinea.añadirVuelo(vuelo);


        // Creo las reservas reserva

        try {
            aerolinea.reservar("Antonio Padilla", "Málaga", "15-08-2024", 3);
        } catch (ReservaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            aerolinea.reservar("Antonio Padilla", "Mallorca", "15-08-2024", 3);
        } catch (ReservaInvalidaException e) {
            System.out.println("Caso 2: " + e.getMessage());
        }

        try {
            aerolinea.reservar("Antonio Padilla", "Málaga", "15-08-2024", 8);
        } catch (ReservaInvalidaException e) {
            System.out.println("Caso 3: " + e.getMessage());
        }
    }
}