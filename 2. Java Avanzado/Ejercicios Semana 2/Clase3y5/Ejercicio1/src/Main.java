import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 1 - Empleados - Individual

         * Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y
         * una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones
         * utilizando Streams y Optionals:

         * Filtra los empleados cuyo salario sea mayor a cierto valor específico.

         * Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

         * Encuentra al empleado con el salario más alto utilizando Optionals.
         **/

        List<Empleado> listadoEmpleados = List.of(
                new Empleado("Antonio", 1900, Categoria.Desarrollador),
                new Empleado("Carmen", 2000, Categoria.Gerente),
                new Empleado("Tiago", 1800, Categoria.Analista),
                new Empleado("Alejandra", 1600, Categoria.Desarrollador)
        );

        Predicate<Empleado> empleadosFiltrados = emp -> emp.getSalario() > 1600;


        System.out.println("-->Listado filtrado por salario: ");
        listadoEmpleados.stream()
                .filter(empleadosFiltrados)
                .toList()
                .forEach( empleado -> System.out.println(empleado.toString()));


        System.out.println("--------------------------------------------");
        System.out.println("-->Listado salario medio por categoría: ");

        listadoEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(empleado -> empleado.getSalario())))
                .forEach( (categoria, salario) -> System.out.println(categoria + " su salario medio: " + salario + " €"));


        System.out.println("--------------------------------------------");
        System.out.println("-->Empleado con el salario mas alto: ");

        listadoEmpleados.stream()
                .sorted((x, y) -> (int) (y.getSalario() - x.getSalario()))
                .findFirst()
                .ifPresentOrElse( empleado -> System.out.println(empleado.toString()),
                        () -> System.out.println("Listado vacío"));


    }
}