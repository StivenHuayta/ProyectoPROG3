import java.time.LocalDateTime;

public class Cita {
	private int idCita;
	private Sede sede;
	private Empleado empleado;
	private Mascota mascota;
	private Servicio servicio;
	private LocalDateTime fechaHoraCita;
	private Estado estado;

	public Cita() {}

	protected Cita() {}

    // Constructor para una NUEVA cita (Desde la interfaz del Cliente o Recepcionista)
    public Cita(Sede sede, Empleado empleado, Mascota mascota, Servicio servicio, LocalDateTime fechaHoraCita) {
        if (sede == null || empleado == null || mascota == null || servicio == null) {
            throw new IllegalArgumentException("Faltan datos obligatorios para registrar la cita.");
        }
       //REGLA PARA NO AGENDAR CITAS ABSURDAS
        if (fechaHoraCita == null || fechaHoraCita.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("No se puede agendar una nueva cita en el pasado.");
        }

        this.sede = sede;
        this.empleado = empleado;
        this.mascota = mascota;
        this.servicio = servicio;
        this.fechaHoraCita = fechaHoraCita;
        this.estado = Estado.PENDIENTE; // Toda cita nueva nace en estado PENDIENTE por defecto
    }

    // Constructor desde SQL
    public Cita(int id, Sede sede, Empleado empleado, Mascota mascota, Servicio servicio, LocalDateTime fechaHoraCita, Estado estado) {
        this.id = id;
        this.sede = sede;
        this.empleado = empleado;
        this.mascota = mascota;
        this.servicio = servicio;
        this.fechaHoraCita = fechaHoraCita;
        this.estado = estado;
    }



public void cancelar() {
        if (this.estado != Estado.PENDIENTE) {
            throw new IllegalStateException("Solo se pueden cancelar citas que estén pendientes.");
        }
        this.estado = Estado.CANCELADA;
    }

    public void marcarComoFinalizada() {
        if (this.estado != Estado.PENDIENTE) {
            throw new IllegalStateException("No se puede atender una cita que ya fue cancelada o finalizada.");
        }
        this.estado = Estado.FINALIZADA;
    }

    public void marcarFaltaDelCliente() {
        if (this.estado != Estado.PENDIENTE) {
            throw new IllegalStateException("Solo las citas pendientes pueden marcarse como canceladas.");
        }
        this.estado = Estado.CANCELADA;
    }

    public void reprogramar(LocalDateTime nuevaFecha, Empleado nuevoEmpleado) {
        if (this.estado != Estado.PENDIENTE) {
            throw new IllegalStateException("No se puede reprogramar una cita que ya cerró su ciclo.");
        }
        if (nuevaFecha.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("La nueva fecha debe ser en el futuro.");
        }
        this.fechaHoraCita = nuevaFecha;
        if (nuevoEmpleado != null) {
            this.empleado = nuevoEmpleado;
        }
    }














	
	//-----------------------------------------

	public int getId() { return id; }
    public Sede getSede() { return sede; }
    public Empleado getEmpleado() { return empleado; }
    public Mascota getMascota() { return mascota; }
    public Servicio getServicio() { return servicio; }
    public LocalDateTime getFechaHoraCita() { return fechaHoraCita; }
    public Estado getEstado() { return estado; }

}
