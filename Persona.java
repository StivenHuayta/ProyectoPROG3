public class Persona{
	private int id;
	private String dni;
	private String nombres;
	private String apellidoP; 
	private String apellidoM; 
	private String telefono; 
	private String email; 

	 public Persona(int id, String dni, String nombres, String apellidoP, String apellidoM, String telefono, String email) {
        this(dni, nombres , apellidoP, apellidoM, telefono, email); 
		this.id = id; 
    }

	public Persona(String dni, String nombres, String apellidoP, String apellidoM, String telefono, String email) {
        // Validaciones de datos VÁLIDOS
		
        if (dni == null || dni.length() != 8) {
            throw new IllegalArgumentException("El DNI debe tener 8 caracteres");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El formato del correo es inválido");
        }
        if (nombres == null || apellidoP == null || nombres.isBlank()) {
            throw new IllegalArgumentException("Los nombres y el apellido paterno son obligatorios");
        }

        this.dni = dni;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.email = email;
    }


//------------------------------------


	public String getNombreCompleto() {
        return this.nombres + " " + this.apellidoP + " " + (this.apellidoM != null ? this.apellidoM : "").trim(); //VERIFICAMOS NOMBRE INCOMPLETO Y ELIMINAMOS ESPACIOS
    }

    public void actualizarContacto(String nuevoTelefono, String nuevoEmail) {
        if (nuevoEmail != null && nuevoEmail.contains("@")) {
            this.email = nuevoEmail;
        }
        if (nuevoTelefono != null && !nuevoTelefono.isBlank()) {
            this.telefono = nuevoTelefono;
        }
    }
	


	
 //-------------------------------------------// 

	public int getid(){
		return id; 
	}


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

	
	
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


	
}
