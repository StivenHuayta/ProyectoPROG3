 -- scripts sql

 -- creacion de sedes
INSERT INTO sedes(sede_id,nombre,direccion,telefono,activo) VALUES (501,"Principal","av. la republica 1130","999999999",1);
INSERT INTO sedes(sede_id,nombre,direccion,telefono,activo) VALUES (502,"Secundaria","av. arequipa 1130","999999998",1);

 -- creacion de roles
 
 INSERT INTO roles(rol_id,nombre,descripcion) VALUES (1,"ADMIN","administrador del negocio");
 INSERT INTO roles(rol_id,nombre,descripcion) VALUES (2,"EMPLEADO","encargado de brindar servicios");
 INSERT INTO roles(rol_id,nombre,descripcion) VALUES (3,"CLIENTE","cliente");
 
  -- creacion de puestos
  
INSERT INTO puestos(puesto_id,nombre,descripcion) VALUES (101,"VETERINARIO","Encargado de la salud de clientes");
INSERT INTO puestos(puesto_id,nombre,descripcion) VALUES (102,"ESTILISTA","Brinda servicios de estilaje a mascotas");
