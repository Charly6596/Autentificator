package conexionSocket;

import java.util.EventListener;


public interface serverVarListener extends EventListener {
	public abstract void onCodigoChange(serverVarEvent ev);
}
