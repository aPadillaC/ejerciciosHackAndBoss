import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 3 - Vectores y excepciones - Individual
         *
         * Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un
         * vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar
         * datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
         *
         * Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño
         * fijo para simplificar el ejercicio.
         *
         * Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando
         * un índice.
         *
         * Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector,
         * por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
         *
         * Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando
         * acceder a una posición inválida en el vector.
         */

        String[] peliculas = new String[3];

        Scanner scanner = new Scanner(System.in);

        for( int i = 0; i < peliculas.length; i++) {
            System.out.print("Dime película para guardar en el arreglo: ");
            peliculas[i] = scanner.nextLine();
        }

//        System.out.println(peliculas);
        System.out.print("Dime una posición del arreglo para mostrarte la película almacenada: ");
        int posicion = scanner.nextInt();
        scanner.nextLine();

        try{

            System.out.println("La película en la posición " + posicion + " es: " + peliculas[posicion-1]);

        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Está intentando acceder a un índice fuera del rango del arreglo: " + ex.getMessage());
        }
    }
}