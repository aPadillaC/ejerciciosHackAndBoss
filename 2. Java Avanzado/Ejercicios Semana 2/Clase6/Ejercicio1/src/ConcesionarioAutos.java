import java.util.List;

public class ConcesionarioAutos {

    public static void main(String[] args) {

        /**
         * Ejercicio 1: Concesionaria de Autos
         *
         * Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una
         * clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos
         * con métodos genéricos para realizar las siguientes operaciones:
         *
         * Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
         *
         * Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro
         * del inventario.
         *
         * Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos
         * los autos en el inventario.
         **/


        // Agregamos autos
        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();

        inventarioAutos.agregaarAuto( new Auto("Seat", "León", 2015, 17000));
        inventarioAutos.agregaarAuto( new Auto("Ford", "Fiesta", 2009, 2000));
        inventarioAutos.agregaarAuto( new Auto("Peugeot", "5008 Allure", 2012, 32000));
        inventarioAutos.agregaarAuto( new Auto("Skoda", "Octavia", 2009, 4000));
        inventarioAutos.agregaarAuto( new Auto("Seat", "Ibiza", 2021, 15000));
        inventarioAutos.agregaarAuto( new Auto("Renault", "Clio", 2009, 1500));
        inventarioAutos.agregaarAuto( new Auto("Seat", "Altea XL", 2011, 3500));


        // Buscamos por año
        System.out.println("\n--> Listado autos por año buscado: ");
        inventarioAutos.buscarAutoPorAño(2009);


        // Buscamos por marca
        System.out.println("\n--> Listado autos por marca buscada: ");
        inventarioAutos.buscarAutoPormarca("Seat");


        // Valor total del inventario
        inventarioAutos.valorInventario();

    }
}