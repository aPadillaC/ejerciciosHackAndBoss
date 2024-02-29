import java.sql.*;

public class Main {

    public static void main(String[] args) {

        /**
         * Crear una aplicación para gestionar una lista de estudiantes en una base de datos. Los estudiantes tendrán
         * atributos como id, nombre, edad y calificación.

         * - El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar
         * su información.

         * - Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas
         * coincidan con los atributos de la clase estudiante.

         * - Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
         **/

        String url = "jdbc:mysql://localhost:3306/universidad"; // URL de la base de datos "universidad"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contraseña = "root"; // Contraseña de la base de datos

        //utilizamos excepciones para manejar posibles errores de conexión.
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("\nConexión establecida correctamente!!!\n");


            // Se crean los clientes a insertar
            Estudiante estudiante1 = new Estudiante(55, "Tiago Padilla", 4, 5);
            Estudiante estudiante2 = new Estudiante(56, "Lucía Padilla", 1, 4);


            // Se INSERTAN datos en la tabla, utilizando consulta con Parámetros
            // Se prepara la consulta
            String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ( ?, ?, ?)";

            // Se declara el statement
            PreparedStatement statement = conexion.prepareStatement(insertSql);

            // Setea los parámetros
            statement.setString(1, estudiante1.getNombre());
            statement.setInt(2, estudiante1.getEdad());
            statement.setInt(3, estudiante1.getCalificacion());

            // Ejecuta la sentencia
            statement.executeUpdate();


            statement.setString(1, estudiante2.getNombre());
            statement.setInt(2, estudiante2.getEdad());
            statement.setInt(3, estudiante2.getCalificacion());

            statement.executeUpdate();

            System.out.println("Registros insertados en la tabla cliente! \n");

//            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM estudiantes"; // Cambia el nombre de la tabla a "estudiantes"
            ResultSet resultado = statement.executeQuery(sql);

            if(resultado != null) System.out.println("--> Listado de estudiantes: \n");
            // Procesa los resultados
            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                int calificacion = resultado.getInt("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion);
            }

            // Cierra la conexión y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}