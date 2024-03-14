import java.util.Scanner;

public class GestorTareas {

    Scanner scanner = new Scanner(System.in);
    public void agregarTarea(Tarea tareaPadre) {

        System.out.print("Introduce el id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce la descripción: ");
        String descripcion = scanner.nextLine();

        Tarea tareaHija = new Tarea(id, descripcion);

        tareaPadre.agregarTarea(tareaHija);

        System.out.print("Desa añadir subtarea nª" + (tareaHija.getListadoTareas().size() + 1) + " a (" +
                tareaHija.getId() + ") "  + tareaHija.getDescripcion() + ", (s) o (n): ");
        String controlSubtareas = scanner.nextLine();
        if(controlSubtareas.equalsIgnoreCase("s")) agregarTarea(tareaHija);


        System.out.print("Desea introducir subtarea nº" + (tareaPadre.getListadoTareas().size() + 1) + " a (" +
                tareaPadre.getId() + ") "+ tareaPadre.getDescripcion() +", pulse (s) o (n): ");
        String controlRecursividad = scanner.nextLine();
        if (controlRecursividad.equalsIgnoreCase("s")) agregarTarea(tareaPadre);

    }


    public void agregarSubtarea(Tarea tareaPrincipal) {

        if(tareaPrincipal.getListadoTareas().size() == 0){

            System.out.println("\nNo hay tareas principales añadidas!");
        }
        else {
            System.out.print("Introduce el id de la tarea en donde quieres añadir la subtarea: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Tarea tareaBuscada = tareaPrincipal.buscarTareaPorId(id);


            System.out.print("Introduce el id de la subtarea: ");
            int idSub = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Introduce la descripcion de la subtarea: ");
            String descripcionSub = scanner.nextLine();

            Tarea tarea = new Tarea(idSub, descripcionSub);

            tareaBuscada.agregarTarea(tarea);
        }

    }
}
