
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 2 - Gestor de Eventos - Individual

         * Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene
         * un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las
         * siguientes operaciones utilizando Streams y Optionals:

         * Filtra los eventos que están programados para una fecha específica.

         * Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

         * Encuentra el evento más próximo en el tiempo utilizando Optionals.
         **/



        List<Evento> listaEventos = List.of(
                new Evento("Concierto", LocalDate.of(2024, 3, 15), "Música"),
                new Evento("Feria",  LocalDate.of(2024,8,15), "Ocio"),
                new Evento("Carrera",  LocalDate.of(2024,12,15), "Deportes"),
                new Evento("Festival Cine",  LocalDate.of(2024,6,15), "Ocio")
        );


        System.out.println("-->Listado filtrado por fecha: ");
        LocalDate fecha =  LocalDate.of(2024, 8, 15);

        listaEventos.stream()
                .filter( evento -> evento.getFecha().equals(fecha))
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("No se ha encontrado ningún evento en la fecha seleccionada"));


        System.out.println("--------------------------------------------");
        System.out.println("-->Ordenado por categoría e indicar los eventos que hay e ella:  ");

        listaEventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting())) // Agrupo por categoria y cuanto la cantidad de eventos
                .forEach( (categoria, numEventos) -> System.out.println("Categoría " + categoria + " hay un total de " + numEventos + " eventos"));


        System.out.println("--------------------------------------------");
        System.out.println("-->Evento más próximo: ");

        LocalDate fechaActual =  LocalDate.now();

        listaEventos.stream()
                .filter( evento -> evento.getFecha().isAfter(fechaActual)) // evalúo los eventos con la fecha después a la acutal
                .min(Comparator.comparing(Evento::getFecha)) // comparo eventos y me quedo con el mas cercano usando .min()
                .ifPresentOrElse(evento -> System.out.println("El evento más cercano es: " + evento),
                    () -> System.out.println("No hay eventos"));

    }
}