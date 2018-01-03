package autentificator.Logica;

import conexion.Cliente;
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
	
	String ms="eoeoeoeoeoeoeoeoeo";
	
	//TODO comprobacion de la clave encritpada en acceso
	
	
	//TODO obtener el id usuario que se quiere conectar
	
	//TODO concatenar el codigo del usuario
	
	//TODO crear conexion socket al servidor
//socket nueva clase cliente de socket
	Cliente cli = new Cliente(); //Se crea el cliente

      System.out.println("Iniciando cliente\n");
      cli.startClient(ms); //Se inicia el cliente
	
	
	//TODO Envio del codigo mas el codigo del usuario

	
	
	
}
	
	

}
