import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Atencion {
    private int id;
    private Cita cita;   
    
    private Empleado atendidoPor; // Quién lo atendió realmente
    private LocalDateTime fechaHora;

    
    // Parámetros físicos tomados en el momento
    private double pesoActual;
    private String temperatura;     
    
    private String motivoUObservaciones; // Sirve para corte/baño o síntomas
    private String diagnostico;          // Null si fue baño
    private String recetaTratamiento;    // Null si fue corte
    private BigDecimal montoTotal;
}
