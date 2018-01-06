package conexionSocket.Logica;

import java.util.EventObject;

import conexionSocket.Server;

public class serverEvent extends EventObject {

	Server server;
	
	public serverEvent(Object source, Server server) {	
		super(source);
		this.server = server;
	}


}
