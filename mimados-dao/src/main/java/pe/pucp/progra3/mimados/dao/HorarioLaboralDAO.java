package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.model.HorarioLaboral;

import java.sql.SQLException;
import java.util.List;

public interface HorarioLaboralDAO {

    public List<HorarioLaboral> listar_horarios() throws SQLException;
    public List<HorarioLaboral> horarios_empleado(int id_empleado) throws SQLException;

    public void insertar_horario( HorarioLaboral horario) throws SQLException;

}
