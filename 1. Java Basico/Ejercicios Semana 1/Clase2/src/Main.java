import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaración e inicialización de la matriz de edades
        int[][] edades = new int[4][4];

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las edades
        System.out.println("Ingresa las edades para la matriz (4 filas x 4 columnas):");

        //carga de una matriz
        for (int fila=0; fila < 4; fila++) {
            for (int columna=0; columna < 4; columna++) {
                System.out.print("Ingresa la edad para la fila " + (fila + 1) + ", columna " + (columna + 1) + ": ");
                edades[fila][columna] = scanner.nextInt();
            }
        }
        // Recorrido/Muestra de una matriz
        System.out.println("Matriz de Edades:");
        for (int fila=0; fila < 4; fila++) {
            for (int columna=0; columna < 4; columna++) {
                System.out.println("Estoy en fila: " + fila + " columna: " + columna + " y se encuentra el valor: " + edades[fila][columna]);
            }
        }
    }
}