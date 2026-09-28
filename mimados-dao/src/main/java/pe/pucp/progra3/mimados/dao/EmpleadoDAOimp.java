package pe.pucp.progra3.mimados.dao;

import pe.pucp.progra3.mimados.DBManager.DBManager;
import pe.pucp.progra3.mimados.model.Empleado;
import pe.pucp.progra3.mimados.model.Usuario;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOimp implements EmpleadoDAO{

    @Override
    public List<Empleado> listar_empleados() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        try(Connection connection = DBManager.getInstance().getConnection();
            CallableStatement cs = connection.prepareCall(" {CALL listar_empleados()}");
            ResultSet rs = cs.executeQuery()){




            while(rs.next()){

                Empleado empleado = new Empleado(
                        rs.getInt("sede_id"),
                        rs.getInt("usuario_id"),
                        rs.getString("codigo_cmvp"),
                        rs.getObject("fecha_contratacion" , LocalDateTime.class),
                        rs.getBoolean("activo"),
                        rs.getBoolean("es_admin"),
                        rs.getString("usuario_creacion"),
                        rs.getString("usuario_ultima_actualizacion"),
                        rs.getObject("fecha_creacion" , LocalDateTime.class),
                        rs.getObject("fecha_ultima_actualizacion" , LocalDateTime.class)
                );

                empleados.add(empleado);
            }
        }
        return empleados;


    }
}
