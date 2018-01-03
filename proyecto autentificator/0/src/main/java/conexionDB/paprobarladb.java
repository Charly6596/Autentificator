package conexionDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class paprobarladb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionDB db = new ConexionDB();
		
		
		ResultSet rs = db.Query(""
				+ "SELECT * FROM usuario;");

		// De esta forma vamos a saber si hay tablas o no
		boolean hayFilas = false;
		try {
			while(rs.next()) {
				hayFilas = true;
				for(int i=1; i<=8; i++) {
					System.out.println(rs.getString(i));	
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!hayFilas) {
			System.out.println("No hay resultados que mostrar");
		}
		
		//Cerramos ResultSet y Statement
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		db.closeConnection();
		
	}

}
