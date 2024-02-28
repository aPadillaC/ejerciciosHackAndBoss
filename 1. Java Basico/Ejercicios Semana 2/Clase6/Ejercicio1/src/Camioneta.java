public class Camioneta extends Vehiculo implements Combustion{

    private int capacidadTanque;
    private int consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque,
                     int consumoCombustible) {

        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }


    @Override
    public String toString() {
        return "Camioneta{" + super.toString() +
                ", capaciddadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                '}';
    }

    @Override
    public int antiguedadVehiculo() {

        return 2024 - super.getAnio();
    }

    @Override
    public void regarcarCombustible() {

        System.out.println("Repostando combustible...");
        System.out.println("10% \n25% \n50% \n80% \n100% \nLLENO");
    }
}
