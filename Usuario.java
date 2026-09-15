public class Usuario {
    private int id;
    private TipoRol rol;
    private String dni;
    private String nombres;
    private String apellidos;
    private String email;
    private String passwordHash;
    private String telefono;
    private boolean estado;
   
    // Constructor vacío
    protected Usuario() {}
    
    // Constructor para un NUEVO registro
    public Usuario(TipoRol rol, String dni, String nombres, String apellidos, 
                   String email, String passwordHash, String telefono) {
        
        // Validaciones combinadas
        if (rol == null) {
            throw new IllegalArgumentException("El rol es obligatorio.");
        }
        if (dni == null || dni.length() != 8) {
            throw new IllegalArgumentException("El DNI debe tener 8 caracteres.");
        }
        if (nombres == null || apellidos == null || nombres.isBlank()) {
            throw new IllegalArgumentException("Los nombres y apellidos son obligatorios.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El formato del correo es inválido.");
        }
        if (passwordHash == null || passwordHash.isBlank()) {
            throw new IllegalArgumentException("La contraseña es obligatoria.");
        }

        this.rol = rol;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.passwordHash = passwordHash;
        this.telefono = telefono;
        this.estado = true; 
    }

    public Usuario(int id, TipoRol rol, String dni, String nombres, String apellidos, 
                   String email, String passwordHash, String telefono, boolean estado) {
        this(rol, dni, nombres, apellidos, email, passwordHash, telefono); 
        this.id = id;
        this.estado = estado;
    }

    public String getNombreCompleto() {
        return this.nombres + " " + (this.apellidos != null ? this.apellidos : "").trim();
    }

    public void actualizarContacto(String nuevoTelefono, String nuevoEmail) {
        if (nuevoEmail != null && nuevoEmail.contains("@")) {
            this.email = nuevoEmail;
        }
        if (nuevoTelefono != null && !nuevoTelefono.isBlank()) {
            this.telefono = nuevoTelefono;
        }
    }

    public void desactivarCuenta() {
        this.estado = false;
    }

    public void activarCuenta() {
        this.estado = true;
    }
    
    public boolean tieneAccesoPermitido() {
        return this.estado; 
    }



    public int getId() { return id; }
    public TipoRol getRol() { return rol; }
    public String getDni() { return dni; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getEmail() { return email; }
    public String getPasswordHash() { return passwordHash; }
    public String getTelefono() { return telefono; }
    public boolean isEstado() { return estado; }

    public void setRol(TipoRol rol) { this.rol = rol; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
}
