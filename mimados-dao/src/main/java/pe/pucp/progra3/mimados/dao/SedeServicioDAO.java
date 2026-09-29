package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.model.Sede;
import pe.pucp.progra3.mimados.model.SedeServicio;

import java.sql.SQLException;
import java.util.List;

public interface SedeServicioDAO {

    public void insertar_sede_servicio(SedeServicio ss) throws SQLException;
    public void eliminar_sede_servicio(int id_sede_servicio) throws SQLException;

    public List<SedeServicio> listar_sede_servicios() throws SQLException;


}
