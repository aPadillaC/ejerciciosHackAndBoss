import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {

    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    public void agregaarAuto(T auto){

        autos.add(auto);
        System.out.println("* Auto agregado al inventario: " + auto.getMarca() + " " + auto.getModelo());
    }


    public void buscarAutoPormarca(String marca) {

        List<T> listadoAutosPorMarca = autos.stream()
                .filter( auto -> auto.getMarca().equalsIgnoreCase(marca))
                .toList();

        listadoAutosPorMarca.stream()
                .forEach( auto -> System.out.println(auto.toString()));

    }


    public void buscarAutoPorAño(int annio) {

        List<T> listadoAutosPorAño = autos.stream()
                .filter( auto -> auto.getAnnio() == annio)
                .toList();

        listadoAutosPorAño.stream()
                .forEach( auto -> System.out.println(auto.toString()));
    }



    public void valorInventario() {

        double valorTotal = autos.stream()
                .mapToDouble( auto -> auto.getPrecio())
                .sum();

        System.out.println("\nEl valor total del inventario es de " + valorTotal + " €");
    }
}
