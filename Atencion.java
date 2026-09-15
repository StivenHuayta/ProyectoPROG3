import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Atencion {
    private int id;
    private Cita cita;   
    
    private Empleado atendidoPor; // Quién lo atendió realmente. no hay en base de datos
    private LocalDateTime fechaHora; // 

    
    // Parámetros físicos tomados en el momento
    private double pesoActual;
    private String temperatura;     
    
    private String motivoUObservaciones; // Sirve para corte/baño o síntomas
    private String diagnostico;          // Null si fue estetica
    private String recetaTratamiento;    // Null si fue corte
    private BigDecimal montoTotal; // no hay monto total en la base de datos....
    //hay un varchar que guarda "observaciones" en la base de datos y aca no

    public Atencion() {}

    public Atencion(Cita cita, Empleado atendidoPor, double pesoActual, String temperatura, 
                    String motivoUObservaciones, String diagnostico, String recetaTratamiento, BigDecimal montoTotal) {
        
        if (cita == null || atendidoPor == null) {
            throw new IllegalArgumentException("La cita y el empleado son obligatorios para el registro.");
        }
        if (pesoActual <= 0) {
            throw new IllegalArgumentException("El peso registrado debe ser mayor a 0.");
        }
        if (montoTotal == null || montoTotal.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El monto total a cobrar no puede ser negativo.");
        }

        boolean esClinico = (diagnostico != null && !diagnostico.isBlank()) || 
                            (recetaTratamiento != null && !recetaTratamiento.isBlank());
                            
        if (esClinico && !atendidoPor.esVeterinario()) {
            throw new IllegalStateException("Solo un empleado con rol de VETERINARIO puede emitir diagnósticos y recetas.");
        }

        this.cita = cita;
        this.atendidoPor = atendidoPor;
        this.fechaHora = LocalDateTime.now(); 
        this.pesoActual = pesoActual;
        this.temperatura = temperatura;
        this.motivoUObservaciones = motivoUObservaciones;
        this.diagnostico = diagnostico;
        this.recetaTratamiento = recetaTratamiento;
        this.montoTotal = montoTotal;

        this.cita.marcarComoAtendida();
      
        this.cita.getMascota().actualizarPeso(this.pesoActual);
    }

public Atencion(int id, Cita cita, Empleado atendidoPor, LocalDateTime fechaHora, double pesoActual, 
                    String temperatura, String motivoUObservaciones, String diagnostico, 
                    String recetaTratamiento, BigDecimal montoTotal) {
        this.id = id;
        this.cita = cita;
        this.atendidoPor = atendidoPor;
        this.fechaHora = fechaHora;
        this.pesoActual = pesoActual;
        this.temperatura = temperatura;
        this.motivoUObservaciones = motivoUObservaciones;
        this.diagnostico = diagnostico;
        this.recetaTratamiento = recetaTratamiento;
        this.montoTotal = montoTotal;
    }

public boolean esAtencionMedica() {
        return (this.diagnostico != null && !this.diagnostico.isBlank()) || 
               (this.recetaTratamiento != null && !this.recetaTratamiento.isBlank());
    }

    //-----------------------------
    public int getId() { return id; }
    public Cita getCita() { return cita; }
    public Empleado getAtendidoPor() { return atendidoPor; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public double getPesoActual() { return pesoActual; }
    public String getTemperatura() { return temperatura; }
    public String getMotivoUObservaciones() { return motivoUObservaciones; }
    public String getDiagnostico() { return diagnostico; }
    public String getRecetaTratamiento() { return recetaTratamiento; }
    public BigDecimal getMontoTotal() { return montoTotal; }



}
