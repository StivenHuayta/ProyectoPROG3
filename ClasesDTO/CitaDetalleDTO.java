public class CitaDetalleDTO {
    private String fechaHora;
    private String estado; 
    private String nombreMascota;
    private String nombreCliente;
    private String nombreVeterinario;
    private String nombreSede; 
    
    public CitaDetalleDTO() {}

    public CitaDetalleDTO(String fechaHora, String estado, String nombreMascota, String nombreCliente, String nombreVeterinario, String nombreSede) {
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.nombreMascota = nombreMascota;
        this.nombreCliente = nombreCliente;
        this.nombreVeterinario = nombreVeterinario;
        this.nombreSede = nombreSede;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

}
