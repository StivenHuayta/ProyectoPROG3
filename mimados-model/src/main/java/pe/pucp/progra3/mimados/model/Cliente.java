package pe.pucp.progra3.mimados.model;

import java.time.LocalDateTime;
import java.util.List;

public class Cliente {
    private Usuario usuario;
    private String direccion;
    private String telefonoEmergencia;
    private Boolean activo;
    private List<Mascota> mascotas;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

}
