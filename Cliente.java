

public class Cliente {
	private int id; 
	private Persona datosPersonales; 
	private Usuario credenciales; 
	private String direccion;
	private String contactoDeEmergencia; 

	public Cliente() {}

	//CONSTRUCTOR PARA NUEVOS REGISTROS
	public Cliente(Persona datosPersonales, Usuario credenciales, String direccion, String contactoDeEmergencia) {
        if (datosPersonales == null || credenciales == null) {
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

public Cliente(int id, Persona datosPersonales, Usuario credenciales, String direccion, String contactoDeEmergencia) {
        this(datosPersonales, credenciales, direccion, contactoDeEmergencia);
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
