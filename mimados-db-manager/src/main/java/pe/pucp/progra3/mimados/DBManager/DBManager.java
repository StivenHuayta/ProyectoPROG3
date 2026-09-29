package pe.pucp.progra3.mimados.DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBManager {

    private static String host;
    private static String puerto ;
    private static String  esquema ;
    private static String user;
    private static String password ;
    private static DBManager instance;


    static{
        ResourceBundle rb = ResourceBundle.getBundle("db");

        host = rb.getString("host");
        puerto = rb.getString("puerto");
        esquema = rb.getString("esquema");
        user = rb.getString("user");
        password = rb.getString("password");

        instance = new DBManager();

    }


    public Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://" + host + ":" + puerto + "/" +esquema ;

        return DriverManager.getConnection(url , user , password);


    }

    public static DBManager getInstance(){
        return instance;
    }


}
