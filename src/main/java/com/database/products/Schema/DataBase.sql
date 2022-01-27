CREATE DATABASE prueba;

CREATE TABLE prueba.customer(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50),
    categoria VARCHAR(50),
    stock INT,

    CONSTRAINT customer_pk PRIMARY KEY(id)
);

INSERT INTO
	prueba.customer(nombre, categoria, stock)
VALUES
	('Fideos','Harina',20),
	('Leche','Lacteos',30),
    ('Crema','Lacteos',15);

SELECT * FROM prueba.customer;

DELETE FROM prueba.customer WHERE id=1;

SELECT * FROM prueba.customer;

UPDATE prueba.customer SET stock = 45 WHERE id = 2;

SELECT * FROM prueba.customer;
