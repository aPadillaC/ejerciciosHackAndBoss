public class Zapato extends Vestimenta{

    String material;
    String tipoCierre;
    public Zapato(int codigo, String nombre, double precio, String marca, char talla, String color, String material,
                  String tipoCierre) {

        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }


    @Override
    public String getMarca() {
        return "Estos zapatos son de la marca: " + this.marca;
    }
}
