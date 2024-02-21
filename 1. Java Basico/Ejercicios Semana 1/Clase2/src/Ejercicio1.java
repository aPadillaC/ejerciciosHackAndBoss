import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Ejercicio Nº 1 - Estructuras Condicionales - Individual
        //
        //a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
        // a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede
        // o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca su edad: ");
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("Enhorabuena, puede entrar al evento");
        }
        else {
            System.out.println("Lo sentimos, no cumple el mínimo de edad. No puede pasar");
        }
    }
}
