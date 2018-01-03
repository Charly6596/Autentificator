package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Helper_db_Usuario {

	public Helper_db_Usuario() {
		// TODO Auto-generated constructor stub
	}

	
	public static void registro(Usuario usuario) throws SQLException{
		
		
		/*String nombre, String apellido, String correo,
			String password, String fechanacimiento, char sexo, String tel,
			String direccion, String nacionalidad*/
		
		
	//	con = DriverManager.getConnection("jdbc:mysql://"/* + host + database , properties*/);
	//	Statement st = con.createStatement();
		
		String in="INSERT INTO usuario (nombre , apellidos , correo , contraseña , fechanacimiento ,sexo , tel , direccion , nacionalidad)"
				+ "VALUE(?,?,?,?,?,?,?,?,?)";
		
      //  BaseDatos bd = new BaseDatos();
		//	Connection conn = bd.getConnection();

		/*PreparedStatement pstmt = conn.prepareStatement(in);
	            pstmt.setString(1, usuario.getNombre());
	            pstmt.setString(2, usuario.getApellido());
	            pstmt.setString(3, usuario.getCorreo());
	            pstmt.setString(4, usuario.getpassword());
	            pstmt.setString(5, usuario.getFechanacimiento());
	            pstmt.setString(6, usuario.getSexo());
	            pstmt.setString(7, usuario.getTel());
	            pstmt.setString(8, usuario.getDireccion());
	            pstmt.setString(9, usuario.getNacionalidad());
	            
	            pstmt.executeUpdate(); */
		
	}
	
	
	
	public static boolean login(String correo, String pass){
		String sql = "SELECT password FROM usuario WHERE correo = ?";
	//	BaseDatos bd = new BaseDatos(); 
		boolean login_correcto = false;
		String password = "";
		
		//	Connection conn = bd.getConnection();
	      //    Statement stmt  = conn.createStatement();
			//  PreparedStatement pstmt = conn.prepareStatement(sql);
				// pstmt.setString(1, correo);
				 //ResultSet rs  = pstmt.executeQuery();
			//	 password = rs.getString("password");
				 if(pass.equals(password)){
					 login_correcto = true;
			 }
			 
		
	        	
		return login_correcto;
	}
	
	
	
}
