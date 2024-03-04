public class Vuelo {
    private String destino;
    private String fecha;
    private int numAsientosDisponibles;

    public Vuelo(String destino, String fecha, int numAsientosDisponibles) {

        this.destino = destino;
        this.fecha = fecha;
        this.numAsientosDisponibles = numAsientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumAsientosDisponibles() {
        return numAsientosDisponibles;
    }


    public void reservarAsientos( int numAsientos ) throws ReservaInvalidaException {

        if (numAsientos > this.numAsientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos libres");
        }
        if ( numAsientos <= 0) {
            throw new ReservaInvalidaException("Datos incorrectos, numeros de asientos debe ser positivo");
        }

        numAsientosDisponibles -= numAsientos;
        System.out.println("Reserva realizada con éxito");
    }
}
