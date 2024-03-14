import java.util.ArrayList;
import java.util.List;

class Directorio {
    private int id;
    private String nombre;
    private List<Directorio> listaSubdirectorios;
    private List<String> listaArchivos;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaSubdirectorios = new ArrayList<>();
        this.listaArchivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        listaSubdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        listaArchivos.add(archivo);
    }


    public void explorarDirectorio(int nivel) {
        System.out.println("  ".repeat(nivel) + nombre + "/");
        for (String archivo : listaArchivos) {
            System.out.println("  ".repeat(nivel + 5) + archivo);
        }
        for (Directorio subdirectorio : listaSubdirectorios) {
            subdirectorio.explorarDirectorio(nivel + 5); // Llamada recursiva al método
        }
    }
}

