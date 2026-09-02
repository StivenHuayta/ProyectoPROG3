public abstract class Usuario {
    protected int id;
    protected TipoRol rol;
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String email;
    protected String passwordHash;
    protected String telefono;
    protected boolean estado;
    protected Usuario() {};
    
    protected Usuario(int id, TipoRol rol,String dni, String nombres, String apellidos, 
                   String email, String passwordHash, String telefono, boolean estado) {
        this.id = id;
        this.rol = rol;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.passwordHash = passwordHash;
        this.telefono = telefono;
        this.estado = estado;
    }
}
