 -- creacion de sedes
INSERT INTO sedes(nombre,direccion,telefono,activo) VALUES ("Principal","av. la republica 1130","999999999",1);

INSERT INTO sedes(nombre,direccion,telefono,activo) VALUES ("Secundaia","av.  1130","999999998",1);

  -- creacion de puestos
  
INSERT INTO puestos(nombre,descripcion) VALUES ("VETERINARIO","Encargado de la salud de clientes");

INSERT INTO puestos(nombre,descripcion) VALUES ("ESTILISTA","Brinda servicios de estilaje a mascotas");

--  creacion de servicios

INSERT INTO servicios ( nombre, descripcion, precio_base, duracion_minutos, activo) VALUES
( 'Consulta General', 'Revision medica rutinaria', 35.00, 30, 1),
( 'Vacunacion Antirrabica', 'Aplicacion de dosis anual', 25.00, 15, 1),
( 'Desparasitacion Interna', 'Administracion de antiparasitario', 20.00, 15, 1),
( 'Limpieza Dental', 'Profilaxis dental bajo sedacion', 80.00, 60, 1),
( 'Esterilizacion Canina', 'Cirugia de control reproductivo', 150.00, 90, 1);

-- creacion de usuarios
INSERT INTO usuarios (dni, nombres, apellidos, email, password_hash, telefono, activo) VALUES
('72345678', 'Carlos Alberto', 'Gomez Ruiz', 'carlos.gomez@email.com', '1324', '987654321', 1),
('45612378', 'Maria Elena', 'Perez Torres', 'maria.perez@email.com', '12345', '912345678', 1),
('78945612', 'Juan Carlos', 'Lopez Quispe', 'juan.lopez@email.com', '1254', '955443322', 1),
('12345678', 'Ana Sofia', 'Huaman Castro', 'ana.huaman@email.com', '12345678', '999888777', 1);
-- emp
INSERT INTO usuarios (dni, nombres, apellidos, email, password_hash, telefono, activo) VALUES
('40123456', 'Roberto Carlos', 'Mendoza Silva', 'roberto.mendoza@vet.com', 'contrasena', '944556677', 1),
('42345678', 'Lucia Fernanda', 'Rojas Paredes', 'lucia.rojas@vet.com', 'pasword', '933221144', 1),
('44567890', 'Miguel Angel', 'Vargas Torres', 'miguel.vargas@vet.com', 'palabrallave', '922334455', 1);

-- servicios por sede


INSERT INTO sedes_servicios (servicio_id, sede_id, activo) VALUES
-- Sede principal
(1, 1, 1), -- Consulta General 
(2, 1, 1), -- Vacunación Antirrábica 
(3, 1, 1), -- Desparasitación Interna 
(4, 1, 1), -- Limpieza Dental 
(5, 1, 1), -- Esterilización Canina 

-- Sede secundaria
(1, 2, 1),
(2, 2, 1),
(3, 2, 1);


-- clientes
INSERT INTO clientes (usuario_id, direccion, contacto_emergencia, activo) VALUES
(1, 'Av. Los Pinos 145, Lima', '987111222', 1),
(2, 'Jr. Las Flores 320, San Isidro', '912333444', 1),
(3, 'Calle Los Rosales 89, Miraflores', '955777888', 1),
(4, 'Av. Brasil 1540, Breña', '999112233', 1);

-- empleados


INSERT INTO empleados (usuario_id, codigo_cmvp, fecha_contratacion, activo, es_admin, sede_id) VALUES
(5, 'CMVP-1234', '2023-01-15', 1, 1, 1), 
(6, 'CMVP-5678', '2023-03-20', 1, 0, 1), 
(7, 'CMVP-9012', '2024-02-10', 1, 0, 2); 
-- empleado horarios
-- Creación de horarios laborales para los empleados (IDs 1, 2 y 3)
INSERT INTO horarios_laborales (empleado_id, dia_semana, hora_inicio, hora_fin, activo) VALUES

(1, 1, '08:00:00', '16:00:00', 1), -- Lunes
(1, 2, '08:00:00', '16:00:00', 1), -- Martes
(1, 3, '08:00:00', '16:00:00', 1), -- Miércoles
(1, 4, '08:00:00', '16:00:00', 1), -- Jueves
(1, 5, '08:00:00', '16:00:00', 1), -- Viernes


(2, 1, '13:00:00', '21:00:00', 1), -- Lunes
(2, 2, '13:00:00', '21:00:00', 1), -- Martes
(2, 3, '13:00:00', '21:00:00', 1), -- Miércoles
(2, 4, '13:00:00', '21:00:00', 1), -- Jueves
(2, 5, '13:00:00', '21:00:00', 1), -- Viernes


(3, 1, '09:00:00', '17:00:00', 1), -- Lunes
(3, 2, '09:00:00', '17:00:00', 1), -- Martes
(3, 3, '09:00:00', '17:00:00', 1); -- Miércoles
-- empleados_puestos

INSERT INTO empleados_puestos (empleado_id, puesto_id) VALUES
(1, 1),
(2, 1), 
(3, 2);
-- mascotas


INSERT INTO mascotas (cliente_id, nombre, especie, raza, sexo, fecha_nacimiento, peso_referencial, fecha_registro) VALUES
(1, 'Firulais', 'Canino', 'Golden Retriever', 'Macho', '2022-05-10', 28.50, NOW()), 
(1, 'Luna', 'Felino', 'Siamés', 'Hembra', '2023-01-15', 4.20, NOW()),     
(2, 'Max', 'Canino', 'Pastor Alemán', 'Macho', '2021-11-20', 32.00, NOW()),  
(3, 'Simba', 'Felino', 'Persa', 'Macho', '2023-06-05', 3.80, NOW()),       
(4, 'Kira', 'Canino', 'Bulldog Francés', 'Hembra', '2022-08-12', 11.50, NOW()); 
-- -- Inserción de citas de ejemplo
INSERT INTO citas (sede_id, empleado_id, mascota_id, fecha_hora_inicio, fecha_hora_fin, estado, motivo) VALUES
(1, 1, 1, '2026-09-22 09:00:00', '2026-09-22 09:30:00', 'PROGRAMADA', 'Revision general y vacunacion de Firulais'),
(1, 2, 2, '2026-09-22 10:00:00', '2026-09-22 10:30:00', 'PROGRAMADA', 'Control preventivo de Luna'),
(2, 3, 3, '2026-09-23 11:00:00', '2026-09-23 11:30:00', 'PROGRAMADA', 'Consulta por malestar estomacal de Max');
-- citas-serv
INSERT INTO citas_servicios (cita_id, servicio_id, precio_aplicado, notas) VALUES

(1, 1, 35.00, 'Incluye revisión clínica general'),
(1, 2, 25.00, 'Aplicación de dosis anual antirrábica'),
(2, 1, 35.00, 'Control de rutina sin novedad'),
(3, 1, 35.00, 'Consulta de emergencia por malestar'),
(3, 3, 20.00, 'Administración de antiparasitario inyectable');

-- aten

INSERT INTO atenciones (cita_id, fecha_hora_registro, peso_actual, temperatura, sintomas,
						diagnostico, tratamiento_recetado, observaciones, monto_total) VALUES
(1, '2026-09-22 09:05:00', 28.70, 38.5, 'Ninguno, paciente activo', 'Paciente sano, apto para vacunación',
 'Aplicación de vacuna antirrábica anual', 'Se comporta muy bien en el consultorio', 60.00),
 
(2, '2026-09-22 10:05:00', 4.30, 38.8, 'Ninguno', 'Excelente estado de salud general', 
'Control preventivo y vitaminas', 'Felino dócil', 35.00),

(3, '2026-09-23 11:05:00', 31.80, 39.4, 'Decaimiento, vómitos leves y falta de apetito',
 'Gastroenteritis leve y parásitos', 'Dieta blanda por 3 días, protector gástrico y antiparasitario',
 'Repetir desparasitación en un mes', 55.00);
