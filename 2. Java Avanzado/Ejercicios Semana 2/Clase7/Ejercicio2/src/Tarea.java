import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private int id;
    private String descripcion;
    private List<Tarea> listadoTareas;


    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.listadoTareas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getListadoTareas() {
        return listadoTareas;
    }

    public void setListadoTareas(List<Tarea> listadoTareas) {
        this.listadoTareas = listadoTareas;
    }


    public void agregarTarea(Tarea tarea) {
        this.listadoTareas.add(tarea);
    }


    public Tarea buscarTareaPorId(int idBuscado) {
        if (this.id == idBuscado) {     // Comprueba si el ID de la tarea actual coincide con el ID de búsqueda
            return this;    // Si hay una coincidencia, devuelve esta tarea
        }
        for (Tarea tareaHija : listadoTareas) {     // Itera sobre las subtareas de la tarea actual
            Tarea tareaBuscada = tareaHija.buscarTareaPorId(idBuscado);     // Busca recursivamente la tarea en las subtareas
            if (tareaBuscada != null) {     // Si se encuentra la tarea en las subtareas
                return tareaBuscada;        // Devuelve la tarea encontrada
            }
        }
        return null;        // Si no se encuentra la tarea con el ID de búsqueda, devuelve null
    }


}
