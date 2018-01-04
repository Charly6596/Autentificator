package acceso;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexionDB.ConexionDB;

public class Helper_acceso {
	//Debe recibir un String a introducir en el campo Salt de la tabla
	//Y devuelve un int del id
	public static int insertarAcceso(String s1) {
		ConexionDB db = new ConexionDB();
		//String ins="INSERT INTO acceso (salt) VALUES (?)";
		String consulta="BEGIN;	INSERT INTO acceso (salt) VALUES (?); SELECT `id` FROM acceso ORDER BY `id` DESC LIMIT 1; COMMIT;";
		int devuelta = -1;
		try {
			PreparedStatement pstmt = db.getConnection().prepareStatement(consulta);
			//Ejecución
			pstmt.setString(1, s1);
			ResultSet rs = pstmt.executeQuery();
			
			// De esta forma vamos a saber si hay tablas o no
			if(rs.next()) {
				devuelta = rs.getInt(1);
			}
			//Cerramos ResultSet y Statement
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		return devuelta;
	}
	
	
	
	
	
	
	
	
}







/*
package acceso;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.logging.*;

public class acceso {
	//Variables
	private static int min = 10000;
	private static int max = 99999;
	private String codigo;
	private String salt;
	//Conexion
	private static Connection con = null;
	private static Properties props = new Properties();
	
	
	//Método que genera número aleatório
	public static int Acode()
	{
		//Creamos el random
		Random code = new Random();
		
		int randomNum = code.nextInt ((max - min)+1) + min;
		
		return randomNum;
		
	}
	
	//Pasamos "Acode" a String
	String s1 = Integer.toString(Acode());

	//Metodo "Insert Into" el cual inserta la salt en la base de datos y muestra el ultimo ID creado
	//Hay que señalar la variable st para indicar que la vamos a usar, al final proviene de otro método
	public static void insertarAceeso() throws SQLException
	{
		props.put("user", "sql11213116");
		props.put("password", "gpjqAIM2zf");
		
		
		try {
		con = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11213116", props);

										  //Creación y Ejecución del PreparedStatement
		//PreparedStatement para insertar y recoger id
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO acceso (salt) VALUES (?)");

		//Ejecución
		pstmt.setInt(1, Acode());
		
		//No es necesário usar "ResultSet" porque queremos insertar un valor no recogerlo
		pstmt.execute();
		
		//Recoge el ultimo id creado
		ResultSet rs = pstmt.executeQuery("SELECT `id` FROM acceso ORDER BY `id` DESC LIMIT 1");
			
			// De esta forma vamos a saber si hay tablas o no
			boolean hayFilas = false;
			while(rs.next()) {
			hayFilas = true;
			System.out.println(rs.getInt(1));
			}
			if (!hayFilas) {
			System.out.println("No hay resultados que mostrar");
			}
						
			
		//Cerramos ResultSet y Statement
		rs.close();
		pstmt.close();
			
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		finally //Si con no es distinto de nulo intentar cerrar
	{
			if (con != null)
				try 
			{
				con.close();
			}	catch (SQLException e)

			{					
				e.printStackTrace();	
			}
	}


}

	private void vr(String s1, Object codificar) throws NoSuchAlgorithmException {
		int i = Acode();
		String a = (String) codificar(i);
		
	}

	private Object codificar(int i) throws NoSuchAlgorithmException {
		Object password = LogicaComun.Encriptacion.encripta(s1);
		return null;
	}

}
*/