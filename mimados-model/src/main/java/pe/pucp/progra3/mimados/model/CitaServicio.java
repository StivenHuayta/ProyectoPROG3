package pe.pucp.progra3.mimados.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaServicio {
    private Cita cita;
    private SedeServicio sedeServicio;
    private BigDecimal precioAplicado;
    private String notas;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
