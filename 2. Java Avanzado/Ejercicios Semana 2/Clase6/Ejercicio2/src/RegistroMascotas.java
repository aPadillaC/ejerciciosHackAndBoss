import java.util.*;

import static java.lang.Integer.parseInt;

public class RegistroMascotas<T extends Mascota>{

    private List<T> mascotas;

    public RegistroMascotas() {
        this.mascotas = new ArrayList<>();
    }


    public void agregarMascota(T mascota) {

        mascotas.add(mascota);
        System.out.println("- Agregada al registro la mascota: " + mascota.getNombre());
    }


    public void busquedaMascotasPorNombre(String nombre) {

        List<T> mascotasEncontradas = new ArrayList<>();
        System.out.println("\n--> Listado de la búsqueda por nombre:");

        for (Mascota<T> mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add((T) mascota);
                System.out.println(mascota.toString());
            }
        }

        if (mascotasEncontradas.size() == 0) System.out.println("No hay máscotas registradas con ese nombre");
    }



    public void busquedaMascotasPorEspecie(String especie) {


        List<T> mascotasEncontradas = new ArrayList<>();
        System.out.println("\n--> Listado de la búsqueda por especie:");

        for (Mascota<T> mascota : mascotas) {
            String especieMascota = String.valueOf(mascota.getEspecie());
            if (especieMascota.equalsIgnoreCase(especie)) {
                mascotasEncontradas.add((T) mascota);
                System.out.println(mascota.toString());
            }
        }

        if (mascotasEncontradas.size() == 0) System.out.println("No hay máscotas registradas con esa especie");
    }




    public void contarMascotasRegistradas() {

        System.out.println("\n--> Cantidad total de mascotas registradas: " + mascotas.size());
    }



    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Sugar", "Luna", "Candy", "Max", "Bella", "Bronco", "Lucas", "Rocky", "Carli", "Batman"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {

            int id = i + 1;

            String nombre = nombres[random.nextInt(nombres.length)];

            int edad = random.nextInt(15) + 1; // Edad entre 1 y 15 años

            int especieIndex = random.nextInt(especies.length);
            String especie = especies[especieIndex];


            // Agrega la mascota al registro
            agregarMascota((T) new Mascota<>(id, nombre, edad, especie));
        }
    }
}
