package pe.pucp.progra3.mimados.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmpleadoPuesto {
    private int id;
    private Puesto puesto;
    private Empleado empleado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean activo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
