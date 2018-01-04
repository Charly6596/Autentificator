package autentificator.Logica;

import java.io.IOException;

import conexion.ClienteSocket;
import conexionDB.ConexionDB;

public class Cliente {
	//Datos del cliente interesantes en el futuro
	
	/*
	 * Geololalizacion
	 * Modelo del dispositivo
	 * ...
	 * 
	 */
	

	public Cliente() {

		//obtencion de datos del cliente
	}
	
public static void ejecutar(int codigo, int idU){
	//TODO recibir codigo desde la vista
	
	
	conexionDB.ConexionDB con =new ConexionDB();
	//Crear conexion a la bd
	
	String mens=Integer.toString(codigo);
	
	//TODO comprobacion de la clave encritpada en acceso
	
	
	//TODO obtener el id usuario que se quiere conectar
	
	//TODO concatenar el codigo del usuario
	
	//TODO crear conexion socket al servidor
//socket nueva clase cliente de socket
	
      
      ClienteSocket cli = null;
	try {
		cli = new ClienteSocket();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      cli.startClient(mens);
	
	//TODO Envio del codigo mas el codigo del usuario

	
	
	
}
	
	

}
