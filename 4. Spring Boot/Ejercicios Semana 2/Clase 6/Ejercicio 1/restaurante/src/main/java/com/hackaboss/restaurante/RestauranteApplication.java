package com.hackaboss.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestauranteApplication.class, args);

		/**
		 * Ejercicio Nº 1: Patrón DTO

		 * Un restaurante necesita una API que proporcione información detallada sobre las calorías de los platos
		 * de su menú.

		 * Para esto, almacena en una base de datos lógica los siguientes datos:

		 * Platos: codigo_plato, nombre, precio, lista_Ingredientes

		 * Ingredientes: codigo_ingrediente, nombre, cantidad_calorias

		 * La API debe recibir el nombre de un plato como parámetro y devolver en base a esto:

		 * La cantidad total de calorías del plato completo.

		 * Una lista de ingredientes que componen el plato, junto con la cantidad de calorías de cada uno (la
		 * sumatoria de estas calorías deberían de dar la cantidad total de calorías del plato).

		 * El ingrediente con la mayor cantidad de calorías en el plato.

		 * 💡 Utilizar para las responses el patrón DTO

		 * 💡 Como ayuda, el dueño del restaurante nos brindó dos archivos .json con datos tanto de los platos
		 * con los que cuenta en el menú, como la lista completa de ingredientes con los que trabaja para cada plato.

		 * Utilizar ambos archivos como base de datos lógica del sistema. Cargar los datos del json a la aplicación
		 * y almacenar los datos en collections.
		 **/
	}

}
