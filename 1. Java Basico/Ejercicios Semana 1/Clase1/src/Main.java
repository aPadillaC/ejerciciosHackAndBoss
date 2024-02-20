import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ejercicio Nº 1 - Sintaxis básica - Individual

        //a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario.
        // Por ejemplo: “Hola, bienvenido al sistema”.

        System.out.println("Hola, bienvenido al sistema");

        //b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y
        // se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenida al sistema”.

        String name = "Antonio";

        System.out.println("Hola " + name + ", bienvenido al sistema");




        // Ejercicio Nº 2 - Tipos de Datos - Grupal

        //a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double,
        // boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.

        int age;
        double height;
        boolean flag;
        String fullName;

        age = 35;
        height = 1.82;
        flag = true;
        fullName = "Antonio Padilla";

        System.out.println("El valor de la variable tipo int es: " + age);
        System.out.println("El valor de la variable tipo double es: " + height);
        System.out.println("El valor de la variable tipo boolean es: " + flag);
        System.out.println("El valor de la variable tipo String es: " + fullName);

        //b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String
        // en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y
        // en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.

        // age = fullName; // DA ERROR!
        // age = height; // DA ERROR!
        // age = flag; // DA ERROR!
        // fullName = flag // DA ERROR!
        height = age; // No da error porque el tipo de dato double admite los datos tipo int situando el pto flotante en .0
        System.out.println("El valor nuevo de la variable tipo double es: " + height);




        //Ejercicio Nº 3 - Variables y Operadores - Individual

        //Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
        // Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor de la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el valor de la altura del triángulo: ");
        double height2 = scanner.nextDouble();


        System.out.println("El área del triángulo dado es: " + (base * height2) / 2);



        //Ejercicio Nº 4 - Operaciones de Lectura - Grupal
        //
        //Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes
        // operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados
        // de cada una de las operaciones con un mensaje amigable para el usuario.

        //Sugerencia: Compara los resultados que obtengas con otros compañeros. Pide a tus compañeros que te digan
        // números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.


        Scanner scanner2 = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor del primer número ");
        double numero1 = scanner2.nextDouble();

        System.out.print("Introduce el valor del segundo número: ");
        double numero2 = scanner2.nextDouble();

        double suma, resta, multiplicacion, division;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);


        //Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste
        // hasta ahora… ¿De qué manera tratarías de evitar ésta situación?

        Scanner scanner3 = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor del primer número ");
        double numero3 = scanner2.nextDouble();

        System.out.print("Introduce el valor del segundo número: ");
        double numero4 = scanner2.nextDouble();

        if(numero4 == 0.0){

            System.out.println("El segundo número introducido no es válido. Introduce un número distinto de 0");
            numero4 = scanner2.nextDouble();
        }

        double suma2, resta2, multiplicacion2, division2;

        suma2 = numero3 + numero4;
        resta2 = numero3 - numero4;
        multiplicacion2 = numero3 * numero4;
        division2 = numero3 / numero4;

        System.out.println("El resultado de la suma es: " + suma2);
        System.out.println("El resultado de la resta es: " + resta2);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion2);
        System.out.println("El resultado de la división es: " + division2);

    }
}
