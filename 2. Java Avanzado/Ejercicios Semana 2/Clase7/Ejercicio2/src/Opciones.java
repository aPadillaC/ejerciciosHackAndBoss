import java.util.Scanner;

public class Opciones {

    Scanner scanner = new Scanner(System.in);
    public void menuOpciones() {

        System.out.println("╔═════════════════════════════════════════════════╗");
        System.out.println("║                  MENÚ PRINCIPAL                 ║");
        System.out.println("╠═════════════════════════════════════════════════╣");
        System.out.println("║                                                 ║");
        System.out.println("║  1. Insertar nueva tarea                        ║");
        System.out.println("║  2. Insertar nueva subtarea                     ║");
        System.out.println("║  3. Listado de tareas                           ║");
        System.out.println("║  4. Salir                                       ║");
        System.out.println("║                                                 ║");
        System.out.println("╚═════════════════════════════════════════════════╝");
    }

    public void mensajeSalidaRecursividad() {

        System.out.print("\nPulsa cualquier letra para ir al menú principal: ");
        String salir = scanner.nextLine();
    }
}
