-- sdes
call agregar_sede('sedeprueba1','direcciongenerica','777');
call mostrar_sede(3);


-- CRUS MASCOTAS	
call agregar_mascota(1, 'Bobby', 'Canino', 'Poodle', 'Macho', '2023-04-10', 7.50);
call mostrar_mascotas_dueno(1);
call eliminar_mascota(2);
call mostrar_mascotas_dueno(1);

 -- CRUD citas
call mostrar_citas();
call atender_cita(3);

