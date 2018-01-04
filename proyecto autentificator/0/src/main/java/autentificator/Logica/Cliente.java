package autentificator.Logica;

import java.io.IOException;

import conexionDB.ConexionDB;
import conexionSocket.ClienteSocket;

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
	// recibir codigo desde la vista
	String mens=Integer.toString(codigo);

	
	conexionDB.ConexionDB con =new ConexionDB();
	//Crear conexion a la bd
	//
	
	
	//TODO comprobacion de la clave encritpada en acceso
	
	
	// obtener el id usuario que se quiere conectar
	
	//TODO concatenar el codigo del usuario
	
	
	// crear conexion socket al servidor
      ClienteSocket cli = null;
	try {
		cli = new ClienteSocket();
	} catch (IOException e) {
		e.printStackTrace();
	}
      cli.startClient(mens);	
	// Envio del codigo mas el codigo del usuario

	
	
	
}
	
	

}
