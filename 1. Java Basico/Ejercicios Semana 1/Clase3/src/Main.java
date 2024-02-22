public class Main {

    public static void main(String[] args) {

        System.out.println("\n----------- Ejercicio nº1 -----------");

        /**
         * Ejercicio Nº 1 - Clases y Objetos - Individual
         *
         * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no
         * llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
         *
         * Luego, realiza las siguientes acciones:
         *
         * a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
         *
         * b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
         *
         * c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con
         * parámetros.
         *
         * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser
         * así… ¿Qué valor se obtiene?
          **/

        // a)

        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Philips", "3X60",
                456, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Lg", "300T",
                388, "Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Siemens", "RXT3",
                512, "Gris");


        // b)

        Electrodomestico electrodomestico4 = new Electrodomestico();


        // c)
        System.out.println("c)");
        System.out.println("Marca: " + electrodomestico1.getMarca() + ". Modelo: " + electrodomestico1.getModelo() +
                ". Consumo energético: " + electrodomestico1.getConsumo());
        System.out.println("Marca: " + electrodomestico2.getMarca() + ". Modelo: " + electrodomestico2.getModelo() +
                ". Consumo energético: " + electrodomestico2.getConsumo());
        System.out.println("Marca: " + electrodomestico3.getMarca() + ". Modelo: " + electrodomestico3.getModelo() +
                ". Consumo energético: " + electrodomestico3.getConsumo());



        // d)
        System.out.println("\nd)");
        System.out.println("Marca: " + electrodomestico4.getMarca()); // Se obtiene el valor de "null" ya que no se ha
                                                                        // instanciado en el constructor.



        System.out.println("\n\n----------- Ejercicio nº2 -----------");


        /**
         * Ejercicio Nº 2 - POO - Individual
         *
         * Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
         *
         * a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
         *
         * b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
         *
         * c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el
         * después de los datos de las dos personas cuyos nombres fueron cambiados.
         *
         * d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
         */



        // a)
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, "Antonio", 35, "Calle A", "888888888");
        personas[1] = new Persona(2, "Carmen", 34, "Calle B", "777777777");
        personas[2] = new Persona(3, "Alejandra", 14, "Calle C", "999999999");
        personas[3] = new Persona(4, "Tiago", 4, "Calle D", "111111111");
        personas[4] = new Persona(5, "Lucía", 1, "Calle E", "222222222");


        // b)
        System.out.println("b)");
        for (int i = 0; i < personas.length; i++){

            System.out.println("Nombre: " + personas[i].getNombre() + ". Edad: " + personas[i].getEdad());
        }



        // c)
        System.out.println("\nc)");
        System.out.println("--> Nombres antes de la actualización\n");
        System.out.println("- Nombre persona1: " + personas[0].getNombre());
        personas[0].setNombre("Antonio Padilla");
        System.out.println("- Nombre persona2: " + personas[1].getNombre());
        personas[1].setNombre("Carmen Jenifer");

        System.out.println("\nActualizando datos...");

        System.out.println("\n--> Información actualizada de ambas personas\n");
        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());



        // d)
        System.out.println("\nd)");
        System.out.println("--> Información de las personas mayores de 30 años:\n");

        for ( int i = 0; i < personas.length; i++){

            if (personas[i].getEdad() > 30){

                System.out.println(i+1 + "." + personas[i].toString());
            }
        }

    }
}