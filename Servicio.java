import java.math.BigDecimal;

public class Servicio {
    private int id;
    private String nombre;             // Ej: "Consulta general", "Baño medicado"
    private int duracionMinutos;       // Indispensable para agendar
    private BigDecimal precioBase;     // Estandarizado con BigDecimal
    private TipoServicio tipoServicio; 
    private boolean activo;
}
