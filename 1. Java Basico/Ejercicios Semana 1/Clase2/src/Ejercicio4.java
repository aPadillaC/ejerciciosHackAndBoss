import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Ejercicio Nº 4 - Matrices

        //Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java
        // que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        //Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        //Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento
        // (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que
        // esté vacío.
        //Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        //A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla
        // luego de cada reserva.
        //Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del
        // teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los
        // asientos ya reservados?
        //El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine
        // que ha finalizado.

        //TODO:Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.

        //--------------------------------------------------------------------------------------------------


        Scanner scanner = new Scanner(System.in);

        //inicializo las variables
        char[][] seat = new char[5][5];
        boolean flag = true;
        int row, col;
        String repeat = "";


        // mapeo inicialmente todos los asientos
        for (int i = 0; i < seat.length; i++){
            for (int y = 0; y < seat[0].length; y++){

                // marco como disponibles todos los asientos
                seat[i][y] = 'O';
                System.out.print(seat[i][y]);

                // realizo un salto de linea cuando llegamos al último asiento de la fila
                if (y==4){
                    System.out.println();
                }

            }
        }


        // Uso while para ir pidiendo la ubicación deseada y dentro pongo un bucle for para ir mostrando el estado de
        // todas las butacas
        while (flag){

            System.out.print("\nDime la fila que desea: ");
            row = scanner.nextInt();

            System.out.print("Dime el asiento que desea de la fila " + row + ": ");
            col = scanner.nextInt();

            // Evaluo si está ocupado el asiento o no, y dependiendo pinto X o solicito que pida de nuevo otro asiento
            if (seat[row-1][col-1] == 'X'){
                System.out.println("No ha sido posible asignar el asiento. Asiento ocupado");
                repeat = "r";
            }
            else {
                seat[row-1][col-1] = 'X';
            }

            // mapeo todos los asientos
            for (int i = 0; i < seat.length; i++){
                for (int y = 0; y < seat[0].length; y++){

                    // Si el asiento ya estaba ocupado pinto de nuevo la X
                    if(seat[i][y]  == 'X'){
                        System.out.print(seat[i][y]);
                    }
                    // Pinto O cuando el asiento está libre
                    else{
                        seat[i][y] = 'O';
                        System.out.print(seat[i][y]);
                    }
                    // realizo un salto de linea cuando llegamos al último asiento de la fila
                    if (y==4){
                        System.out.println();
                    }

                }
            }


            // Evalúo el valor de la variable repeat, dependiendo haremos una cosa o otra
            if (repeat.equalsIgnoreCase("r")){ // "r" cuando el asiento ya estaba ocupado y lo solicitamos
                                                            // de nuevo

                System.out.println("Asiento ocupado. Por favor seleccione de nuevo el asiento");
                repeat = "";
            }
            else{

                System.out.println("Quieres comprar otro asiento? (y)(n)");
                repeat = scanner.next();

                if(repeat.equalsIgnoreCase("n")){ // "n" para finalizar el programa

                    flag = false;
                }
            }

        }

    }
}
