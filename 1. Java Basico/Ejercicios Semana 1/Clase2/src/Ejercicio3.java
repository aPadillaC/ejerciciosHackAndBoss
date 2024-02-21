import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Ejercicio Nº 3 - Arreglos: Vectores - Individual

        //Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última
        // semana, calcule la temperatura máxima promedio que hubo.
        //Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima
        // de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el
        // vector y mostrando el resultado por pantalla.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[] temp = new double[7];
        double mediaTemp = 0;

        for (int i=0; i<temp.length; i++) {

            System.out.print("Introduce la temperatura máxima del día " + (i + 1) + ": ");
            temp[i] = scanner.nextDouble();

            mediaTemp += temp[i];

            if (i==(temp.length-1)){
                mediaTemp = mediaTemp/temp.length;
            }
        }

        System.out.printf("La temperatura media máxima de la semana pasada fue de: %.2f", mediaTemp);
    }
}
