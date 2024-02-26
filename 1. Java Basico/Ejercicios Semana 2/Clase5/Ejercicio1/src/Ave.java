public class Ave extends Animal{
    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {

        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
    }


    public void saludar() {
        System.out.println("Hola, soy un ave");
    }
}
