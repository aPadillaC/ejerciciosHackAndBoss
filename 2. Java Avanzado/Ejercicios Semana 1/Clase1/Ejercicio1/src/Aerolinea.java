import java.util.ArrayList;
import java.util.List;

public class Aerolinea {

    private List<Vuelo> listaVuelos;

    public Aerolinea() {
        listaVuelos = new ArrayList<>();
    }

    public void añadirVuelo(Vuelo vuelo) {
        listaVuelos.add(vuelo);
    }


    public void reservar(String nombre, String destino, String fecha, int numAsientos) throws ReservaInvalidaException {

        boolean vueloOk = false;

        for( Vuelo vuelo : listaVuelos) {

            if ( vuelo.getDestino().equalsIgnoreCase(destino) && vuelo.getFecha().equalsIgnoreCase(fecha)) {
                vueloOk = true;
                vuelo.reservarAsientos(numAsientos);
            }
        }

        if(!vueloOk) {
            throw new  ReservaInvalidaException("Vuelo no existe en la BBDD, revise los datos introducidos");
        }
    }
}
