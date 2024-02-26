public class Main {

    public static void main(String[] args) {


        /**
         * Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color
         * (con sus métodos y constructores correspondientes).

         * a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

         * - Zapato: material, tipoCierre
         * - Pantalon: estilo, tipoTejido
         * - Camiseta: manga, cuello
         * - Sombrero: tipo, tamaño

         * b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos,
         * 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

         * c) Crear los siguientes métodos (en cada subclase correspondiente):

         * Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

         * Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

         * Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

         * Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

         * d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
         **/


        /** b) **/

        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1, "Tenis", 120, "El Ganso", 'L', "Blanco",
                "Sintético", "Cordones");
        vestimentas[1] = new Zapato(2, "Mocasines", 90, "PdH", 'M', "Marrón",
                "Piel", "Sin cordones");
        vestimentas[2] = new Zapato(3, "Snniker", 60, "Nike", 'S', "Negro",
                "Tela", "Cordones");
        vestimentas[3] = new Pantalon(4, "Chino", 55, "Sfera", 'L', "Azul Marino",
                "Skinny", "Algodon");
        vestimentas[4] = new Pantalon(5, "Vaqueros", 40, "Pepe Jeans", 'S', "Azul",
                "Normal wear", "Vaquera");
        vestimentas[5] = new Pantalon(6, "Pinza", 170, "Alvaro Moreno", 'L', "Negro",
                "Fit", "Tela");
        vestimentas[6] = new Camiseta(7, "Sport", 45, "Adidas", 'L', "Blanco",
                "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Interior", 30, "Decatlon", 'S', "Negro",
                "Larga", "Pico");
        vestimentas[8] = new Sombrero(9, "Boina", 40, "Unit", 'L', "Gris",
                "Tela", "Grande");



        /** d) **/
        System.out.println("\nd)");

        for( int i = 0; i < vestimentas.length; i++) {

            System.out.println(vestimentas[i].getMarca());
        }

    }
}