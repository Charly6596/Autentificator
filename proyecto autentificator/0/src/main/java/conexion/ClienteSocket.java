package conexion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import conexion.Conexion;

public class ClienteSocket extends Conexion
{
    public ClienteSocket() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient(String mensaje) //Método para iniciar el cliente
    {
    	//Scanner sc = new Scanner(System.in);
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
            for (int i = 0; i < 1; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF(mensaje);
            }
            cs.close();
         //  sc.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}