import java.util.List;
import java.util.ArrayList;

public class Cliente extends Usuario {
	protected String direccion;
    protected List<Mascota> mascotas;

	public Cliente() {
		super();
		this.mascotas = new ArrayList<>();
	}

	public Cliente(int id, String dni, String nombres, String apellidos, 
                   String email, String passwordHash, String telefono, String direccion) {
        super(id, dni, nombres, apellidos, email, passwordHash, telefono);
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

	public void registrarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
}
