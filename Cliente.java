import java.util.List;
import java.util.ArrayList;

public class Cliente extends Usuario {
	protected String direccion;
    protected List<Mascota> mascotas;

	public Cliente() {
		super();
		this.mascotas = new ArrayList<>();
	}
}
