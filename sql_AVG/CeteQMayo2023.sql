-- con dos guiones medios podemos escribir comentario
-- Ctrl + S es para guardar el script

/*
quedan comentarios de multiples lineas

SQL lenguaje de consulta estructura (structure Query Lanquage)
es un lenguaje para actualizar, obtener y calcular informacion en BD Relacionales

�QUE ES UNA BD?
conjunto de datos organizados entre si, y que son lamacenados en tablas


*/

-- la estructura de las tablas queda casi siempre de la siguiente manera:
--toda tabla debe  de llevar una llave primaria. Cada registro es identificado
--por una llave primaria (primary key, ID)
--Puede llevar tambien llave foranes
--Tipo de datos (Caracter, numericos, tipos fecha, etc)

-- Number Datos numericos
-- NVARCHAR2 entrada de datos de tipo caracter y alafanumericos
--NVARCHAR2 Tiene la particularidad de liberar espacio de memoria
-- por ejmeplo podemos tener un dato declarado  con 30 caracteres. Pero si no 
--se utiliza esos 30 caracteres, ese espacio es liberado .
--DATE -utilizado para manejo de fecha y hora.

--DDL -DATA DEFINITION LENGUAGE- creacion de tablas y estructuras
--DML - DATA MANIPULATION LENGUAGE - creacion de registro y manipulacion  de los mismos
 -- sentencias para la creacion de tablas
 --vamos a crear una tabla de alumnos
 
 -- Nombre, Apellido, Matricula
 
-- EDAD. La informacion debe estar corectamente definida o atomizada 
--  Fecha de nacimiento
--- Sexo, Gnenero, grado de estudio, Curp, status(ACTIVO O INACTIVO)
-- RECOMIENDO AMPLIAMENTE EL USO DE MAYUSCULAS

CREATE TABLE ALUMNO(
ID_ALUMNO NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2 (30),
FECHANAC DATE,
GENERO NVARCHAR2(10),
CURP NVARCHAR2(18),
GRADO NVARCHAR2(20),
STATUS NUMBER 
);
 
--Para ver la estructura de mi tabla mediante comando o sentencias se utiliza describenombre de la tabla:

DESCRIBE ALUMNO;
 
-- CREAR UNA TABLA CON CARRERAS O LICENCIATURAS PARA LOS ALUMNOS

CREATE TABLE CARRERAS(
ID_CARRERA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
AREA NVARCHAR2(50),
DURACION NUMBER(12),
NUM_MATERIAS NUMBER(8)
);
 
DESCRIBE CARRERAS

--RENOMBRAR UNA COLUMNA EN UNA TABLA

ALTER TABLE CARRERAS RENAME COLUMN NUM_MATERIAS TO MATERIAS;
 
--MODIFICAR EL TIPO DE DATO EN LA COLUMNA (FUNCIONA SIEMPRE Y CUANDO NO SE TENGA DATO EN ESA TABLA) 
 
ALTER TABLE CARRERAS MODIFY DURACION NVARCHAR2(20); 
 
-- PARA RELACIONAR DATOS POR EJEMPLO AQUI RELACIONAR A CADA  ALUMNO CON LA CARRERA A LA CUAL PERTENCECE
--ES MAS FACIL CREAR UNA TERCERA TABLA Y ESTABLECER ESA RELACION
-- CREAR TABLA LLAMADA CARREARAS ALUMNOS

CREATE TABLE CARRERAS_ALUMNOS(
ID_CA NUMBER PRIMARY KEY,
ID_ALUMNO NUMBER,
ID_CARRERA NUMBER
);
DESCRIBE CARRERAS_ALUMNOS;
 
--CREANDO RESTRICCIONES EN NUESTRAS TABLAS
--las identificamos por el comando CONTRAINT
--AGREGANDO UNA RESTRICCION DE LLAVE FORANEA


ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_ALUMNO
FOREIGN KEY (ID_ALUMNO)--EN QUE COLUMNA VAMOS A RECIBIR LA LLAVE O DATO
REFERENCES ALUMNO(ID_ALUMNO);-- DE DONDE VIENE (TABLA Y QUE COLUMNA)

ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_CARRERA
FOREIGN KEY (ID_CARRERA)
REFERENCES CARRERAS(ID_CARRERA);

--PODEMOS ESTABLECER UNA RESTRICCIONES RESPECTO A LO QUE QUEREMOS
--ESCRIBIR EN UNA DETERMINADA COLUMNA
--POR EJEMPLO EN LA TABLA ALUMNO UNICAMENTE ESV�BIRBIR EN LA COLUMNA
--DE GENERO QUE SEA SOLO "MASCULINO" O "FEMENINO"

ALTER TABLE ALUMNO ADD CONSTRAINT CHECK_GENERO
CHECK (GENERO IN ('MASCULINO','FEMENINO'));

--SENTENCIA PARA ELIMINAR UNA RESTRICCION

ALTER TABLE ALUMNO DROP CONSTRAINT CHECK_GENERO;

--crear una restriccion para nombres unicos o registros unicos

--POR EJMPLO EN LA TABLA CARRERAS, TENEMOS NOMBRES DE LICENCIATURAS
-- Y PUES ESTOS NO PUEDEN SER LOS MISMOS O REPETIDOS

ALTER TABLE CARRERAS ADD CONSTRAINT UNQ_NOMBRE_CARRERA
UNIQUE (NOMBRE);

--ISERCCION DE TABLAS DE DATOS
--INGRESAR DATOS EN LA TABLA ALUMNOS

DESCRIBE ALUMNO; 


-- CONSULTAR EL FORMATO DE MI SISTEMA 
SELECT SYSDATE FROM DUAL;


INSERT INTO ALUMNO VALUES(1,'ESMERALDA','05/09/90','FEMENINO','ESMGHTED215H6','8� SEMESTRE','1');
INSERT INTO ALUMNO VALUES(2,'OSCAR','08/09/95','MASCULINO','OSCAGHHJT215H6','8� SEMESTRE',1);
INSERT INTO ALUMNO VALUES(3,'JUAN PABLO','04/02/00','MASCULINO','JUPA00124CEA','8� SEMESTRE',1);
INSERT INTO ALUMNO VALUES(4,'EDUARDO','13/01/97','MASCULINO','EDU99902AFE','8� SEMESTRE',1);
INSERT INTO ALUMNO VALUES(5,'MARISELA','13/01/00','FEMENINO','MAR00451SC','8� SEMESTRE',1)

-- HACER UNA COSNULTA DE LOS DATOS DE UNA TABLA
SELECT * FROM ALUMNO;

--ACTUALIZAR UN DATO DE UN REGISTRO DETERMINADO
UPDATE ALUMNO SET FECHANAC = '4/02/82' WHERE ID_ALUMNO=2;

--REALIZAR UNA CONSULTA DE COLUMNAS ESPECIFICAS
SELECT ID_ALUMNO,NOMBRE FROM ALUMNO;

--CONSULTA UN REGISTRO DETERMINADO
SELECT * FROM ALUMNO WHERE NOMBRE='ESMERALDA';

--COMO BORRARNUN REGISTRO ESPECIFICO ((FILA)
DELETE FROM ALUMNO WHERE ID_ALUMNO=5; 

---para confirmar cambios en los cambios de los registros insertados
COMMIT;

--INSERTAR REGISTRO EN NUETRA TABLA CARRERAS
DESCRIBE CARRERAS;
INSERT INTO CARRERAS VALUES (1,'ING EN SISTEMAS','EXACTAS','8 SEMESTRES',8);
INSERT INTO CARRERAS VALUES (2,'ING EN MECATRONICA','EXACTAS','8 SEMESTRES',7);
INSERT INTO CARRERAS VALUES (3,'ING EN TELECOMUNICACION','EXACTAS','8 SEMESTRES',8);
INSERT INTO CARRERAS VALUES (4,'MEDICINA','BIOLOGIA','8 SEMESTRES',8);
INSERT INTO CARRERAS VALUES (5,'DERECHO','HUMANIDADES','8 SEMESTRES',8);

SELECT * FROM CARRERAS;

--ya que tenemos informacion en nuetras 2 tablas que son entidades fuerte podemos ahora si llenar o relacionar los datos en la tabla de
--carreras_alumnos
--INSERTAR DATOS EN LA TABLA CARRERAS_ALUMNOS

DESCRIBE CARRERAS_ALUMNOS;

INSERT INTO CARRERAS_ALUMNOS VALUES (1,1,5);
INSERT INTO CARRERAS_ALUMNOS VALUES (2,2,4);
INSERT INTO CARRERAS_ALUMNOS VALUES (3,3,1);
INSERT INTO CARRERAS_ALUMNOS VALUES (4,4,2);
INSERT INTO CARRERAS_ALUMNOS VALUES (5,5,1);

SELECT * FROM CARRERAS_ALUMNOS;

--COMO AGREGAR UNA COLUMNA A UNA TALA

DESCRIBE CARRERAS;

ALTER TABLE CARRERAS ADD PRESUPUSTO NUMERIC(8,2);

SELECT * FROM CARRERAS;

--ELIMINAR UNA COLUMNA
ALTER TABLE CARRERAS DROP COLUMN PRESUPUESTO;
SELECT * FROM CARRERAS;

--EJERCICIO 1
--CREAR UNA TABLA QUE SE LLAMA TUTURES
--COLUMNAS ID_TUTOR
--NOMBRE DEL TUTOR
--TELEFONO
--DIRECCION
--CLAVE DEL TUTOR RESTTRICCION QUE LA CLAVE SOLO PUEDE SER A,B,C,D


--CREAR OTRA TABLA RELACIONAL QUE SE LLAMA
--ALUMNOS 3 COLUMNAS
--ID DEL ALUMNO
--ID DEL TUTOR
--CREAR RESPECTIVAS LLAVES PRIMARIAS

--CREAR TABLA DE 5 REGISTROS


--CREAR TABLA DE LOS TUTORES

CREATE TABLE TUTORES(
ID_TUTORES NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2 (30),
TELEFONO NUMBER,
DIRECCION NVARCHAR2(50)
);
DESCRIBE TUTORES;
SELECT * FROM TUTORES;


ALTER TABLE TUTORES ADD CONSTRAINT FK_ID_TUTORES
FOREIGN KEY (ID_TUTORES)
REFERENCES TUTORES(ID_TUTORES);

ALTER TABLE TUTORES DROP CONSTRAINT FK_ID_TUTORES;

SELECT SYSDATE FROM DUAL;


INSERT INTO TUTORES VALUES(1,'PEDRO',74524656,'A.V MEXICO');
INSERT INTO TUTORES VALUES(2,'JUAN',9524864,'A.V MEXICO');
INSERT INTO TUTORES VALUES(3,'LUIS',1245648,'A.V MEXICO');
INSERT INTO TUTORES VALUES(4,'JORGE',15868486,'A.V MEXICO');
INSERT INTO TUTORES VALUES(5,'PAOLA',72546462,'A.V MEXICO');

--CREAR TABLA RELACION DE LOS TUTORES Y ALUMNOS

CREATE TABLE TUTORES_ALUMNOS(
ID_TUTO NUMBER PRIMARY KEY,
ID_TUTORES NUMBER, 
ID_ALUMNOS NUMBER
);
ALTER TABLE TUTORES_ALUMNOS ADD CONSTRAINT FK_ID_TUTORES
FOREIGN KEY (ID_TUTORES)
REFERENCES TUTORES(ID_TUTORES);

ALTER TABLE TUTORES_ALUMNOS ADD CONSTRAINT FK_ID_ALUMNOS
FOREIGN KEY (ID_ALUMNOS)
REFERENCES ALUMNO(ID_ALUMNO);

DESCRIBE TUTORES_ALUMNOS;
SELECT
    * FROM TUTORES_ALUMNOS;
    

INSERT INTO TUTORES_ALUMNOS VALUES (1,1,5);
INSERT INTO TUTORES_ALUMNOS VALUES (2,2,4);
INSERT INTO TUTORES_ALUMNOS VALUES (3,3,1);
INSERT INTO TUTORES_ALUMNOS VALUES (4,4,2);
INSERT INTO TUTORES_ALUMNOS VALUES (5,5,1);
SELECT * FROM TUTORES_ALUMNOS;




---crear una tabla  que se llame padres
--que tenga su propio id
--nombre, direccion telefono, genero
--check genero masculino, femenino
--crear una tabla relacionar
--padres_alumnos
--id_pa 
--id_alumn
--id_padre
--crear sus respectivas  llaves foraneas

/*************************************************EJERCICIO 3************************************************/



CREATE TABLE PADRES(
ID_PADRES NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2 (30),
TELEFONO NVARCHAR2(10),
DIRECCION NVARCHAR2(50),
GENERO NVARCHAR2(10)
);

ALTER TABLE PADRES ADD CONSTRAINT CHECK_GEN CHECK (GENERO IN ('MASCULINO','FEMENINO'));


CREATE TABLE PADRES_ALUMNOS(
ID_PA NUMBER PRIMARY KEY, 
ID_ALUMNOS NUMBER,
ID_PADRES NUMBER
);

ALTER TABLE PADRES_ALUMNOS ADD CONSTRAINT FK_ID_PADRES
FOREIGN KEY (ID_PADRES)
REFERENCES PADRES(ID_PADRES);


ALTER TABLE PADRES_ALUMNOS ADD CONSTRAINT FK_ID_ALUM
FOREIGN KEY (ID_ALUMNOS)
REFERENCES ALUMNO(ID_ALUMNO);


/*************************SECUENCIAS********************************************/

--CREANDO SECUENCIAS
--SE EMPLEAN PARA GENERAR VALORES DE NUMEROS ENTEROS DE PREFERENCIAS SEAN CONSECUTIVOS
--(INCREMENTO   DE 1 EN 1). O PUEDEN SER CON UN INCREMENTO QUE NOSOTROS NECESITEMOS
--SE UTILIZA PARA GENERAR LAS LLAVES PRIMARIAS  Y ASI AEGURARNOS QUE LOS VALORES NO SE REPITAN

--CREANDO UNA SECUENCIA DEFINIENDO LOS VALORES

CREATE SEQUENCE ALUMNO_SEQ /*CREAMOS LA SECUENCIA Y SU NOMBRE*/
START WITH 6 --EL VALOR A PARTIR DEL CUAL INICIA LA SECUNCIA
INCREMENT BY 1 --INCREMENTA EL VALOR COMO SE LE INDICA
MAXVALUE 999 ---INDICAMOS EL VALOR MAXIMO HASTA EL QUE LLEGA LA SECUENCIA
MINVALUE 1 ---INDICAMOS QUE EL VALOR SEA MENOR DE LA SETENCIA
NOCYCLE; ----INDICAMOS SI LA SECUENCIA UNA VEZ FINALIZADO  SE CICLE (CYCLE) O NO


--BORRAR UNA SECUENCIA
DROP SEQUENCE ALUMNO_SEQ;

-- CREAR UNA SENTENCIA CON VALORES POR DEFECTO (PARA TABLAS DE NUEVA CREACION)
CREATE SEQUENCE TUTORES_SEQ;

--TRIGGER O DISPARADOR  EJECUTA UNA ACCION O DESENCADENAR UN EVENTO
CREATE TRIGGER INSERT_IDALUMNO
BEFORE INSERT ON ALUMNO FOR EACH ROW BEGIN
SELECT ALUMNO_SEQ.NEXTVAL INTO:NEW.ID_ALUMNO FROM DUAL;
END;

---INTENTANDO HACER UNA TABLA ALUMNO
DESCRIBE ALUMNO;
INSERT INTO ALUMNO VALUES
(1,'ALFONSO','28/01/00','MASCULINO','VEGA000128','8� SEMESTRE',1);

SELECT * FROM ALUMNO;

--CREANDO EL TRIGGER PARA LA TABLA TUTORES

CREATE TRIGGER INSERT_IDTUTORES
BEFORE INSERT ON TUTORES FOR EACH ROW BEGIN
SELECT TUTORES_SEQ.NEXTVAL INTO:NEW.ID_TUTORES FROM DUAL;
END;
DESCRIBE TUTORES;
INSERT INTO TUTORES VALUES
(1,'YULISA','8515315','PUEBLA');

--OTRA FORMA DE INSERCION MASIVA
INSERT ALL
INTO ALUMNO (NOMBRE, FECHANAC,GENERO,CURP,GRADO,STATUS) VALUES ('PEDRO','18/01/1997','MASCULINO','VAGDAS','8� SEMESTRE',1)
INTO ALUMNO (NOMBRE, FECHANAC,GENERO,CURP,GRADO,STATUS) VALUES ('PABLO','18/01/1998','MASCULINO','SFGVZE','8� SEMESTRE',1)
INTO ALUMNO (NOMBRE, FECHANAC,GENERO,CURP,GRADO,STATUS) VALUES ('HUGO','18/01/1999','MASCULINO','AFRVE','8� SEMESTRE',1)

SELECT * FROM DUAL;

/*****************************EJERCICIO 1 ASUNTOS*********************************************/

CREATE TABLE PERIODO(
ID_PERIODOS NUMBER PRIMARY KEY,
FECHAINI DATE,
FECHAFIN DATE
);
DESCRIBE PERIODO;

INSERT INTO PERIODO VALUES(1,'15/06/2023','20/06/2023');
INSERT INTO PERIODO VALUES(2,'1/05/2023','20/12/2024');
INSERT INTO PERIODO VALUES(3,'12/01/2023','20/11/2025');
INSERT INTO PERIODO VALUES(4,'23/08/2023','20/11/2026');
INSERT INTO PERIODO VALUES(5,'9/03/2023','20/10/2027');
SELECT * FROM PERIODO;

CREATE TABLE ESTADO(
ID_ESTADO NUMBER PRIMARY KEY,
TRAMITE NVARCHAR2(50),
ARCHIVOS NVARCHAR2(50)
);
DESCRIBE ESTADO;

INSERT INTO ESTADO VALUES(1,'ACTA DE NACIMIENTO','PENAL');
INSERT INTO ESTADO VALUES(2,'COMPROVANTE DE DOMICILIO','CODIGO PENAL');
INSERT INTO ESTADO VALUES(3,'CURP','PENAL');
INSERT INTO ESTADO VALUES(4,'INE','PENAL');
INSERT INTO ESTADO VALUES(5,'LICENCIA','PENAL');
SELECT * FROM ESTADO;


CREATE TABLE CLIENTE(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NVARCHAR2(10),
GEN NVARCHAR2(20),
CURP NVARCHAR2(20)
);
DESCRIBE CLIENTE;

ALTER TABLE CLIENTE ADD CONSTRAINT CHECK_GEN2
CHECK (GEN IN ('MASCULINO','FEMENINO'));


INSERT INTO CLIENTE VALUES(1,'ESMERALDA','EDOMEX','41215132','FEMENINO','CHGFT467FGC');
INSERT INTO CLIENTE VALUES(2,'PEDRO','YUCATAN','154621435','MASCULINO','FTRSD5RFGC');
INSERT INTO CLIENTE VALUES(3,'CARLOS','VERACRUZ','121354358','MASCULINO','VGD5RE5DHV');
INSERT INTO CLIENTE VALUES(4,'JUAN','PUEBLA','77515154','MASCULINO','KYHVHGF87V');
INSERT INTO CLIENTE VALUES(5,'DIANA','EDOMEX','72121546','FEMENINO','VTCGHSRT67');
SELECT * FROM CLIENTE;

CREATE TABLE ALMACENAR(
ID_ALMACENAR NUMBER PRIMARY KEY,
ID_PERIODOS NUMBER,
ID_ESTADO NUMBER,
ID_CLIENTE NUMBER
);
DESCRIBE ALMACENAR;

ALTER TABLE ALMACENAR ADD CONSTRAINT FK_ID_ALMACENAR
FOREIGN KEY (ID_ALMACENAR)
REFERENCES ALMACENAR(ID_ALMACENAR);

ALTER TABLE ALMACENAR ADD CONSTRAINT FK_ID_CLIENTE
FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTE(ID_CLIENTE);

ALTER TABLE ALMACENAR ADD CONSTRAINT FK_ID_ESTADO
FOREIGN KEY (ID_ESTADO)
REFERENCES ESTADO(ID_ESTADO);


CREATE SEQUENCE CLIENTE_SEQ 
START WITH 6 
INCREMENT BY 1 
MAXVALUE 999 
MINVALUE 1 
NOCYCLE;

COMMIT;

/************************************** EJERCICIO 3 CLUB NAUTICO *****************************************/

CREATE TABLE SOCIO(
ID_SOCIO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(50),
DIRECCION NVARCHAR2(30),
TELEFONO NVARCHAR2(10)
);

CREATE SEQUENCE SOCIO_SEQ;

CREATE TRIGGER INSERT_SOCIO
BEFORE INSERT ON SOCIO FOR EACH ROW BEGIN
SELECT SOCIO_SEQ.NEXTVAL INTO:NEW.ID_SOCIO FROM DUAL;
END;

CREATE TABLE BARCO(
ID_BARCO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(50),
NUM_AMARRE NUMBER(30),
CUOTA NUMBER(10,2)
);

CREATE SEQUENCE BARCO_SEQ;

CREATE TRIGGER INSERT_BARCO
BEFORE INSERT ON BARCO FOR EACH ROW BEGIN
SELECT BARCO_SEQ.NEXTVAL INTO:NEW.ID_BARCO FROM DUAL;
END;

CREATE TABLE PATRON(
ID_PATRON NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(50),
DIRECCION NVARCHAR2(30),
TELEFONO NVARCHAR2(10)
);

CREATE SEQUENCE PATRON_SEQ;

CREATE TRIGGER INSERT_PATRON
BEFORE INSERT ON PATRON FOR EACH ROW BEGIN
SELECT PATRON_SEQ.NEXTVAL INTO:NEW.ID_PATRON FROM DUAL;
END;

CREATE TABLE SOCIOS_BARCO(
ID_SB NUMBER PRIMARY KEY,
ID_SOCIO NUMBER,
ID_BARCO NUMBER,
CONSTRAINT FK_ID_SOCIO
FOREIGN KEY (ID_SOCIO)
REFERENCES SOCIO(ID_SOCIO),
CONSTRAINT FK_ID_BARCO
FOREIGN KEY (ID_BARCO)
REFERENCES BARCO(ID_BARCO)
);
COMMIT;



CREATE SEQUENCE SOCIOSBARCO_SEQ;

CREATE TRIGGER INSERT_SOCIOSBARCO
BEFORE INSERT ON SOCIOS_BARCO FOR EACH ROW BEGIN
SELECT SOCIOSBARCO_SEQ.NEXTVAL INTO:NEW.ID_SB FROM DUAL;
END;

CREATE TABLE SALIDAS(
ID_SALIDAS NUMBER PRIMARY KEY,
DESTINO NVARCHAR2(50),
FECHASALIDA DATE,
ID_BARCO NUMBER,
ID_PATRON NUMBER,
CONSTRAINT FK_IDBARCO FOREIGN KEY (ID_BARCO)REFERENCES BARCO(ID_BARCO),
CONSTRAINT FK_IDPATRON FOREIGN KEY (ID_PATRON)REFERENCES PATRON(ID_PATRON)
);

CREATE SEQUENCE SALIDASBARCO_SEQ;

CREATE TRIGGER INSERT_SALIDASBARCO  
BEFORE INSERT ON SALIDAS FOR EACH ROW BEGIN
SELECT SALIDASBARCO_SEQ.NEXTVAL INTO:NEW.ID_SALIDAS FROM DUAL;
END;

--INSERTAR DATOS EN LAS TABLAS
INSERT ALL
INTO SOCIO(NOMBRE, DIRECCION, TELEFONO) VALUES('ESMERALDA','ACAPULCO','742465324')
INTO SOCIO(NOMBRE, DIRECCION, TELEFONO) VALUES('JOSE DAVID','CHIAPAS','961154216')
INTO SOCIO(NOMBRE, DIRECCION, TELEFONO) VALUES('JONATHAN','CHIAPAS','961541543')
INTO SOCIO(NOMBRE, DIRECCION, TELEFONO) VALUES('ANTONIO','EDOMEX','52541256')
INTO SOCIO(NOMBRE, DIRECCION, TELEFONO) VALUES('ALEX','EDOMEX','524861454')
SELECT*FROM DUAL;

INSERT ALL
INTO PATRON(NOMBRE, DIRECCION, TELEFONO) VALUES('JUAN PABLO','MORELOS','54512135')
INTO PATRON(NOMBRE, DIRECCION, TELEFONO) VALUES('MARICELA','EDOMEX','52724584')
INTO PATRON(NOMBRE, DIRECCION, TELEFONO) VALUES('ALFONSO','EDOMEX','527224547')
INTO PATRON(NOMBRE, DIRECCION, TELEFONO) VALUES('JUAN OSCAR','VERACRUZ','56211537')
INTO PATRON(NOMBRE, DIRECCION, TELEFONO) VALUES('RAFAEL','QUERETARO','515465234')
SELECT*FROM DUAL;

DESCRIBE BARCO;

INSERT ALL
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES('LA NI�A', 101, 1200.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES('PINTA', 102, 1800.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES('LA SANTA MARIA', 103, 2000.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES('PERLA NEGRA', 104, 5500.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES('EL HOLANDES', 105, 3200.50)
SELECT*FROM DUAL;

INSERT ALL 
INTO SOCIOS_BARCO (ID_SOCIO, ID_BARCO) VALUES (1,5)
INTO SOCIOS_BARCO (ID_SOCIO, ID_BARCO) VALUES (2,4)
INTO SOCIOS_BARCO (ID_SOCIO, ID_BARCO) VALUES (3,1)
INTO SOCIOS_BARCO (ID_SOCIO, ID_BARCO) VALUES (4,2)
INTO SOCIOS_BARCO (ID_SOCIO, ID_BARCO) VALUES (5,1)
SELECT*FROM DUAL;

INSERT ALL
INTO SALIDAS (DESTINO, FECHASALIDA, ID_BARCO, ID_PATRON) VALUES ('VERACRUZ',TO_DATE('16/06/2023 08:00:00','DD-MM-YYYY HH24:MI:SS'), 1, 1)
INTO SALIDAS (DESTINO, FECHASALIDA, ID_BARCO, ID_PATRON) VALUES ('VILLA HERMOSA',TO_DATE('17/06/2023 08:30:00','DD-MM-YYYY HH24:MI:SS'), 2, 2)
INTO SALIDAS (DESTINO, FECHASALIDA, ID_BARCO, ID_PATRON) VALUES ('CAMPECHE',TO_DATE('18/06/2023 09:00:00','DD-MM-YYYY HH24:MI:SS'), 3, 3)
INTO SALIDAS (DESTINO, FECHASALIDA, ID_BARCO, ID_PATRON) VALUES ('YUCATAN',TO_DATE('19/06/2023 08:40:00','DD-MM-YYYY HH24:MI:SS'), 4, 4)
INTO SALIDAS (DESTINO, FECHASALIDA, ID_BARCO, ID_PATRON) VALUES ('CANCUN',TO_DATE('20/06/2023 05:00:00','DD-MM-YYYY HH24:MI:SS'), 5, 5)
SELECT * FROM DUAL;

SELECT * FROM SALIDAS;

COMMIT;

---CONSULTAR HORA Y FECHA
SELECT ID_SALIDAS, DESTINO, TO_CHAR(FECHASALIDA, 'HH24:MI:SS') FROM SALIDAS;

--PARA BORRAR REGISTROS ES CON
DELETE FROM SALIDAS WHERE id_salidas=5;

SELECT * FROM SALIDAS;

---EXISTE UN COMANDO QUE NOS PERMITE REGRESAR EL ULTIMO COMIT ESTO SE LOGRA EN CASO DE INSERCION, BORRADO O ACTUALIZADO DE DATOS

ROLLBACK;

--CONSULTAS CON COLUMNAS ESPECIFICAS    
SELECT ID_SALIDAS, DESTINO FROM SALIDAS;

SELECT * FROM BARCO;
--REALIZANDO UNA CONSULTA CON ALGUNA CONDICCION
SELECT ID_BARCO, NOMBRE FROM BARCO WHERE CUOTA>3000;

--PODEMOS REALIZAR UNA CONSULTA CON MAS CONDICIONES
SELECT ID_BARCO, NOMBRE FROM BARCO WHERE CUOTA>3000 AND NOMBRE='PERLA NEGRA';

--REALIZAMOS UNA CONSULTA PARA BUSCAR RANGOS
SELECT * FROM BARCO WHERE CUOTA BETWEEN 1000 AND 3000;

SELECT * FROM ALUMNO;

DELETE FROM ALUMNO WHERE NOMBRE='ALEJANDO';

---BUSCAR DETERMINADOS VLORS SIMILARES
SELECT* FROM ALUMNO WHERE NOMBRE LIKE 'E%';
SELECT* FROM ALUMNO WHERE NOMBRE LIKE '%O';

--CONSULTA CON FUNCIONES DE VALORES DE MX Y MIN 
SELECT MAX (CUOTA) FROM BARCO;
SELECT MIN (CUOTA) FROM BARCO;

--BUSCAR O CONSULTAR EL BARCO CON MAX CUOTA
SELECT * FROM BARCO WHERE CUOTA= (SELECT MAX (CUOTA) FROM BARCO);

--REALIZAR UN CONTEO DE FILAS PARA DETERMINADOS DATOS
SELECT COUNT (ID_BARCO) FROM BARCO WHERE CUOTA<3000;

--MOSTRAR EL TOTAL DE REGISTRO DE UNA TABLA
SELECT COUNT (ID_ALUMNO) FROM ALUMNO;

---OBTENER EL PROMEDIO DE LOS VALORES DE UNA CLUMNA
SELECT AVG (CUOTA) FROM BARCO;

--REALIZAR LA SUMATORIA DE LOS VALORES 
SELECT SUM (CUOTA) FROM BARCO;

--FUNCIONES GROUP BY
-- REALIZAR UN CONTROL DE ALUMNOS Y AGRUPAR CUANTOS HAY POR GENERO
SELECT COUNT (ID_ALUMNO), GENERO FROM ALUMNO GROUP BY GENERO;

SELECT * FROM ALUMNO;

---ORDENAR LOS REGISTROS POR ALGUNA COLUMNA EN ESTE CASO POR LA COLUMNA NOMBRES Y PODEMOS ORDENAR DE MANERA ASCEDENTE O DESCEDENTE
SELECT * FROM ALUMNO ORDER BY NOMBRE DESC;

SELECT * FROM ALUMNO ORDER BY NOMBRE ASC;

COMMIT;

/*******************************EJERCICIO DE CONSULTA DE DATOS***************************************************/
---BUSCAR LOS DATOS DEL PATRON QUE HAYA ESTADO EN LA SALIDA CON EL BARCO PERTENENCITE AL SOCIO 1

---podriamos ejecutar busquedas por separado y posteriormente unirlas para llegar al resultado

---buscamos el socio 1, que barco le pertence
SELECT  * FROM SOCIOS_BARCO;
--AHORA BUSCAMOS EN QUE SALIDA ESTUVO ESE BARCO QUE PERTENECE AL SOCIO 1
SELECT *FROM SALIDAS;

SELECT * FROM PATRON 
WHERE ID_PATRON IN 
(SELECT ID_PATRON FROM SALIDAS WHERE ID_BARCO IN 
(SELECT ID_BARCO FROM SOCIOS_BARCO WHERE ID_SOCIO= 1));

---CONSULTAS CON JOINS
--INNER JOINS
---MUESTRA LOS REGISTROS QUE COINCIDEN DE UNA TABLA "A" Y UNA TABLA "B" LAS COICIDENCIAS SE DA GRACIAS AL DATO QUE 
--COMPARTEN EN COMUN, QUE EN ESTE CASO SON NUESTRAS LLAVES PRIMARIAS Y LAS LLAVES FORANEAS

-- FORMA EXPLICITA- INICIANDO LA SENTENCIA CON INNER JOIN O JOIN

--VAMOS A UNIR LA TABLA DE ALUMNOS
--CON LA TABLA DE CARRERAS, PERO RECURRIMOS A LA TABLA RELACIONAL

SELECT * FROM ALUMNO;

SELECT * FROM CARRERAS;

--UNIMOS DE LA TABLA DE ALUMNO CON LA CARRERA _ALUMNOS POR QUE AHI TIENEN UN CAMPO EN COMUN
--QUE ES EL ID_ALUMNO (LLAVE KEY EN LA TABLA ALUMNO )

SELECT * FROM ALUMNO
    INNER JOIN CARRERAS_ALUMNOS
        ON ALUMNO.ID_ALUMNO = CARRERAS_ALUMNOS.ID_ALUMNO;
        
--PODEMOS UNIR LA SEGUNDA TABLA "CARRERAS"

SELECT * FROM ALUMNO
    INNER JOIN CARRERAS_ALUMNOS
        ON ALUMNO.ID_ALUMNO = CARRERAS_ALUMNOS.ID_ALUMNO
        INNER JOIN CARRERAS
        ON CARRERAS_ALUMNOS.ID_CARRERA=CARRERAS.ID_CARRERA;

--�PODEMOS IDENTIFICAR LAS TABLAS ALIAS

SELECT A.ID_ALUMNO, A.NOMBRE, C.NOMBRE FROM ALUMNO A
    INNER JOIN CARRERAS_ALUMNOS CA
        ON A.ID_ALUMNO = CA.ID_ALUMNO
        INNER JOIN CARRERAS C
        ON CA.ID_CARRERA= C.ID_CARRERA;

--REVISANDO LA CONSULTA CON LEFT JOIN
--PRIORIZA LA INFORMACION DE A TABLA A, SOBRE  LA TABLA B
SELECT* FROM ALUMNO
LEFT JOIN CARRERAS_ALUMNOS
ON ALUMNO.ID_ALUMNO = CARRERAS_ALUMNOS.ID_ALUMNO;

--
SELECT* FROM ALUMNO
RIGHT JOIN CARRERAS_ALUMNOS
ON ALUMNO.ID_ALUMNO = CARRERAS_ALUMNOS.ID_ALUMNO;

--TENEMOS TAMBIEN AL FULL OUTER JOIN QUE MUETRAS TODAS LAS COICIDNECIAS, HAYA ONO.
SELECT* FROM ALUMNO
FULL OUTER JOIN CARRERAS_ALUMNOS
ON ALUMNO.ID_ALUMNO = CARRERAS_ALUMNOS.ID_ALUMNO;

---RESOLVIENDO EL EJERCICIO ANTERIOR CON JOINS
SELECT P.ID_PATRON, P.NOMBRE, P.DIRECCION, P.TELEFONO FROM PATRON P 
INNER JOIN SALIDAS S 
ON P.ID_PATRON=S.ID_PATRON
INNER JOIN SOCIOS_BARCO SB
ON SB.ID_BARCO= S.ID_BARCO
WHERE SB.ID_SOCIO=1;

COMMIT;