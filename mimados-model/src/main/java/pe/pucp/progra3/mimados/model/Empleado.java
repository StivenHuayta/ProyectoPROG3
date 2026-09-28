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


    private List<Puesto> puestos;
    private List<Horario> horario;






    public Empleado() {}

    public Empleado(Usuario credenciales, List<Puesto> puestos , String numeroColegiatura) {
        if ( credenciales == null  || puestos == null) {
            throw new IllegalArgumentException("Faltan datos obligatorios para registrar al empleado.");
        }

        // regla de negocio
        if (esVeterinario(puestos)) {
            if (numeroColegiatura == null || numeroColegiatura.isBlank()) {
                throw new IllegalArgumentException("Un veterinario requiere obligatoriamente un número de colegiatura.");
            }
            this.codigoCmvp = numeroColegiatura.trim();
        } else {

            this.codigoCmvp = null;
        }


        this.usuario = credenciales;
        this.puestos = puestos;
        this.horario = new ArrayList<>();
        this.activo = true;
    }

    //CONSTRUCTOR DESDE DATOS DE SQL

    public Empleado(int usuario_id, List<Puesto> puestos, String numeroColegiatura, boolean activo) {
        this(puestos , numeroColegiatura);
        this.usuario_id = usuario_id;
        this.activo = activo;
    }


    public Empleado(List<Puesto> puestos , String numeroColegiatura ){

        this.puestos = puestos;
        this.codigoCmvp = numeroColegiatura;
    }

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

    public boolean esVeterinario(List<Puesto> Listapuestos) {
        for( Puesto p : Listapuestos ){




        }

        return true;
        //
    }

    public void darDeBaja() {
        this.activo = false;
    }

    public void reincorporar() {
        this.activo = true;
    }




    //----------------------------------------------------------------------

    public int getId(){
        return usuario_id;
    }

    public Usuario getCredenciales() {
        return usuario;
    }

    public String getNumeroColegiatura() {
        return codigoCmvp;
    }


    public boolean isActivo() {
        return activo;
    }

    public List<Puesto> getRoles() {
        return puestos;
    }

}
