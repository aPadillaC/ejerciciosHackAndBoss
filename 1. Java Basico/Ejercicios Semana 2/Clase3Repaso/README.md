# Programa en Java - Manejo de Verduras

## Descripción
Este programa en Java consiste en una clase llamada `Verdura` que representa las características de distintos tipos de verduras. Permite crear un vector de verduras, realizar operaciones sobre ellas y mostrar información específica.

## Clase Verdura
La clase `Verdura` tiene los siguientes atributos:

- `id`: Identificador de la verdura.
- `nombre`: Nombre de la verdura.
- `color`: Color de la verdura.
- `calorias`: Cantidad de calorías de la verdura.
- `debeCocinarse`: Indica si la verdura debe ser cocinada o no.

Además, la clase incluye constructores, métodos getters y setters para acceder y modificar los atributos de las verduras.

## Acciones

### a) Crear Verduras y Almacenarlas en un Vector
Se crea un vector de tipo `Verdura` que puede almacenar hasta 5 verduras. Luego se crean 5 verduras y se guardan en el vector.

### b) Mostrar Nombre y Calorías de las Verduras
Se recorre el vector de verduras y se muestra por pantalla el nombre y las calorías de cada una de las verduras almacenadas.

### c) Cambiar Datos de Verduras
Se cambian todos los datos de dos verduras del vector. Luego, se muestran por pantalla los datos de todas las verduras después del cambio.

### d) Mostrar Verduras de Color Verde
Se recorre el vector y se muestra por pantalla únicamente a las verduras que sean de color verde.


## Instalación y Configuración del JDK (Java Development Kit)

### Instalación

#### Windows

1. Visita el sitio web oficial de Oracle JDK en [java.com](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Descarga el instalador del JDK compatible con tu sistema operativo.
3. Ejecuta el instalador y sigue las instrucciones proporcionadas en pantalla.
4. Una vez completada la instalación, verifica que el JDK esté correctamente configurado ejecutando `java -version` en la línea de comandos.

#### macOS

1. Abre la Terminal.
2. Instala Homebrew si aún no lo tienes: `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`.
3. Usa Homebrew para instalar el JDK: `brew install openjdk`.
4. Verifica la instalación ejecutando `java -version` en la Terminal.

#### Linux (Ubuntu)

1. Abre la Terminal.
2. Actualiza el índice de paquetes: `sudo apt update`.
3. Instala el JDK utilizando el gestor de paquetes de tu distribución Linux. Por ejemplo, en Ubuntu, puedes instalar OpenJDK con el siguiente comando: `sudo apt install default-jdk`.
4. Verifica la instalación ejecutando `java -version` en la Terminal.

## Instrucciones de Uso
1. Descarga el código fuente.
2. Compila el programa utilizando un compilador de Java.
3. Ejecuta el programa y sigue las instrucciones proporcionadas en la consola.

## Desarrolladores
El proyecto de aplicación web ha sido desarrollado por:
- Antonio
- aPadillaC