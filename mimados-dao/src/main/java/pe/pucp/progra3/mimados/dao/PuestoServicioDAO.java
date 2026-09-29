package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.model.PuestoServicio;

import java.sql.SQLException;
import java.util.List;

public interface PuestoServicioDAO {


    public List<PuestoServicio> listar_servicios_puesto(int id_sede) throws SQLException;



}
