package com.athos.db;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 2/09/2022
 * @time 20:39:57
 *
 * Codigo Tecnico: IN5BV
 */
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DB = "db_athos_books_in5bv";
    private static final String USER = "kinal";
    private static final String PASS = "admin";

    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static BasicDataSource instanceBds;

    public static DataSource getInstanceDs() {
        if (instanceBds == null) {
            instanceBds = new BasicDataSource();
            instanceBds.setUrl(URL);
            instanceBds.setUsername(USER);
            instanceBds.setPassword(PASS);
            instanceBds.setInitialSize(25);
        }
        return instanceBds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getInstanceDs().getConnection();
    }
    
    public static void close(ResultSet rs){
        try {
            if (rs!= null ) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar cerrar el objeto ResultSet");
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement pstmt){
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar cerrar el objeto PreparedStatement");
            e.printStackTrace(System.out);
        }   
    }
    
    public static void close(Connection conn){
        
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un errror al intentar cerrar el objeto Connection");
            e.printStackTrace(System.out);
        }
    }
}
