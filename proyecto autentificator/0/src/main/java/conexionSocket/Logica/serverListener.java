package conexionSocket.Logica;

import java.util.EventListener;

public interface serverListener extends EventListener {
	public abstract void onRecibido(serverEvent ev);
}
