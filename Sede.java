public class Sede{
  private int idSede;
  private String nombre;
  private String direccion;
  private String telefono;
  private boolean activo; 

  public Sede(int idSede,String nombre,String direccion,String telefono,boolean activo){
    this.idSede = idSede;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.activo = activo;
  }
  

  public int getIdSede() {
    return idSede;
  }

  public void setIdSede(int idSede) {
    this.idSede = idSede;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
