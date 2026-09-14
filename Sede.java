public class Sede{
  private int id;
  private String nombre;
  private String direccion;
  private String telefono;
  private boolean activo; 


  
  //REGISTRO DE NUEVA SEDE
  public Sede(String nombre, String direccion, String telefono) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la sede es obligatorio.");
        }
        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("La dirección de la sede es obligatoria.");
        }
        
        this.nombre = nombre.trim();
        this.direccion = direccion.trim();
        this.telefono = telefono;
        this.activo = true; 
    }

  //CONSTRUCTOR DESDE SQL
  public Sede(int id, String nombre, String direccion, String telefono, boolean activo) {
        this(nombre, direccion, telefono); /
        this.id = id;
        this.activo = activo; 
    }


  public void desactivar() {
        this.activo = false;
    }

    public void activar() {
        this.activo = true;
    }
    
   
    public void actualizarDatosLogisticos(String nuevaDireccion, String nuevoTelefono) {
        if (nuevaDireccion != null && !nuevaDireccion.isBlank()) {
            this.direccion = nuevaDireccion.trim();
        }
        if (nuevoTelefono != null && !nuevoTelefono.isBlank()) {
            this.telefono = nuevoTelefono.trim();
        }
    }
  
  
  
  
  //------------------------------------------------------

  
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public boolean isActivo() { return activo; }

}
