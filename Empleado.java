import java.util.ArrayList;
import java.util.List;

public class Empleado{

    private int id;
    private Persona datosPersonales;
    private String numeroColegiatura;
    private Usuario credenciales;
    private boolean activo;
    private List<RolEmpleado> roles;
    
    private Sede sede;

    
    public Empleado() {}

    public Empleado(Persona datosPersonales, Usuario credenciales, List<RolEmpleado> roles , String numeroColegiatura) {
        if (datosPersonales == null || credenciales == null  || roles == null) {
            throw new IllegalArgumentException("Faltan datos obligatorios para registrar al empleado.");
        }

        // --regla de negocio --
        if (roles.contains(RolEmpleado.VETERINARIO)) {
            if (numeroColegiatura == null || numeroColegiatura.isBlank()) {
                throw new IllegalArgumentException("Un veterinario requiere obligatoriamente un número de colegiatura.");
            }
            this.numeroColegiatura = numeroColegiatura.trim();
        } else {
            
            this.numeroColegiatura = null; 
        }

        this.datosPersonales = datosPersonales;
        this.credenciales = credenciales;
        this.rol = rol;

        this.activo = true; 
    }

    //CONSTRUCTOR DESDE DATOS DE SQL
    
    public Empleado(int id, Persona datosPersonales, Usuario credenciales, RolEmpleado rol, String numeroColegiatura, boolean activo) {
        this(datosPersonales, credenciales, rol, numeroColegiatura);
        this.id = id;
        this.activo = activo;
    }


public boolean esVeterinario() {
        return this.rol == RolEmpleado.VETERINARIO;
    }

    public void darDeBaja() {
        this.activo = false;
    }

    public void reincorporar() {
        this.activo = true;
    }
    
    public void trasladarDeSede(Sede nuevaSede) {
        if (nuevaSede == null) {
            throw new IllegalArgumentException("La nueva sede no puede ser nula.");
        }
        this.sede = nuevaSede;
    }




    //----------------------------------------------------------------------

    public int getid(){
        return id; 
    
    }

    public Persona getDatosPersonales() { 
        return datosPersonales; 
    } 
    
    public Usuario getCredenciales() { 
        return credenciales; 
    }
    
    
    
    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }


    public boolean isActivo() {
        return activo;
    }

   
    public List<RolEmpleado> getRoles() {
        return roles;
    }

    public Sede getSede() {
        return sede;
    }

}
