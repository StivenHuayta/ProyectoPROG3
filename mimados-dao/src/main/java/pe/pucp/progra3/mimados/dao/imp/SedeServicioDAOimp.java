package pe.pucp.progra3.mimados.dao.imp;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.DBManager.TransactionContext;
import pe.pucp.progra3.mimados.dao.SedeServicioDAO;
import pe.pucp.progra3.mimados.model.Sede;
import pe.pucp.progra3.mimados.model.SedeServicio;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SedeServicioDAOimp implements SedeServicioDAO {


    @Override
    public List<SedeServicio> listar_sede_servicios() throws SQLException {

        List<SedeServicio> sedesservicios = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_sede_servicios()}");
            ResultSet rs = cs.executeQuery()){

            while(rs.next()){

                SedeServicio ss = new SedeServicio(
                        rs.getInt("sede_servicio_id"),
                        rs.getInt("servicio_id"),
                        rs.getInt("sede_id"),
                        rs.getBoolean("activo"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_ultima_actualizacion"),
                        rs.getObject("fecha_ultima_actualizacion" , LocalDateTime.class),
                        rs.getObject("fecha_creacion" , LocalDateTime.class)
                );
                sedesservicios.add(ss);
            }
        }
        return sedesservicios;
    }

    @Override
    public void insertar_sede_servicio(SedeServicio ss) throws SQLException {

        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL insertar_sede_servicio(?,?,?)}")){
            cs.registerOutParameter(3 , Types.INTEGER);
            cs.setInt(1 , ss.getServicio().getId());
            cs.setInt(2, ss.getSede().getId());
            cs.execute();
            int id_generado = cs.getInt(3);
            ss.setId(id_generado);
        }

    }

    @Override
    public void eliminar_sede_servicio(int id_sede_servicio) throws SQLException {

        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL eliminar_sede_servicio(?)}")){

            cs.setInt(1 , id_sede_servicio);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas == 0) {
                System.out.println("Advertencia: No se encontró la sede con ID " + id_sede_servicio);
            }
        }

    }
}
