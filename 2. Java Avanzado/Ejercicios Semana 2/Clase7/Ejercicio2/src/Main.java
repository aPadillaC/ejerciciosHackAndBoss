import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio 2: Organizador de Tareas
         *
         * Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear una
         * estructura jerárquica de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas también
         * pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".
         *
         * El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva. Además,
         * debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas subtareas.
         **/

        boolean usoAplicacion = true;
        int opcionElegida;
        Opciones opcionesMenu = new Opciones();
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestorTareas = new GestorTareas();
        opcionesMenu.menuOpciones();

        System.out.print("Bienvenido a sistema de gestión de tareas, que acción desea realizar: ");
        opcionElegida = scanner.nextInt();
        scanner.nextLine();

        Tarea tareaPrincipal = new Tarea(0, "Proyecto: Desarrollo de Software");


        while (usoAplicacion) {

            int id;

            switch (opcionElegida) {

                case 1: //creo una tarea
                    gestorTareas.agregarTarea(tareaPrincipal);
                    opcionesMenu.menuOpciones();
                    break;

                case 2: //creo una subtarea
                    gestorTareas.agregarSubtarea(tareaPrincipal);
                    opcionesMenu.menuOpciones();
                break;

                case 3: //muestro todas las tareas
                        mostrarEstructura(tareaPrincipal, 0, true);
                        opcionesMenu.mensajeSalidaRecursividad();
                        opcionesMenu.menuOpciones();
                    break;

                case 4: //actualizo/edito a los empleados
                    usoAplicacion = false;
                    break;
            }


            // Me solicita de nuevo la opción a elegir después de terminar cada proceso anterior
            if(usoAplicacion){
                System.out.print("Seleccione una opción: ");
                opcionElegida = scanner.nextInt();
                scanner.nextLine();
            }
        }

    }

    /** Método sin diseño ASCII **/
//    public static void mostrarEstructura(Tarea tarea, int nivel) {
//
//        if( nivel == 0) System.out.println("  ".repeat(nivel) + "(" + tarea.getId() + ") " + tarea.getDescripcion() + "/");
//
//        for( Tarea tareaHija : tarea.getListadoTareas()) {
//
//            System.out.println("  ".repeat(nivel + 5) + "(" + tareaHija.getId() + ") " + tareaHija.getDescripcion() + "/");
//
//            mostrarEstructura(tareaHija, nivel + 5);
//        }
//    }


    /** Método con diseño ASCII **/
    public static void mostrarEstructura(Tarea tareaPadre, int nivel, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append(i == nivel - 1 ? (isLast ? "  └──" : "  ├──") : "    ");
        }
        System.out.println(sb.toString() + " (" + tareaPadre.getId() + ")-> " + tareaPadre.getDescripcion());
        for (int i = 0; i < tareaPadre.getListadoTareas().size(); i++) {
            Tarea tareaHija = tareaPadre.getListadoTareas().get(i);
            mostrarEstructura(tareaHija, nivel + 1, i == tareaPadre.getListadoTareas().size() - 1);
        }
    }
}