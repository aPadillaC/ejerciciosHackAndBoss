public class Camiseta extends Vestimenta{

    String manga;
    String cuello;

    public Camiseta(int codigo, String nombre, double precio, String marca, char talla, String color, String manga,
                    String cuello) {

        super(codigo, nombre, precio, marca, talla, color);
        this.cuello = cuello;
        this.manga = manga;
    }


    @Override
    public String getMarca() {
        return "Esta camiseta es de la marca: " + this.manga;
    }
}
