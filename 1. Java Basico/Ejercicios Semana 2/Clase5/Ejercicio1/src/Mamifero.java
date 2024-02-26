public class Mamifero extends Animal{
    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {

        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
    }


    public void saludar() {
        System.out.println("Hola, soy un mamífero");
    }



}
