import java.util.List;
import java.util.ArrayList;

public class Empleado extends Cliente {
	private String numeroColegiatura;
	private boolean activo;
	private List<RolEmpleado> roles;

	public Empleado() {
		super();
		this.activo = true;
		this.roles = new ArrayList<>();
	}

	public Empleado(int id, String dni, String nombres, String apellidos, 
                    String email, String passwordHash, String telefono, String direccion, 
                    String numeroColegiatura) {
        super(id, dni, nombres, apellidos, email, passwordHash, telefono, direccion);
        this.numeroColegiatura = numeroColegiatura;
        this.activo = true;
        this.roles = new ArrayList<>();
    }
}
