import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /**
         * Consigna
         *
         * 1) Inicia creando una clase Vehículo con los atributos modelo, marca y costo, luego crea una lista de
         * vehículos. Crea además los constructores de las clases y los métodos Setter y Getter.

         * 2) Crea una clase con el método main para representar un escenario donde se crea una lista de vehículos.
         *
         * 3) Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtén una lista de
         * vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
         *
         * 4) De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
         *
         * 5)  Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios mayor o
         * igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
         **/


        // 2) Creamos la lista de vehículos
        List<Vehiculo> listaVehiculos = List.of(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950)
        );



        // 3) Lista ordenada por precios de menor a mayor
        System.out.println("\n3) Lista de vehículos ordenados de menor a mayor costo:\n");
        listaVehiculos.stream()
                .sorted( (x, y) -> x.getCosto() - y.getCosto())
                .forEach( vehiculo -> System.out.println(vehiculo.toString()));


        // 4) Lista ordenada por marca y por precio
        System.out.println("\n4) Lista de vehículos ordenados por marca y precio:\n");
        listaVehiculos.stream()
                .sorted( Comparator
                        .comparing(Vehiculo::getMarca)
                        .thenComparingDouble(Vehiculo::getCosto))
                .forEach( vehiculo -> System.out.println(vehiculo.toString()));


        // 5) Extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios mayor o igual 1000
        // y por último, obtén el promedio total de precios de toda la lista de vehículos
        System.out.println("\n5.1) Lista de vehículos precio < 1000:\n");

        Predicate<Vehiculo> vehiculosFiltrados1 = vehiculo -> vehiculo.getCosto() < 1000;

        listaVehiculos.stream()
                .filter(vehiculosFiltrados1)
                .forEach( vehiculo -> System.out.println(vehiculo.toString()));


        System.out.println("\n5.2) Lista de vehículos precio >= 1000:\n");

        Predicate<Vehiculo> vehiculosFiltrados2 = vehiculo -> vehiculo.getCosto() >= 1000;

        listaVehiculos.stream()
                .filter(vehiculosFiltrados2)
                .forEach( vehiculo -> System.out.println(vehiculo.toString()));


        System.out.println("\n5.3) Promedio de precios de los vehículos\n");

        listaVehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .ifPresentOrElse(value -> System.out.printf("El precio medio de los vehículos es: %.2f"+ " €\n", value),
                        () -> System.out.println("No hay vehículos añadidos"));

    }
}