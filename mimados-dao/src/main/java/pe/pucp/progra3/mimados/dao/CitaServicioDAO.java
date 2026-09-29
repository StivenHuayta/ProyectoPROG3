package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.model.Cita;
import pe.pucp.progra3.mimados.model.CitaServicio;

import java.sql.SQLException;
import java.util.List;

public interface CitaServicioDAO {

    public List<CitaServicio> listar_citas_servicios() throws SQLException;

    public void insertar_cita_servicio(CitaServicio citaser) throws SQLException;

    public void eliminar_cita_servicio(int cita_id , int sede_servicio_id) throws SQLException;

    public List<CitaServicio> listar_servicios_por_cita(int id_cita) throws SQLException;

    public void actualizar_cita_servicio(CitaServicio citaser) throws SQLException;


}
