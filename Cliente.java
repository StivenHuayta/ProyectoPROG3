import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private int id; 
	private Usuario credenciales; 
	private String direccion;
	private String contactoDeEmergencia; 
	private List<Mascota> mascotas;

	
	public Cliente() {}

	//CONSTRUCTOR PARA NUEVOS REGISTROS
	public Cliente( Usuario credenciales, String direccion, String contactoDeEmergencia) {
        if (credenciales == null) {
            throw new IllegalArgumentException("El cliente debe tener datos personales y credenciales de acceso");
        }
        if (contactoDeEmergencia == null || contactoDeEmergencia.isBlank()) {
            throw new IllegalArgumentException("El contacto de emergencia es obligatorio para la clínica");
        }

        this.datosPersonales = datosPersonales;
        this.credenciales = credenciales;
        this.direccion = direccion;
        this.contactoDeEmergencia = contactoDeEmergencia;
    }

public Cliente(int id, Usuario credenciales, String direccion, String contactoDeEmergencia) {
        this(credenciales, direccion, contactoDeEmergencia);
        this.id = id;
    }

public void actualizarDatosLogisticos(String nuevaDireccion, String nuevoContactoEmergencia) {
        if (nuevaDireccion != null && !nuevaDireccion.isBlank()) {
            this.direccion = nuevaDireccion;
        }
        if (nuevoContactoEmergencia != null && !nuevoContactoEmergencia.isBlank()) {
            this.contactoDeEmergencia = nuevoContactoEmergencia;
        }
    }



	
	public int getId() {
        return this.id;
    } 

 	public Usuario getCredenciales() {
        return this.credenciales;
    }

	public String getDireccion() {
		return direccion;
	}

	public String getContactoDeEmergencia() {
		return contactoDeEmergencia;
	}


}
