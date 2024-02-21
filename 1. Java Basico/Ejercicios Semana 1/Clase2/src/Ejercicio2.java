import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Ejercicio Nº 2 - Estructuras Repetitivas - Individual

        //a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio
        // de varios productos comprados por un cliente.
        //Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario
        // decida finalizar. Luego, muestra el total de la compra que debe abonar.

        //TODO: Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador (cuando sabemos un
        // número exacto de productos por ejemplo) o por centinela (cuando no sabemos cuántos productos va a comprar el
        // cliente). En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un número negativo
        // o un 0 como monto de un producto.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        boolean flag = true;
        double total = 0;

        while (flag == true) {

            System.out.print("Introduce el precio del producto: ");
            double price = scanner.nextDouble();

            if (price == 0) {
                flag = false;
            }

            total += price;
        }

        System.out.printf("El precio total de la compra es de %.2f €", total);
    }
}
