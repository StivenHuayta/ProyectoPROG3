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

    public Atencion() {}

    public Atencion(int id, Cita cita, Empleado atendidoPor, LocalDateTime fechaHora, double pesoActual, String temperatura, String motivoUObservaciones, String diagnostico, String recetaTratamiento, BigDecimal montoTotal) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Empleado getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(Empleado atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getMotivoUObservaciones() {
        return motivoUObservaciones;
    }

    public void setMotivoUObservaciones(String motivoUObservaciones) {
        this.motivoUObservaciones = motivoUObservaciones;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getRecetaTratamiento() {
        return recetaTratamiento;
    }

    public void setRecetaTratamiento(String recetaTratamiento) {
        this.recetaTratamiento = recetaTratamiento;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

}
