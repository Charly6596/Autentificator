package conexionSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

import conexionSocket.Conexion;

public class Servidor extends Conexion implements Callable<String> //Se hereda de conexión para hacer uso de los sockets y demás
{
	String codigo;
    public Servidor() throws IOException, BindException{super("servidor");} //Se usa el constructor para servidor de Conexion

    public String startServer()//Método para iniciar el servidor
    {
    	codigo = null;
        try
        {
            System.out.println("Esperando..."); //Esperando conexión

            cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

            System.out.println("Cliente en línea");

            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(cs.getOutputStream());

            //Se le envía un mensaje al cliente usando su flujo de salida
          //  salidaCliente.writeUTF("Petición recibida y aceptada");
            System.out.println("Petición recibida y aceptada");

            
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
            {
                //Se muestra por pantalla el mensaje recibido
               this.codigo = mensajeServidor;
               System.out.println(mensajeServidor);

            }

            System.out.println("Fin de la conexión");

            ss.close();//Se finaliza la conexión con el cliente
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        if(!codigo.isEmpty())
        	return codigo;
        else
        	return null;
    }
    public ServerSocket getSS() {
    	return this.ss;
    }
	public String call() throws Exception {
		String codigo = startServer();
		return codigo;
		
	}
}