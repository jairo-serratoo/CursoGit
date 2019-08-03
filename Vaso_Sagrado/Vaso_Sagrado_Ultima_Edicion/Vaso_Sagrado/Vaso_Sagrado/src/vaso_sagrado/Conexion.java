
package vaso_sagrado;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion 
{
//    public static Connection conectar(String odbc, String user, String pass)
//    {
//        try
//        {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
//            Connection c = DriverManager.getConnection("jdbc:odbc:"+odbc,user,pass);
//            return(c);
//        }catch (Exception e){ return(null);}
//    }

    public static Connection conectar(String odbc, String user, String pass)
    {
        Connection cn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://25.17.18.105;databaseName="+odbc+";user="+user+"; password="+pass;
            cn=DriverManager.getConnection(url);
            return (cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos:" + e);
            return null;
        }
    }






}
