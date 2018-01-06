package conexionSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.Callable;

import conexionSocket.Logica.serverEvent;
import conexionSocket.Logica.serverListener;

public class Server extends Conexion implements Callable<String> {
	private boolean recibido;
	private String codigo;
	
	private static ArrayList<serverListener> listeners;
	public Server() throws IOException {
		super("servidor");
		this.codigo = null;
		this.recibido = false;
		this.listeners = new ArrayList<>();
	}
	
	public void listenSockets() throws IOException { //pone el socket a escuchar
		startServer();

        System.out.println("Esperando..."); //Esperando conexión

        cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

        System.out.println("Cliente en línea");            
        //Se obtiene el flujo entrante desde el cliente
        BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        this.recibido = true;
        while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
        {
            //Se muestra por pantalla el mensaje recibido
           this.codigo = mensajeServidor.replaceAll("*", "").trim();

        }
        if(this.codigo != null)
        	setRecibido(true);
        stopServer();
	}
	
	public void startServer() throws IOException {
		if(this.ss.isClosed()) {
			ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
		}}
	
	public void stopServer() throws IOException {
		if(!this.ss.isClosed())
			this.ss.close();
		if(!this.cs.isClosed()) {
			this.cs.close();
		}
		
	}

  public void addEventListener(serverListener listener) {
        listeners.add(listener);
    }
  public void setRecibido(boolean recibido) {
	  this.recibido = recibido;
	  this.triggerRecibidoEvent(); //se activa el evento cuando se setea la variable
  }
  
  private void triggerRecibidoEvent() { //disparador del evento
	  ListIterator<serverListener> li = listeners.listIterator();
	  while (li.hasNext()) {
          serverListener listener =  li.next();
          serverEvent readerEvObj = new serverEvent(this, this);
          (listener).onRecibido(readerEvObj);
      }
  }
	public String getCodigo() {
		if(this.codigo != null)
			return this.codigo;
		else
			return "sin codigo";
	}
	
	@Override
	public String call() throws Exception {
		listenSockets();
		return getCodigo();
	}

}
