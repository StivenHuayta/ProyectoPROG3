public class ServicioEstadisticaDTO{
	
	private String nombreServicio;
	private int cantidadSolicitudes;	
	private double totalGenerado;
	
	

	public ServicioEstadisticaDTO() {}

	public ServicioEstadisticaDTO(String nombreServicio, int cantidadSolicitudes, double totalGenerado) {
		this.nombreServicio = nombreServicio;
		this.cantidadSolicitudes = cantidadSolicitudes;
		this.totalGenerado = totalGenerado;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public int getCantidadSolicitudes() {
		return cantidadSolicitudes;
	}

	public void setCantidadSolicitudes(int cantidadSolicitudes) {
		this.cantidadSolicitudes = cantidadSolicitudes;
	}

	public double getTotalGenerado() {
		return totalGenerado;
	}

	public void setTotalGenerado(double totalGenerado) {
		this.totalGenerado = totalGenerado;
	}

}
