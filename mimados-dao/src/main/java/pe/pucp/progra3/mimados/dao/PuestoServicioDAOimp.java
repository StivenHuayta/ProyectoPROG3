package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.model.PuestoServicio;
import pe.pucp.progra3.mimados.model.Sede;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PuestoServicioDAOimp implements PuestoServicioDAO {

    @Override
    public List<PuestoServicio> listar_servicios_puesto(int id_puesto) throws SQLException {

        List<PuestoServicio> servicios_de_puesto = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_servicios_puesto(?)}");){

            cs.setInt( 1 , id_puesto );
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                PuestoServicio ps = new PuestoServicio(
                        rs.getInt("id"),
                        rs.getInt("servicio_id"),
                        rs.getInt("puesto_id"),
                        rs.getBoolean("activo"),

                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_ultima_actualizacion"),
                        rs.getObject("fecha_ultima_actualizacion" , LocalDateTime.class),
                        rs.getObject("fecha_creacion" , LocalDateTime.class)


                );
                servicios_de_puesto.add(ps);
            }
        }
        return servicios_de_puesto;

    }
}
