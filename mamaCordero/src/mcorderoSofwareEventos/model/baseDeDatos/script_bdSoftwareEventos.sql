CREATE DATABASE bd_eventoCordero;

USE bd_eventoCordero;

CREATE TABLE lugar(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (100),
    ubicacion VARCHAR (100),
    capacidad INT,
    costo_arriendo INT,
    PRIMARY KEY (id)
);

/*aca inserte INSERT con los datos correspondientes*/


CREATE TABLE tipo_servicio(
    id INT AUTO_INCREMENT,
    tipo_servicio VARCHAR (30),
    costo INT,
    PRIMARY KEY (id)
);

/*aca inserte INSERT con los datos correspondientes*/

CREATE TABLE cliente(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(30),
    rut VARCHAR(13),
    direccion VARCHAR (100),
    /*telefono como varchar para evitar errores, se valida en el ingreso al sistema*/
    numero_telefono VARCHAR(12),
    PRIMARY KEY (id)
);

/*aca inserte INSERT con los datos correspondientes*/


CREATE TABLE evento (
    id INT AUTO_INCREMENT,
    fecha DATE,
    lugar_id_fk int,
    cliente_id_fk int,
    servicio id_fk int,
    num_asistentes int,
    PRIMARY KEY (id),
    FOREING KEY (lugar_id_fk) REFERENCES lugar(id),
    FOREING KEY (cliente_id_fk) REFERENCES cliente(id),
    FOREING KEY (servicio_id_fk) REFERENCES servicio(id)

);


/*aca inserte INSERT con los datos correspondientes*/
