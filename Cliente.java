import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private int idCliente; 
	private Usuario usuario; 
	private String direccion;
	private String contactoDeEmergencia; 

	public Cliente() {}

	public Cliente(int idCliente, Usuario usuario, String direccion, String contactoDeEmergencia) {
		this.idCliente = idCliente;
		this.usuario = usuario;
		this.direccion = direccion;
		this.contactoDeEmergencia = contactoDeEmergencia;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContactoDeEmergencia() {
		return contactoDeEmergencia;
	}

	public void setContactoDeEmergencia(String contactoDeEmergencia) {
		this.contactoDeEmergencia = contactoDeEmergencia;
	}

}
