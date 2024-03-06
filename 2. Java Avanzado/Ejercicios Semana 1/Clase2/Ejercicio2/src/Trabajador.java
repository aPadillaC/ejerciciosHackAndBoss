import java.util.ArrayList;
import java.util.List;

public class Trabajador extends Thread {

    private String nombre;
    private List<Tarea> listaTareas;

    public Trabajador(String nombre) {
        this.nombre = nombre;
        this.listaTareas = new ArrayList<>();
    }


    public void añadirTarea(Tarea tarea) {

        listaTareas.add(tarea);
    }

    @Override
    public void run() {

        for ( int i = 0 ; i < listaTareas.size(); i++) {

            System.out.println(this.nombre + " realizando la tarea " + listaTareas.get(i).getNombre());

            try {
                Thread.sleep(4000);
                System.out.println(this.nombre + " ha finalizado la tarea " + listaTareas.get(i).getNombre());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
