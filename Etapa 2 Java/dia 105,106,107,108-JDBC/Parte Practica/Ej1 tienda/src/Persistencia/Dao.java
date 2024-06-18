
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public abstract class Dao {
    protected Connection conexion=null;
    protected ResultSet resultado=null;
    protected Statement sentencia=null;
    
    private final String User="root";
    private final String Password="root";
    private final String DataBase="tienda";
    private final String Driver="com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws Exception{
        try {
            Class.forName(Driver);
            String urlBaseDeDatos="jdbc:mysql://localhost:3306/" + DataBase + "?useSSL=false";
            conexion=DriverManager.getConnection(urlBaseDeDatos, User, Password);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try {
            
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarCrearModificar(String sql) throws Exception{
        try {
            conectarBase();
            sentencia=conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
        try {
            conectarBase();
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
