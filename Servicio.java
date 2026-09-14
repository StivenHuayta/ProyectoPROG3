import java.math.BigDecimal;

public class Servicio {
    private int id;
    private String nombre;             
    private int duracionMinutos;       
    private BigDecimal precioBase;     
    private TipoServicio tipoServicio; 
    private boolean activo;

    public Servicio() {}

    public Servicio(String nombre, int duracionMinutos, BigDecimal precioBase, TipoServicio tipoServicio) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del servicio es obligatorio.");
        }
        if (duracionMinutos <= 0) {
            throw new IllegalArgumentException("La duración del servicio debe ser mayor a 0 minutos.");
        }
        if (precioBase == null || precioBase.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio base no puede ser nulo ni negativo.");
        }
        if (tipoServicio == null) {
            throw new IllegalArgumentException("El tipo de servicio es obligatorio.");
        }

        this.nombre = nombre.trim();
        this.duracionMinutos = duracionMinutos;
        this.precioBase = precioBase;
        this.tipoServicio = tipoServicio;
        this.activo = true; 
    }

public Servicio(int id, String nombre, int duracionMinutos, BigDecimal precioBase, TipoServicio tipoServicio, boolean activo) {
        this(nombre, duracionMinutos, precioBase, tipoServicio); 
        this.id = id;
        this.activo = activo;
    }
//--------------------------------------------------------------------
public void actualizarPrecio(BigDecimal nuevoPrecio) {
        if (nuevoPrecio == null || nuevoPrecio.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El nuevo precio no puede ser nulo ni negativo.");
        }
        this.precioBase = nuevoPrecio;
    }

    public void actualizarDuracion(int nuevaDuracionMinutos) {
        if (nuevaDuracionMinutos <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor a 0.");
        }
        this.duracionMinutos = nuevaDuracionMinutos;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void activar() {
        this.activo = true;
    }



    
    //----------------------------------------------
    
   public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public BigDecimal getPrecioBase() { return precioBase; }
    public TipoServicio getTipoServicio() { return tipoServicio; }
    public boolean isActivo() { return activo; }

}
