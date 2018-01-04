package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConexionDB {
	private Connection con = null;
//Ruta BD
	private static final String URL_DEFAULT = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11213116";
//Crear objeto conexion
	public ConexionDB(){
		// Usamos un objeto de properties para pasar
		// de una manera más cómoda el user, password
		Properties props = new Properties();		
		props.put("user", "sql11213116");
		props.put("password", "gpjqAIM2zf");
		try { 
		con = DriverManager.getConnection( URL_DEFAULT, props);
        System.out.println("Se ha conectado a la base de datos SQLite.");
		} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
//Conectar a la DB	(esto no hace falta pa na)
	public Connection getConnection() {
        return this.con;
    }
//Cerrar la DB	
	public void closeConnection(){
	    	try {
				con.close();
	            System.out.println("Se ha desconectado a la base de datos SQLite.");
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
	}
//Hacer consultas pasandole una query	
	public ResultSet Query(String query){
	    	ResultSet rs = null;
	    	try {
	    		Connection con = this.con;
	    		// Creamos el objeto para enviar sentencias 
				Statement st = con.createStatement();
				rs = st.executeQuery(query);
	    	}catch (SQLException e) {
	        	System.out.println(e.getMessage());
	    		}
	    	return rs;
	}
	
	    	
}
