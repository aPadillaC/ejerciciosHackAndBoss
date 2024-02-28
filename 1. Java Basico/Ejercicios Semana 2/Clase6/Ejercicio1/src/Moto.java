public class Moto extends Vehiculo implements Combustion{

    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada,
                String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }


    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                ", cilindrada=" + cilindrada +
                ", tipoMotor=" + tipoMotor +
                '}';
    }

    @Override
    public void regarcarCombustible() {

        System.out.println("Repostando combustible...");
        System.out.println("10% \n25% \n50% \n80% \n100% \nLLENO");
    }

    @Override
    public int antiguedadVehiculo() {

        return 2024 - super.getAnio();
    }
}
