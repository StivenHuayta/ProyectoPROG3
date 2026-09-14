public class Usuario {
    protected int id;
    protected TipoRol rol;
    protected String accountName;
    protected String passwordHash;
    protected boolean estado; 
   
    protected Usuario() {};
    
    protected Usuario(int id, TipoRol rol, String accountName, String passwordHash, boolean estado) {
        this.id = id;
        this.rol = rol;
        this.accountName = accountName;
        this.passwordHash = passwordHash;
        this.estado = estado;
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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAccountname() {
        return Accountname;
    }

    public void setAccountname(String accountname) {
        Accountname = accountname;
    }

    public int getId() {
        return id;
    }

    

}
