import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Ejercicio Nº 3 - Variables y Operadores - Individual

        //Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
        // Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el valor de la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el valor de la altura del triángulo: ");
        double height2 = scanner.nextDouble();

        double area = (base * height2) / 2;


        System.out.printf("El área del triángulo dado es: %.2f", area);

    }
}
