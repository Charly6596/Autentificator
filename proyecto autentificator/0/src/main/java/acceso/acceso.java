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
	private static int a = 0;
	private String codigo;
	private String salt;
	private static String b = "0";
	//Conexion
	private static Connection con = null;
	private static Properties props = new Properties();
	
	//Objetos
	private static Object randomNum;
	public static Object password;
	
	//Constructores
	public acceso(String codigo, String salt) {
		super();
		this.codigo = codigo;
		this.salt = salt;
	}

	static String s1 = Integer.toString(Acode(randomNum));
	
	//Método que genera número aleatório
	public static int Acode(Object randomNum)
	{
		//Creamos el random
		Random code = new Random();
		
		randomNum = code.nextInt ((max - min)+1) + min;
		
		return (int) randomNum;
		
	}
	
	
	public static void codificar() throws NoSuchAlgorithmException, SQLException {
		a = Acode(randomNum);//Almacenamos Acode en una variable
		b = (String) password;
		Object password = LogicaComun.Encriptacion.encripta(s1);
		System.out.println(a + " " + password);
		acceso.insertarAceeso();	
	}

	//Metodo "Insert Into" el cual inserta la salt en la base de datos y muestra el ultimo ID creado
	//Hay que señalar la variable st para indicar que la vamos a usar, al final proviene de otro método
	public static void insertarAceeso() throws SQLException
	{
		props.put("user", "sql11213116");
		props.put("password", "gpjqAIM2zf");
		
		
		try {
		con = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11213116", props);

										  /*Creación y Ejecución del PreparedStatement*/
		/********************************************************************************************************************/
		//PreparedStatement para insertar y recoger id
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO acceso (salt) VALUES (?)");

		//Ejecución
		pstmt.setString(64, b);
		
		//No es necesário usar "ResultSet" porque queremos insertar un valor no recogerlo
		pstmt.execute();
		
		//Recoge el ultimo id creado
		ResultSet rs = pstmt.executeQuery("SELECT `id` FROM acceso ORDER BY `id` DESC LIMIT 1");
		/*********************************************************************************************************************/		
		
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
	
	

	
	//Getters & Setters
	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		acceso.min = min;
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		acceso.max = max;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		acceso.con = con;
	}

	public static Properties getProps() {
		return props;
	}

	public static void setProps(Properties props) {
		acceso.props = props;
	}

	public static Object getRandomNum() {
		return randomNum;
	}

	public static void setRandomNum(Object randomNum) {
		acceso.randomNum = randomNum;
	}
	//To String
	@Override
	public String toString() {
		return "acceso [codigo=" + codigo + ", salt=" + salt + ", getCodigo()=" + getCodigo() + ", getSalt()="
				+ getSalt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}