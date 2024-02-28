import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)

         * Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su
         * inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos:
         * código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
         * A partir de esto, realizar las siguientes acciones en el programa desarrollado:

         * a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono,
         * laptop, auriculares/cascos, cargador, tablet, etc).

         * b) Guardar estos objetos creados en un ArrayList.

         * c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

         * d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

         * e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

         * f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades
         * del stock y actualizar el registro en la lista en base a eso.

         * g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
         **/


        /** a) y b)**/

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Teléfono", "Apple", "SmarthPhone", 200,
                1200, 20 ));
        productos.add(new Producto(2, "Laptop", "Samsung", "Portatil", 120,
                999, 10 ));
        productos.add(new Producto(3, "Auriculares/Cascos", "Xiaomi", "Inalámbricos", 20,
                56, 30 ));
        productos.add(new Producto(4, "Cargador", "Huawei", "Salida Tipo C", 6,
                40, 15 ));
        productos.add(new Producto(5, "Tablet", "Acer", "Full HD", 30,
                349, 8 ));


        /** b) **/
        System.out.println("\n b)");

        System.out.println("Listado de productos: ");

        for( Producto prod : productos){

            System.out.println("\n" + prod.toString());
        }



        /** c) **/
        System.out.println("\nc)");

        Producto mayor = productos.get(0);

        for(Producto prod : productos) {

            if( mayor.getPrecioVenta() < prod.getPrecioVenta()){

                mayor = prod;
            }
        }

        System.out.println("--> El producto de mayor precio de venta es: ");
        System.out.println(mayor.toString());
        System.out.println();

        /** d) **/
        System.out.println("\nd)");

        Producto menor = productos.get(0);

        for(Producto prod : productos) {

            if( menor.getPrecioVenta() > prod.getPrecioVenta()){

                menor = prod;
            }
        }

        System.out.println("--> El producto de menor precio de venta es: ");
        System.out.println(menor.toString());
        System.out.println();

        /** e) **/

        productos.remove(4);

        System.out.println("Listado de productos actualizada tras la eliminación: ");

        for( Producto prod : productos){

            System.out.println("\n" + prod.toString());
        }



        /** f) **/
        System.out.println("\nf)");

        Producto mayorStock = productos.get(0);

        for(Producto prod : productos) {

            if( mayorStock.getCantStock() < prod.getCantStock()){

                mayorStock = prod;
            }
        }

        System.out.println("--> El producto de mayor stock: ");
        System.out.println(mayorStock.toString());
        System.out.println();

        System.out.println("Descuento 3 unidades en su stock ");
        mayorStock.setCantStock(mayorStock.getCantStock() - 3);

        System.out.println("--> Registro actualizado: ");
        System.out.println(mayorStock.toString());

    }
}