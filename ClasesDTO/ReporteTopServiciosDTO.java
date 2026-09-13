import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ReporteTopServiciosDTO{
	
	private String periodoEvaluado; 
	private Date fechaGeneracion; 
	private double ingresosTotalesDelPeriodo; 
	private List<ServicioEstadisticaDTO> topServicios;
	
	
	public ReporteTopServiciosDTO() {}

	public ReporteTopServiciosDTO(String periodoEvaluado, Date fechaGeneracion, double ingresosTotalesDelPeriodo, List<ServicioEstadisticaDTO> topServicios) {
		this.periodoEvaluado = periodoEvaluado;
		this.fechaGeneracion = fechaGeneracion;
		this.ingresosTotalesDelPeriodo = ingresosTotalesDelPeriodo;
		this.topServicios = topServicios;
	}

	public String getPeriodoEvaluado() {
		return periodoEvaluado;
	}

	public void setPeriodoEvaluado(String periodoEvaluado) {
		this.periodoEvaluado = periodoEvaluado;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public double getIngresosTotalesDelPeriodo() {
		return ingresosTotalesDelPeriodo;
	}

	public void setIngresosTotalesDelPeriodo(double ingresosTotalesDelPeriodo) {
		this.ingresosTotalesDelPeriodo = ingresosTotalesDelPeriodo;
	}

	public List<ServicioEstadisticaDTO> getTopServicios() {
		return topServicios;
	}

	public void setTopServicios(List<ServicioEstadisticaDTO> topServicios) {
		this.topServicios = topServicios;
	}

}
