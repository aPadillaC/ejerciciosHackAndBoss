public class Mascota<T> {

    private int idMascota;
    private String nombre;
    private int edad;
    private T especie;


    public Mascota(int idMascota, String nombre, int edad, T especie) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }


    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public T getEspecie() {
        return especie;
    }

    public void setEspecie(T especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + idMascota +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
