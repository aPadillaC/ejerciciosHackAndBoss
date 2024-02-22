public class Electrodomestico {


    /** Atributos **/
    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;


    /** Constructor sin parámetros **/
    public Electrodomestico() {
    }


    /** Constructor con parámetros **/
    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }


    /** Métodos Getters **/
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumo() {
        return consumo;
    }
}

