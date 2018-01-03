package Usuarios;

import java.sql.SQLException;

public class pruebainsercionusuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user1 = new Usuario("nombre1", "apellido1", "correo1", 
				"password1", "fechanacimiento1", "h", "tel1",
				"direccion1", "nacionalidad1");
		try {
			Helper_db_Usuario.registro(user1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
