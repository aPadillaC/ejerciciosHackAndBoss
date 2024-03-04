
import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Producto> listaProductos;


    public Inventario(){

        listaProductos = new HashMap<>();
    }

    public void añadirProducto(Producto producto) throws GestionInventariosException {

        if (producto.getCantidad() < 0 ) throw new GestionInventariosException("La cantidad debe ser mayor a 0");

        if(producto.getPrecio() <= 0) {
            throw new GestionInventariosException("El precio del producto debe ser mayor que cero.");
        }

        if (producto.getNombre() == null || producto.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }

        for (char letra : producto.getNombre().toCharArray()) {
            if (!Character.isLetter(letra) && letra != ' ') {
                throw new GestionInventariosException("El nombre contiene caracteres no válidos: " + letra);
            }
        }
        listaProductos.put(producto.getNombre(), producto);
    }


}
