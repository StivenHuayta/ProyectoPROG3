package pe.pucp.progra3.mimados.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Servicio {
    private int id;
    private String nombre;
    private String descripcion;
    private BigDecimal precioBase;
    private int duracionMinutos;
    private boolean activo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
