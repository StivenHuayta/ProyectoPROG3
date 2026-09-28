package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.DBManager.TransactionContext;
import pe.pucp.progra3.mimados.model.DiaSemana;
import pe.pucp.progra3.mimados.model.HorarioLaboral;
import pe.pucp.progra3.mimados.model.Sede;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HorarioLaboralimp implements HorarioLaboralDAO {

    @Override
    public List<HorarioLaboral> listar_horarios() throws SQLException {

        List<HorarioLaboral> horarios = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_horarios()}");
            ResultSet rs = cs.executeQuery()){

            while(rs.next()){

                HorarioLaboral horarioLaboral = new HorarioLaboral(
                        rs.getInt("id"),
                        rs.getInt("empleado_id"),
                        rs.getObject("dia_semana" , DiaSemana.class),
                        rs.getObject("hora_inicio", LocalTime.class),
                        rs.getObject("hora_fin", LocalTime.class),
                        rs.getBoolean("activo"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_ultima_actualizacion"),
                        rs.getObject("fecha_ultima_actualizacion" , LocalDateTime.class),
                        rs.getObject("fecha_creacion" , LocalDateTime.class)
                );
                horarios.add(horarioLaboral);
            }
        }
        return horarios;
    }

    @Override
    public List<HorarioLaboral> horarios_empleado(int id_empleado) throws SQLException {

        List<HorarioLaboral> horarios = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_horarios_empleado( ? )}");){

            cs.setInt(1, id_empleado);
            ResultSet rs = cs.executeQuery();

            while(rs.next()){

                HorarioLaboral horarioLaboral = new HorarioLaboral(
                        rs.getInt("id"),
                        rs.getInt("empleado_id"),
                        rs.getObject("dia_semana" , DiaSemana.class),
                        rs.getObject("hora_inicio", LocalTime.class),
                        rs.getObject("hora_fin", LocalTime.class),
                        rs.getBoolean("activo"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_ultima_actualizacion"),
                        rs.getObject("fecha_ultima_actualizacion" , LocalDateTime.class),
                        rs.getObject("fecha_creacion" , LocalDateTime.class)
                );
                horarios.add(horarioLaboral);
            }
        }
        return horarios;

    }

    @Override
    public void insertar_horario(HorarioLaboral horario) throws SQLException {
        Connection connection = TransactionContext.getConnection();

        try(CallableStatement cs = connection.prepareCall("{CALL insertar_horario(?,?,?,?,?,?)}")){

            cs.registerOutParameter(6 , Types.INTEGER);

            cs.setInt(1 , horario.getEmpleado().getUsuario().getId());
            cs.setString(2, horario.getDiaSemana().name() );
            cs.setObject(3, horario.getHoraInicio());
            cs.setObject(4, horario.getHoraFin());
            cs.setBoolean(5 , horario.getActivo());

            cs.execute();


            int id_generado = cs.getInt(6);
            horario.setId(id_generado);
        }
    }





}
