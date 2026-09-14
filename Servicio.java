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
        this(nombre, duracionMinutos, precioBase, tipoServicio); // Reutiliza validaciones
        this.id = id;
        this.activo = activo;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
