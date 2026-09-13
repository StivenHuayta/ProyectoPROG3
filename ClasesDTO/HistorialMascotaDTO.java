import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class HistorialMascotaDTO{
	private String nombreMascota;
	private String especie;
	private String edad;
	private String nombreOwner;
	private String telefonoOwner;
	private LocalDateTime fechaRegistro;
	private List<VisitaClinicaDTO> atencionesMedicas;
	
	public HistorialMascotaDTO() {}

	public HistorialMascotaDTO(String nombreMascota, String especie, String edad, String nombreOwner, String telefonoOwner, LocalDateTime fechaRegistro, List<VisitaClinicaDTO> atencionesMedicas) {
		this.nombreMascota = nombreMascota;
		this.especie = especie;
		this.edad = edad;
		this.nombreOwner = nombreOwner;
		this.telefonoOwner = telefonoOwner;
		this.fechaRegistro = fechaRegistro;
		this.atencionesMedicas = atencionesMedicas;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNombreOwner() {
		return nombreOwner;
	}

	public void setNombreOwner(String nombreOwner) {
		this.nombreOwner = nombreOwner;
	}

	public String getTelefonoOwner() {
		return telefonoOwner;
	}

	public void setTelefonoOwner(String telefonoOwner) {
		this.telefonoOwner = telefonoOwner;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<VisitaClinicaDTO> getAtencionesMedicas() {
		return atencionesMedicas;
	}

	public void setAtencionesMedicas(List<VisitaClinicaDTO> atencionesMedicas) {
		this.atencionesMedicas = atencionesMedicas;
	}

}
