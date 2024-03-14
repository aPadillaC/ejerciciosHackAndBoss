public class Main {

    public static void main(String[] args) {

        /**
         * Ejercicio 1: Exploración de Directorios

         * Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un
         * sistema operativo utilizando una estructura de datos propia.

         * Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.

         * El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.
         **/

        // Creo los directorios y los archivos
        Directorio directorioRaiz = new Directorio(1, "Directorio Raiz");
        Directorio directorio1 = new Directorio(2, "Directorio 1");
        Directorio directorio2 = new Directorio(3, "Directorio 2");
        Directorio directorio3 = new Directorio(4, "Directorio 3");
        String archivo1 = "archivo1.txt";
        String archivo2 = "archivo2.txt";
        String archivo3 = "archivo3.txt";


        // Añado la estructura
        directorioRaiz.agregarArchivo(archivo1);
        directorio1.agregarArchivo(archivo2);
        directorio3.agregarArchivo(archivo3);

        directorioRaiz.agregarSubdirectorio(directorio1);
        directorioRaiz.agregarSubdirectorio(directorio2);
        directorio2.agregarSubdirectorio(directorio3);

        // Llamo al método del main
        explorarDirectorio(directorioRaiz, 0);
    }

    public static void explorarDirectorio(Directorio directorio, int nivel) {
        directorio.explorarDirectorio(nivel);
    }

}