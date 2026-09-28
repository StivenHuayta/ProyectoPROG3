package pe.pucp.progra3.mimados.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Atencion {
    private int id;
    private Cita cita;
    private Empleado empleado;
    private LocalDateTime fechaHoraRegistro;
    private Double pesoActual;
    private Double temperatura;
    private String sintomas;
    private String diagnostico;
    private String tratamientoRecetado;
    private String observaciones;
    private BigDecimal montoTotal;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
