package pe.pucp.progra3.mimados.dao.imp;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.DBManager.TransactionContext;
import pe.pucp.progra3.mimados.dao.CitaDAO;
import pe.pucp.progra3.mimados.model.Cita;
import pe.pucp.progra3.mimados.model.Empleado;
import pe.pucp.progra3.mimados.model.Estado;
import pe.pucp.progra3.mimados.model.Mascota;
import pe.pucp.progra3.mimados.model.Usuario;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CitaDAOimp implements CitaDAO {

    @Override
    public void insertar_cita(Cita cita) throws SQLException {
        /*
        CREATE PROCEDURE insertar_cita(
            IN p_empleado_id INT,
            IN p_mascota_id INT,
            IN p_fecha_hora_inicio DATETIME,
            IN p_fecha_hora_fin DATETIME,
            IN p_motivo VARCHAR(255),
            OUT p_cita_id INT
        )
        */
        Connection connection = TransactionContext.getConnection();
        try (CallableStatement cs = connection.prepareCall("{CALL insertar_cita(?, ?, ?, ?, ?, ?)}")) {
            cs.registerOutParameter(6, Types.INTEGER);

            cs.setInt(1, cita.getEmpleado().getUsuario().getId());
            cs.setInt(2, cita.getMascota().getId());
            cs.setTimestamp(3, cita.getFechaHoraInicio() != null ? Timestamp.valueOf(cita.getFechaHoraInicio()) : null);
            cs.setTimestamp(4, cita.getFechaHoraFin() != null ? Timestamp.valueOf(cita.getFechaHoraFin()) : null);
            cs.setString(5, cita.getMotivo());

            cs.execute();

            int idGenerado = cs.getInt(6);
            cita.setId(idGenerado);
        }
    }

    @Override
    public List<Cita> listar_citas_por_mascota(int idMascota) throws SQLException {
        /*
        CREATE PROCEDURE listar_citas_por_mascota(IN p_id_masco INT)
        SELECT cita_id, empleado_id, fecha_hora_inicio, fecha_hora_fin, estado, motivo FROM cita WHERE mascota_id = p_id_masco;
        */
        List<Cita> citas = new ArrayList<>();
        try (Connection connection = DBManager.getInstance().getConnection();
             CallableStatement cs = connection.prepareCall("{CALL listar_citas_por_mascota(?)}")) {

            cs.setInt(1, idMascota);
            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    Empleado empleado = new Empleado();
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("empleado_id"));
                    empleado.setUsuario(usuario);

                    Mascota mascota = new Mascota();
                    mascota.setId(idMascota);

                    Timestamp tsInicio = rs.getTimestamp("fecha_hora_inicio");
                    LocalDateTime inicio = tsInicio != null ? tsInicio.toLocalDateTime() : null;

                    Timestamp tsFin = rs.getTimestamp("fecha_hora_fin");
                    LocalDateTime fin = tsFin != null ? tsFin.toLocalDateTime() : null;

                    String estadoStr = rs.getString("estado");
                    Estado estado = estadoStr != null ? Estado.valueOf(estadoStr.toUpperCase()) : null;

                    Cita cita = new Cita(
                            rs.getInt("cita_id"),
                            empleado,
                            mascota,
                            inicio,
                            fin,
                            estado,
                            rs.getString("motivo")
                    );
                    citas.add(cita);
                }
            }
        }
        return citas;
    }

    @Override
    public Cita mostrar_cita(int id) throws SQLException {
        /*
        CREATE PROCEDURE mostrar_cita(IN p_id INT)
        SELECT empleado_id, mascota_id, fecha_hora_inicio, fecha_hora_fin, estado, motivo FROM cita WHERE ...;
        */
        try (Connection connection = DBManager.getInstance().getConnection();
             CallableStatement cs = connection.prepareCall("{CALL mostrar_cita(?)}")) {

            cs.setInt(1, id);
            try (ResultSet rs = cs.executeQuery()) {
                if (rs.next()) {
                    Empleado empleado = new Empleado();
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("empleado_id"));
                    empleado.setUsuario(usuario);

                    Mascota mascota = new Mascota();
                    mascota.setId(rs.getInt("mascota_id"));

                    Timestamp tsInicio = rs.getTimestamp("fecha_hora_inicio");
                    LocalDateTime inicio = tsInicio != null ? tsInicio.toLocalDateTime() : null;

                    Timestamp tsFin = rs.getTimestamp("fecha_hora_fin");
                    LocalDateTime fin = tsFin != null ? tsFin.toLocalDateTime() : null;

                    String estadoStr = rs.getString("estado");
                    Estado estado = estadoStr != null ? Estado.valueOf(estadoStr.toUpperCase()) : null;

                    return new Cita(
                            id,
                            empleado,
                            mascota,
                            inicio,
                            fin,
                            estado,
                            rs.getString("motivo")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public void cancelar_cita(int idCita) throws SQLException {
        /*
        CREATE PROCEDURE cancelar_cita(IN p_cita_id INT)
        */
        Connection connection = TransactionContext.getConnection();
        try (CallableStatement cs = connection.prepareCall("{CALL cancelar_cita(?)}")) {
            cs.setInt(1, idCita);

            int filasAfectadas = cs.executeUpdate();
            if (filasAfectadas == 0) {
                System.out.println("Advertencia: No se encontró la cita con ID " + idCita);
            }
        }
    }

    @Override
    public void atender_cita(int idCita) throws SQLException {
        /*
        CREATE PROCEDURE atender_cita(IN p_cita_id INT)
        */
        Connection connection = TransactionContext.getConnection();
        try (CallableStatement cs = connection.prepareCall("{CALL atender_cita(?)}")) {
            cs.setInt(1, idCita);

            int filasAfectadas = cs.executeUpdate();
            if (filasAfectadas == 0) {
                System.out.println("Advertencia: No se encontró la cita con ID " + idCita);
            }
        }
    }
}
