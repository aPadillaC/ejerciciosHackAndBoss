public class Sombrero extends Vestimenta{

    String tipo;
    String tamano;

    public Sombrero(int codigo, String nombre, double precio, String marca, char talla, String color, String tipo,
                    String tamano) {

        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }


    @Override
    public String getMarca() {
        return "Este sombrero es de la marca: " + this.tipo;
    }
}
