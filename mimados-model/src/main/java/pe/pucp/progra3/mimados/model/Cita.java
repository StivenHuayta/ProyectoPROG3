package pe.pucp.progra3.mimados.model;

import java.time.LocalDateTime;

public class Cita {
    private int id;
    private Sede sede;
    private Empleado empleado;
    private Mascota mascota;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Estado estado;
    private String motivo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
