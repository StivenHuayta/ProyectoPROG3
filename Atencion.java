import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Atencion {
    private int id;
    private Cita cita;
    private Mascota mascota;         // Obligatorio: a quién se atendió
    private Empleado atendidoPor;    // Obligatorio: quién lo atendió (Veterinario o Estilista)
    
    private LocalDateTime fechaHora; // Momento exacto de la atención
    private int idSede;
    private int idServicio;
    // Parámetros físicos tomados en el momento
    private double pesoActual;
    private String temperatura;      // Opcional para estética, vital para clínica
    
    // Notas y resultados
    private String motivoUObservaciones; // Sirve para corte/baño o síntomas
    private String diagnostico;          // Null si fue baño
    private String recetaTratamiento;    // Null si fue corte
    
    // Servicios ejecutados y liquidación económica
    private List<Servicio> serviciosRealizados = new ArrayList<>();
    private BigDecimal montoTotal;
}
