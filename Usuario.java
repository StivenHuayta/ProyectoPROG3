public class Usuario {
    protected int id;
    protected TipoRol rol;
    protected String accountName;
    protected String passwordHash;
    protected boolean estado; 
   
    protected Usuario() {};

    //PARA NUEVOS USUARIOS
    public Usuario(TipoRol rol, String accountName, String passwordHash) {
        if (rol == null || accountName == null || passwordHash == null || accountName.isBlank()) {
            throw new IllegalArgumentException("Las credenciales base no pueden estar vacías");
        }
        this.rol = rol;
        this.accountName = accountName;
        this.passwordHash = passwordHash;
        this.estado = true; 
    }

    //PARA USUARIOS YA REGISTRADOS 
    public Usuario(int id, TipoRol rol, String accountName, String passwordHash, boolean estado) {
        this(rol, accountName, passwordHash); //  reusamos las validaciones
        this.id = id;
        this.estado = estado;
    }
    
    public boolean tieneAccesoPermitido() {
        return this.estado; // POR SI AGREGAMOS CONDICIONES EXTRA PARA TENER ACCESO
    }

    
public void desactivarCuenta() {
        this.estado = false;
    }

public void activarCuenta() {
        this.estado = true;
    }






    //-------------------------------------
   public TipoRol getRol() {
        return rol;
    }

    public void setRol(TipoRol rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private String getPasswordHash() {
        return passwordHash;
    }

    private void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    private String getAccountname() {
        return Accountname;
    }

    private void setAccountname(String accountname) {
        Accountname = accountname;
    }

    public int getId() {
        return id;
    }

    

}
