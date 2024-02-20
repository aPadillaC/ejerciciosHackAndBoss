import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Ejercicio Nº 4 - Operaciones de Lectura - Grupal
        //
        //Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes
        // operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados
        // de cada una de las operaciones con un mensaje amigable para el usuario.

        //Sugerencia: Compara los resultados que obtengas con otros compañeros. Pide a tus compañeros que te digan
        // números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.


        Scanner scanner2 = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor del primer número: ");
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


        //TODO: Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste
        // hasta ahora… ¿De qué manera tratarías de evitar ésta situación?

        Scanner scanner3 = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor del primer número: ");
        double numero3 = scanner3.nextDouble();

        System.out.print("Introduce el valor del segundo número: ");
        double numero4 = scanner3.nextDouble();

        if(numero4 == 0){

            System.out.println("El segundo número introducido no es válido. Introduce un número distinto de 0:");
            numero4 = scanner3.nextDouble();
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
