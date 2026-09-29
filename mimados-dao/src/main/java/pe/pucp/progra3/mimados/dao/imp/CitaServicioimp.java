package pe.pucp.progra3.mimados.dao.imp;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.DBManager.TransactionContext;
import pe.pucp.progra3.mimados.dao.CitaServicioDAO;
import pe.pucp.progra3.mimados.model.CitaServicio;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CitaServicioimp implements CitaServicioDAO {

    @Override
    public List<CitaServicio> listar_citas_servicios() throws SQLException {
        List<CitaServicio> lista_cita_servicio = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_citas_servicios()}");
            ResultSet rs = cs.executeQuery()){

            while(rs.next()){

                CitaServicio citaser = new CitaServicio(
                        rs.getInt("cita_id"),
                        rs.getInt("sede_servicio_id"),
                        rs.getBigDecimal("precio_aplicado"),
                        rs.getString("notas"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_modificacion"),
                        rs.getObject("fecha_creacion" , LocalDateTime.class),
                        rs.getObject("fecha_modificacion" , LocalDateTime.class)
                );
                lista_cita_servicio.add(citaser);
            }
        }
        return lista_cita_servicio;

    }

    @Override
    public List<CitaServicio> listar_servicios_por_cita(int id_cita) throws SQLException {
        List<CitaServicio> lista_cita_servicio = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_servicios_por_cita( ? )}");){

            cs.setInt(1 , id_cita);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){

                CitaServicio citaser = new CitaServicio(
                        rs.getInt("cita_id"),
                        rs.getInt("sede_servicio_id"),
                        rs.getBigDecimal("precio_aplicado"),
                        rs.getString("notas"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_modificacion"),
                        rs.getObject("fecha_creacion" , LocalDateTime.class),
                        rs.getObject("fecha_modificacion" , LocalDateTime.class)
                );
                lista_cita_servicio.add(citaser);
            }
        }
        return lista_cita_servicio;
    }

    @Override
    public void actualizar_cita_servicio(CitaServicio citaser) throws SQLException {

        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL actualizar_cita_servicio(?,?,?,?)}")) {

            cs.setInt(1 , citaser.getCita().getId());
            cs.setInt(2, citaser.getSedeServicio().getId() );
            cs.setBigDecimal(3, citaser.getPrecioAplicado());
            cs.setString(4, citaser.getNotas());

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas == 0) {
                System.out.println("Advertencia: No se encontró la cita-servicio con IDs " + "Cita: " + citaser.getCita().getId() + "SedeServi: " + citaser.getSedeServicio().getId() );
            }

        }




    }

    //ZONA TRANSACCIONAL// -----------------------------------------

    @Override
    public void insertar_cita_servicio(CitaServicio citaser) throws SQLException {
        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL insertar_cita_servicio(?,?,?,?)}")){

            cs.setInt(1, citaser.getCita().getId());
            cs.setInt(2 , citaser.getSedeServicio().getId());
            cs.setBigDecimal(3, citaser.getPrecioAplicado());
            cs.setString(4, citaser.getNotas());

            cs.execute();

//            int id_generado = cs.getInt(4);
//            citaser.setId(id_generado);
        }





    }

    @Override
    public void eliminar_cita_servicio(int cita_id, int sede_servicio_id) throws SQLException {
        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL eliminar_sede(?,?)}")){

            cs.setInt(1 , cita_id);
            cs.setInt(2,sede_servicio_id);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas == 0) {
                System.out.println("Advertencia: No se encontró la cita servicio con ID " + cita_id + " " + sede_servicio_id );
            }
        }


    }

}
