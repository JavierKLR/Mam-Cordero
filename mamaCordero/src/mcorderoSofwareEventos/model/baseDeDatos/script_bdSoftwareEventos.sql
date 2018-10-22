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
INSERT INTO lugar VALUES(NULL,Casa de campo,avenida la compañia,1000, 100000);
INSERT INTO lugar VALUES(NULL,Casa de palo,NULL,1000, 100000);






CREATE TABLE tipo_servicio(
    id INT AUTO_INCREMENT,
    tipo_servicio VARCHAR (30),
    costo_por_persona INT,
    PRIMARY KEY (id)
);

/*aca inserte INSERT con los datos correspondientes*/

INSERT INTO tipo_servicio VALUES(NULL,'Matrimonio',15000);
INSERT INTO tipo_servicio VALUES(NULL,'Linceciatura',12000);
INSERT INTO tipo_servicio VALUES(NULL,'Paseo',10000);



CREATE TABLE cliente(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    rut VARCHAR(13),
    direccion VARCHAR (100),
    /*telefono como varchar para evitar errores, se valida en el ingreso al sistema*/
    numero_telefono VARCHAR(12),
    PRIMARY KEY (id)
);

/*aca inserte INSERT con los datos correspondientes*/
INSERT INTO cliente VALUES(NULL,'Benjamin Lopez','13321321-7','santa cruz #1245','+56933140309');
INSERT INTO cliente VALUES(NULL,'Ismael Quintana','20026293-k','santa cruz de triana #1085','+5693548509');
INSERT INTO cliente VALUES(NULL,'Flavio Toro','13354189-5','santa cruz #1045','+56935875649');

CREATE TABLE evento (
    id INT AUTO_INCREMENT,
    fecha DATE,
    lugar_id_fk INT,
    cliente_id_fk INT,
    servicio id_fk INT,
    num_asistente INT,
    precio INT,
    PRIMARY KEY (id),
    FOREING KEY (lugar_id_fk) REFERENCES lugar(id),
    FOREING KEY (cliente_id_fk) REFERENCES cliente(id),
    FOREING KEY (servicio_id_fk) REFERENCES servicio(id)

);

/*aca inserte INSERT con los datos correspondientes*/
 INSERT INTO evento VALUES(NULL,'2018-10-22',1,2,3,150,(SELECT costo FROM tipo_servicio WHERE id =3 )* 150);
 INSERT INTO evento VALUES(NULL,'2018-10-22',2,1,1,100,(SELECT costo FROM tipo_servicio WHERE id =1 )* 100);
 INSERT INTO evento VALUES(NULL,'2018-10-22',1,3,2,77,(SELECT costo FROM tipo_servicio WHERE id =2 )* 77);