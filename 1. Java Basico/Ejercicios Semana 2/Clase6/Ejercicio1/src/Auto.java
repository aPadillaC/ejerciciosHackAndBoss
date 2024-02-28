public class Auto extends Vehiculo implements Electrico{

    private int capacidadBateria;
    private int autonomia;
    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria,
                int autonomia) {

        super(id, placa, marca, modelo, anio, costo);
        this.autonomia = autonomia;
        this.capacidadBateria = capacidadBateria;
    }
    

    @Override
    public String toString() {
        return "Auto{" + super.toString() +
                ", capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                '}';
    }

    @Override
    public void cargarEnergia() {

        System.out.println("Cargando batería...");
        System.out.println("10% \n25% \n50% \n80% \n100% \nCARGADO");
    }

    @Override
    public int antiguedadVehiculo() {

        return 2024 - super.getAnio();
    }
}
