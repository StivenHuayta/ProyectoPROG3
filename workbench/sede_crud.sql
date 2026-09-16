DELIMITER //
 -- creacion de sedes C
DROP PROCEDURE IF EXISTS agregar_sede //
CREATE PROCEDURE agregar_sede( 
	nomb varchar(60), 
    dir varchar(60), 
    tel varchar(9)
    ) 
BEGIN

	INSERT INTO sedes(nombre,direccion,telefono,activo) VALUES (nomb,dir,tel,1);
	
END //



DROP PROCEDURE IF EXISTS mostrar_sede //
CREATE PROCEDURE mostrar_sede(id int )
BEGIN
	select * from sedes where sede_id=id;
	
END //

 -- actualizar direccion
DROP PROCEDURE IF EXISTS modificar_direccion //
CREATE PROCEDURE modificar_direccion(
	id int,
    dir varchar(60) 
    )
BEGIN
	UPDATE sedes SET direccion = dir WHERE sede_id = id;
END //
 -- eliminar sedes D
 
DROP PROCEDURE IF EXISTS eliminar_sede //
CREATE PROCEDURE eliminar_sede(id int)
BEGIN
	UPDATE sedes SET activo = 0 WHERE sede_id = id;
	
END //

-- mascotasssss

DROP PROCEDURE IF EXISTS agregar_mascota //
CREATE PROCEDURE agregar_mascota(
    p_id INT, 
    p_nombre VARCHAR(45), 
    p_especie VARCHAR(45), 
    p_raza VARCHAR(45), 
    p_sexo VARCHAR(45), 
    p_fecha_nacimiento DATE, 
    p_peso_referencial DECIMAL(5,2)
)
BEGIN
    INSERT INTO mascotas (
        cliente_id, 
        nombre, 
        especie, 
        raza, 
        sexo, 
        fecha_nacimiento, 
        peso_referencial, 
        fecha_registro
    ) 
    VALUES (
        p_id, 
        p_nombre, 
        p_especie, 
        p_raza, 
        p_sexo, 
        p_fecha_nacimiento, 
        p_peso_referencial, 
        NOW()
    );
END //



DROP PROCEDURE IF EXISTS mostrar_mascotas_dueno //
CREATE PROCEDURE mostrar_mascotas_dueno(id int )
BEGIN
	select * from mascotas where cliente_id=id;
	
END //

 -- actualizar nombre
DROP PROCEDURE IF EXISTS modificar_mascota_nombre //
CREATE PROCEDURE modificar_mascota_nombre(id int, nuevo_nom varchar(60) )
BEGIN
	UPDATE mascotas SET nombre = nuevo_nom WHERE mascota_id = id;
	
END //
 -- eliminar amscota
 
DROP PROCEDURE IF EXISTS eliminar_mascota //
CREATE PROCEDURE eliminar_mascota(id int)
BEGIN
	UPDATE mascotas SET activo = 0 WHERE mascota_id = id;
	
END //

DROP PROCEDURE IF EXISTS registrar_cita //
CREATE PROCEDURE registrar_cita(
    p_sede_id INT,
    p_empleado_id INT,
    p_mascota_id INT,
    p_fecha_hora_inicio DATETIME,
    p_fecha_hora_fin DATETIME,
    p_motivo VARCHAR(255)
)
BEGIN
    INSERT INTO citas (sede_id, empleado_id, mascota_id, fecha_hora_inicio, fecha_hora_fin, estado, motivo)
    VALUES (p_sede_id, p_empleado_id, p_mascota_id, p_fecha_hora_inicio, p_fecha_hora_fin, 'PROGRAMADA', p_motivo);
END //

-- 2. MOSTRAR CITAS (READ)
DROP PROCEDURE IF EXISTS mostrar_citas //
CREATE PROCEDURE mostrar_citas()
BEGIN
    SELECT * from citas;
END //

-- elminar cita
DROP PROCEDURE IF EXISTS cancelar_cita //
CREATE PROCEDURE cancelar_cita(
    p_cita_id INT
)
BEGIN
    UPDATE citas 
    SET estado = 'CANCELADA'
    WHERE cita_id = p_cita_id;
END //


DROP PROCEDURE IF EXISTS atender_cita //
CREATE PROCEDURE atender_cita(
    p_cita_id INT
)
BEGIN
    UPDATE citas 
    SET estado = 'ATENDIDA'
    WHERE cita_id = p_cita_id;
END //

-- ---------------------------------------------------------
DROP PROCEDURE IF EXISTS mostrar_empleados //
CREATE PROCEDURE mostrar_empleados()
BEGIN
    SELECT *
    FROM empleados;
END //



-- eliminar empleado
DROP PROCEDURE IF EXISTS eliminar_empleado //
CREATE PROCEDURE eliminar_empleado(
    p_empleado_id INT
)
BEGIN
    UPDATE empleados 
    SET activo = 0
    WHERE empleado_id = p_empleado_id;
END //

DELIMITER ;
