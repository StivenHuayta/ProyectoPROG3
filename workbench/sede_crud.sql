
DELIMITER //
 -- creacion de sedes C
DROP PROCEDURE IF EXISTS agregar_sede //
CREATE PROCEDURE agregar_sede(id int, nomb varchar(60), dir varchar(60), tel varchar(9)) 
BEGIN

	INSERT INTO sedes(sede_id,nombre,direccion,telefono,activo) VALUES (id,nomb,dir,tel,1);
	
END //

 -- actualizar direccion
DROP PROCEDURE IF EXISTS modificar_direccion //
CREATE PROCEDURE modificar_direccion(id int, dir varchar(60) )
BEGIN
	UPDATE sedes SET direccion = dir WHERE sede_id = id;
	
END //
 -- eliminar sedes D
 
DROP PROCEDURE IF EXISTS eliminar_sede //
CREATE PROCEDURE eliminar_sede(id int)
BEGIN
	UPDATE sedes SET activo = 0 WHERE sede_id = id;
	
END //
