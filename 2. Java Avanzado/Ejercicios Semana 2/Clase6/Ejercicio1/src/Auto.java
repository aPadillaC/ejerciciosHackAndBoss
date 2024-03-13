public class Auto {

    private String marca;
    private String modelo;
    private int annio;
    private double precio;


    public Auto(String marca, String modelo, int annio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "- " +
                "marca = " + marca +
                ", modelo = " + modelo +
                ", año = " + annio +
                ", precio = " + precio;
    }
}
