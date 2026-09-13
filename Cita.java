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

	public Cita(int idCita, Sede sede, Empleado empleado, Mascota mascota, Servicio servicio, LocalDateTime fechaHoraCita, Estado estado) {
		this.idCita = idCita;
		this.sede = sede;
		this.empleado = empleado;
		this.mascota = mascota;
		this.servicio = servicio;
		this.fechaHoraCita = fechaHoraCita;
		this.estado = estado;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public LocalDateTime getFechaHoraCita() {
		return fechaHoraCita;
	}

	public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
		this.fechaHoraCita = fechaHoraCita;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
