package pe.pucp.progra3.mimados.model;

import java.time.LocalDateTime;

public class SedeServicio {
    private int id;
    private Servicio servicio;
    private Sede sede;
    private Boolean activo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
