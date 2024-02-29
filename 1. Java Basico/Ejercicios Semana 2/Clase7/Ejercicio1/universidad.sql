CREATE DATABASE universidad;

USE universidad;

CREATE TABLE estudiantes (
	id int (11) NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	nombre VARCHAR (45) DEFAULT NULL, 
	edad int (11) DEFAULT NULL, 
	calificacion int (11) DEFAULT NULL
);


INSERT INTO estudiantes ( nombre, edad, calificacion) VALUES ("Antonio Padilla", 35, 10);
INSERT INTO estudiantes ( nombre, edad, calificacion) VALUES ("Carmen Muñoz", 34, 9);
INSERT INTO estudiantes ( nombre, edad, calificacion) VALUES ("Alejandra Muñoz", 14, 8);

SELECT * FROM estudiantes;