public class Main {
    public static void main(String[] args) {

        /** Ejercicio Nº 1 - Repaso POO - Grupal

         Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase llamada Verdura, que tenga los siguientes atributos: id, nombre, color, calorías, debeCocinarse (tener en cuenta todos sus atributos, constructores, métodos getters y setters).

         Luego, realiza las siguientes acciones:

         a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. Crear 5 verduras y guardarlas en el vector.

         b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.

         c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de todas las verduras luego del cambio.

         d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.

         División de tareas GRUPALES
         **/


        // a)
        Verdura[] verduras = new Verdura[5];

        verduras[0] = new Verdura(1, "Tomate", "Rojo", 22, "No");
        verduras[1] = new Verdura(2, "Lechuga", "Verde", 15, "No");
        verduras[2] = new Verdura(3, "Berenjena", "Morado", 25, "Si");
        verduras[3] = new Verdura(4, "Calabacín", "Verde", 17, "Si");
        verduras[4] = new Verdura(5, "Pepino", "Verde", 15, "No");


        // b)
        System.out.println("b)");
        for (int i = 0; i < verduras.length; i++){

            System.out.println("Nombre: " + verduras[i].getNombre() + ". Calorías: " + verduras[i].getCalorias());
        }


        // b)
        System.out.println("c)");

        //Cambio los datos de la verdura[3]
        verduras[3].setId(8);
        verduras[3].setNombre("Coliflor");
        verduras[3].setColor("Blanco");
        verduras[3].setCalorias(25);
        verduras[3].setDebeCocinarse("Si");


        //Cambio los datos de la verdura[4]
        verduras[4].setId(10);
        verduras[4].setNombre("Habichuela");
        verduras[4].setColor("Verde");
        verduras[4].setCalorias(31);
        verduras[4].setDebeCocinarse("Si");

        System.out.println("\n--> Información tras la actualización de datos:\n");

        for (int i = 0; i < verduras.length; i++){

            System.out.println("Nombre: " + verduras[i].getNombre() + ". Calorías: " + verduras[i].getCalorias());
        }


        // d)
        System.out.println("\nd)");
        System.out.println("--> Información de las verduras de color verde:\n");

        for ( int i = 0; i < verduras.length; i++){

            if (verduras[i].getColor().equalsIgnoreCase("Verde")){

                System.out.println(i+1 + "." + verduras[i].toString());
            }
        }
    }
}