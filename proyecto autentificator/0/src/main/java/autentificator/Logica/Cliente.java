package autentificator.Logica;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import acceso.Helper_acceso;
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
	int idA = Integer.parseInt(mens.substring(4));
	int idUsuario = idU;
	conexionDB.ConexionDB con = new ConexionDB();
	//Crear conexion a la bd
	
	
	try {
		String hash=LogicaComun.Encriptacion.encripta(mens);
	} catch (NoSuchAlgorithmException e1) {
		// TODO Auto-generated catch block
		System.out.println("Error al encriptar");
	}
	
	//TODO comprobacion de la clave encritpada en acceso
	StringBuilder sb = new StringBuilder(Helper_acceso.getCodigoAcceso(idA));
	sb.append(Integer.toString(idUsuario));
	if(mens.equals(sb.toString()))
		Helper_acceso.setUsuarioAcceso(idA, idUsuario);
	// obtener el id usuario que se quiere conectar
	
	//TODO concatenar el codigo del usuario
	
	
	// crear conexion socket al servidor
      ClienteSocket cli = null;
	try {
		cli = new ClienteSocket();
	} catch (IOException e) {
		e.printStackTrace();
	}
      cli.startClient(Integer.toString(idU));	
	// Envio del codigo mas el codigo del usuario

	
	
	
}
	
	

}
