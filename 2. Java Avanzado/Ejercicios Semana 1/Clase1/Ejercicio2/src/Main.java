public class Main {

    public static void main(String[] args) throws GestionInventariosException {

        /**
         * Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual
         *
         * Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los
         * usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto,
         * el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios,
         * validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.
         *
         * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada)
         * o de utilizar los tipos correctos de excepción en cada caso.
         */


        Inventario inventario = new Inventario();

        try {
            Producto prod1 = new Producto("Bolígrafo", 1, 10);
            inventario.añadirProducto(prod1);

            Producto prod2 = new Producto(" ", 1, 10);
            inventario.añadirProducto(prod2);

            Producto prod3 = new Producto("Bolígrafo9", 0, 10);
            inventario.añadirProducto(prod3);

            Producto prod4 = new Producto("Bolígrafo", -1, 10);
            inventario.añadirProducto(prod4);

            Producto prod5 = new Producto("Bolígrafo", 1, -5);
            inventario.añadirProducto(prod5);

        }
        catch (GestionInventariosException e) {
            System.out.println("Error en producto: " + e.getMessage());
        }

    }
}