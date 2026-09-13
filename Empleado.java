import java.util.ArrayList;
import java.util.List;

public class Empleado{
    private String numeroColegiatura;
    private boolean activo;
    private List<RolEmpleado> roles;
    
    private Sede sede;

    
    public Empleado() {}

    public Empleado(String numeroColegiatura, boolean activo, List<RolEmpleado> roles, Sede sede) {
        this.numeroColegiatura = numeroColegiatura;
        this.activo = activo;
        this.roles = roles;
        this.sede = sede;
    }

    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<RolEmpleado> getRoles() {
        return roles;
    }

    public void setRoles(List<RolEmpleado> roles) {
        this.roles = roles;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

}
