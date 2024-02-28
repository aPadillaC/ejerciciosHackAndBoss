public class Producto {

    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int cantStock;


    public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int cantStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantStock = cantStock;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return "Producto{\n" +
                " codigo = " + codigo +
                ",\n nombre = " + nombre  +
                ",\n marca = " + marca +
                ",\n tipo = " + tipo  +
                ",\n precioCosto = " + precioCosto +
                ",\n precioVenta = " + precioVenta +
                ",\n cantStock = " + cantStock +
                "\n}";
    }
}
