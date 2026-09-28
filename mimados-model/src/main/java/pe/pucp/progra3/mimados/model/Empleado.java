package pe.pucp.progra3.mimados.model;

import java.time.LocalDateTime;

public class Empleado {
    private Usuario usuario;
    private Sede sede;
    private String codigoCmvp;
    private Boolean esAdmin;
    private Boolean activo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
