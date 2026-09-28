package pe.pucp.progra3.mimados.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Empleado {


    private int sede_id;
    private int usuario_id;

    private Usuario usuario;
    private Sede sede;

    private LocalDateTime fechaContratacion;
    private String codigoCmvp;
    private Boolean esAdmin;
    private Boolean activo;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

    public List<EmpleadoPuesto> empleadoPuestos;
    private List<Horario> horarios;

    public Empleado() {}

    public Empleado(int sede_id, int usuario_id, String codigoCmvp,LocalDateTime fecha_contratacion , Boolean esAdmin, Boolean activo, String usuarioCreacion, String usuarioModificacion, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion) {
        this.sede_id = sede_id;
        this.usuario_id = usuario_id;
        this.codigoCmvp = codigoCmvp;
        this.fechaContratacion = fecha_contratacion;
        this.esAdmin = esAdmin;
        this.activo = activo;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }




    public void darDeBaja() {
        this.activo = false;
    }

    public void reincorporar() {
        this.activo = true;
    }



    public boolean esVeterinario(List<Puesto> Listapuestos) {
        for( Puesto p : Listapuestos ){

        }

        return true;
        //
    }



    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getCodigoCmvp() {
        return codigoCmvp;
    }

    public void setCodigoCmvp(String codigoCmvp) {
        this.codigoCmvp = codigoCmvp;
    }

    public Boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(Boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public List<EmpleadoPuesto> getEmpleadoPuestos() {
        return empleadoPuestos;
    }

    public void setEmpleadoPuestos(List<EmpleadoPuesto> empleadoPuestos) {
        this.empleadoPuestos = empleadoPuestos;
    }
}
