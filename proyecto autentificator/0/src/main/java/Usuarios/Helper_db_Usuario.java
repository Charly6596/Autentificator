package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import conexionDB.ConexionDB;


public class Helper_db_Usuario {

		

public static void registro(Usuario usuario) throws SQLException{
		
		ConexionDB db = new ConexionDB();
		String in="INSERT INTO usuario (nombre , apellidos , correo , pass , fechanacimiento ,sexo , tel , direccion , nacionalidad)"
				+ "VALUE(?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = db.getConnection().prepareStatement(in)){
			pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getApellido());
            pstmt.setString(3, usuario.getCorreo());
            pstmt.setString(4, usuario.getpassword());
            pstmt.setString(5, usuario.getFechanacimiento());
            pstmt.setString(6, usuario.getSexo());
            pstmt.setString(7, usuario.getTel());
            pstmt.setString(8, usuario.getDireccion());
            pstmt.setString(9, usuario.getNacionalidad());
            pstmt.executeUpdate(); 
		} catch (SQLException e) {
            System.out.println(e.getMessage()); //TODO: cambiar por registro de logs?
        } finally {
        	db.closeConnection();
        }
		
	}	

	public static int getUsuarioByNombre(String correo) throws SQLException{
		conexionDB.ConexionDB con =new ConexionDB();
		String sql = "SELECT id FROM usuario WHERE nombre = ? ";
		 Usuario usuario = null;
		 PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
			 pstmt.setString(1, correo);
			 ResultSet rs  = pstmt.executeQuery();
			 int nu=0;
			 while(rs.next()){
				  nu=rs.getInt("id"); 
			 }
			 
			 
		
		
		return nu;
		
	}
	

	public static boolean login(String correo, String pass) throws SQLException{
		conexionDB.ConexionDB con =new ConexionDB();
		
		String sql = "SELECT pass FROM usuario WHERE nombre = ? ";
		boolean login_correcto = false;
		String password = "";
		
			Connection conn = con.getConnection();
	      //    Statement stmt  = conn.createStatement();
			  PreparedStatement pstmt = conn.prepareStatement(sql);

				 pstmt.setString(1, correo);


				 
				 ResultSet rs  = pstmt.executeQuery();
				 while(rs.next()){
					 password = rs.getString("pass");

				 
					 if(pass.equals(password)){
					 }
					 	login_correcto = true;
				 }
			 
		
	        	
		return login_correcto;
	}
	
	
	
}
