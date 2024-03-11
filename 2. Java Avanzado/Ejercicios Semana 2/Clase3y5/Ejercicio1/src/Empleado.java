public class Empleado {

    private String nombre;
    private double salario;
    private Categoria categoria;

    public Empleado(String nombre, double salario, Categoria categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria=" + categoria +
                '}';
    }
}
