package pe.pucp.progra3.mimados.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Mascota {
    private int id;
    private Cliente cliente;
    private String nombre;
    private Especie especie;
    private String raza;
    private Sexo sexo;
    private LocalDate fechaNacimiento;
    private Double pesoReferencial;
    private Boolean activo;
    private List<Cita> citas;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
