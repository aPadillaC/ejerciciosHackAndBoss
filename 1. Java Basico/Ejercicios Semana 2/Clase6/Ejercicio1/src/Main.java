import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal
         * Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una
         * tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como
         * interfaces para modelar este sistema.

         * a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
         * id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.

         * b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia()
         * y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases,
         * deben mostrar un mensaje de qué tipo de recarga están haciendo.

         * c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega
         * atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs).
         * Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

         * d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion.
         * Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
         * Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

         * e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega
         * atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos
         * abstractos de la clase abstracta y los de la interfaz.

         * f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos,
         * camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra
         * información sobre cada uno de ellos, incluyendo el cálculo de la antigüedad y la recarga de energía o
         * combustible según corresponda.

         * g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.

         * Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación
         * del auto. Por ejemplo: 2023 - 2018= 5 años de antigüedad
         */



        /** f) **/
        System.out.println("\nf)");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1, "1234JHG", "Seat", "León", 2015, 17000, 60, 25));
        vehiculos.add(new Auto(2, "8521LKJ", "Bwm", "X5", 2020, 35000, 80, 45));

       vehiculos.add(new Camioneta(3, "4546PPO", "Mercedez", "Vito", 2010, 25000, 120, 10));
       vehiculos.add(new Camioneta(4, "9987RTY", "Renault", "Partner", 2018, 12000, 100, 11));

        vehiculos.add(new Moto(5, "4546PPO", "Honda", "CBR", 2022, 25000, 120, "En V"));
        vehiculos.add(new Moto(6, "8541DFG", "Kymco", "SPeople125", 2020, 3500, 125, "EN V"));


        for( Vehiculo veh : vehiculos) {

            System.out.println("--> Datos del vehiculo " + veh.getId());
            System.out.println(veh.toString());
            System.out.println("Antigúedad: " + veh.antiguedadVehiculo() + " años");
            System.out.println("--> Método de la interfaz");

            if( veh instanceof Electrico) {
                ((Electrico) veh).cargarEnergia();
            }
            else if( veh instanceof Combustion) {
                ((Combustion) veh).regarcarCombustible();
            }
            System.out.println();
        }



        /** g) **/
        System.out.println("\ng)");

        System.out.println("--> Recorriendo el ArrayList de Vehículos:");
        for (Vehiculo veh : vehiculos) {
            System.out.println("ID: " + veh.getId());
            System.out.println("Placa: " + veh.getPlaca());
            System.out.println("Marca: " + veh.getMarca());
            System.out.println("Modelo: " + veh.getModelo());
            System.out.println();
        }
    }
}