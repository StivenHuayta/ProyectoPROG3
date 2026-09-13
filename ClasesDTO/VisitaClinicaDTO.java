import java.util.Date;

public class VisitaClinicaDTO{
	private Date fechaAtencion;
	private String nombreVeterinario; 
	private String especialidadVeterinario;
	private double pesoRegistrado;
	private String sintomas;
	private String diagnostico;
	private String tratamientoRecetado;
	
	
	public VisitaClinicaDTO() {}

	public VisitaClinicaDTO(Date fechaAtencion, String nombreVeterinario, String especialidadVeterinario, double pesoRegistrado, String sintomas, String diagnostico, String tratamientoRecetado) {
		this.fechaAtencion = fechaAtencion;
		this.nombreVeterinario = nombreVeterinario;
		this.especialidadVeterinario = especialidadVeterinario;
		this.pesoRegistrado = pesoRegistrado;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamientoRecetado = tratamientoRecetado;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public String getNombreVeterinario() {
		return nombreVeterinario;
	}

	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}

	public String getEspecialidadVeterinario() {
		return especialidadVeterinario;
	}

	public void setEspecialidadVeterinario(String especialidadVeterinario) {
		this.especialidadVeterinario = especialidadVeterinario;
	}

	public double getPesoRegistrado() {
		return pesoRegistrado;
	}

	public void setPesoRegistrado(double pesoRegistrado) {
		this.pesoRegistrado = pesoRegistrado;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamientoRecetado() {
		return tratamientoRecetado;
	}

	public void setTratamientoRecetado(String tratamientoRecetado) {
		this.tratamientoRecetado = tratamientoRecetado;
	}

}
