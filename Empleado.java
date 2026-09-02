import java.util.ArrayList;
import java.util.List;

public class Empleado extends Cliente {
    private String numeroColegiatura;
    private boolean activo;
    private List<RolEmpleado> roles;
    //chau horario
    private Sede sede;

    public Empleado() {
        super();
        this.activo = true;
        this.roles = new ArrayList<>();

    }

    public Empleado(int id, String dni, String nombres, String apellidos, 
                    String email, String passwordHash, String telefono, String direccion, 
                    String numeroColegiatura,Sede sede) {
        super(id, dni, nombres, apellidos, email, passwordHash, telefono, direccion);
        this.numeroColegiatura = numeroColegiatura;
        this.sede = sede;
        this.activo = true;
        this.roles = new ArrayList<>();

    }

    public void agregarRol(RolEmpleado rol) {
        if (!this.roles.contains(rol)) {
            this.roles.add(rol);
        }
    }

    public boolean tieneRol(RolEmpleado rol) {
        return this.roles.contains(rol);
    }

    public void agregarHorario(Horario horario) {
        this.horarios.add(horario);
    }
}
