package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Steve
 */
public class DataConnection {
    protected Connection conexion;
    
    protected boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutin?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "root");
            return true;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
            return false;
        }
    }
    protected boolean desconectar(){
        try{
            conexion.close();
            return true;
        }catch(Exception e){
            System.out.println("Error: "+e);
            return false;
        }
    }
}
