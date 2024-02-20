public class Ejercicio2 {

    public static void main(String[] args) {

        // Ejercicio Nº 2 - Tipos de Datos - Grupal

        //a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double,
        // boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.

        int age;
        double height;
        boolean flag;
        String fullName;

        age = 35;
        height = 1.82;
        flag = true;
        fullName = "Antonio Padilla";

        System.out.println("El valor de la variable tipo int es: " + age);
        System.out.println("El valor de la variable tipo double es: " + height);
        System.out.println("El valor de la variable tipo boolean es: " + flag);
        System.out.println("El valor de la variable tipo String es: " + fullName);

        //b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String
        // en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y
        // en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.

        // age = fullName; // DA ERROR!
        // age = height; // DA ERROR!
        // age = flag; // DA ERROR!
        // fullName = flag // DA ERROR!
        height = age; // No da error porque el tipo de dato double admite los datos tipo int situando el pto flotante en .0
        System.out.println("El valor nuevo de la variable tipo double es: " + height);

    }
}
