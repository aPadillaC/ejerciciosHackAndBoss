public class Pantalon extends Vestimenta{

    String estilo;
    String tipoTejido;
    public Pantalon(int codigo, String nombre, double precio, String marca, char talla, String color, String estilo,
                    String tipoTejido) {

        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;

    }


    @Override
    public String getMarca() {
        return "Estos pantalones son de la marca: " + this.estilo;
    }
}
