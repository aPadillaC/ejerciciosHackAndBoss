import java.util.ArrayList;
import java.util.List;

// 1) Creamos la clase Vehiculos con sus atributos, métodos y contructor
public class Vehiculo {

    private String marca;
    private String modelo;
    private int costo;

    public Vehiculo(String marca, String modelo, int costo) {
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


    @Override
    public String toString() {
        return "- Marca = " + marca + ", Modelo = " + modelo + ", Costo = " + costo;
    }
}
