package conexionSocket;

import conexionSocket.Logica.serverEvent;
import conexionSocket.Logica.serverListener;

public class serverVar {
	private static String codigo;
	public static serverVarListener listener;
	
	
	public static void setCodigo(String codigo) {
		serverVar.codigo = codigo;
		serverVarEvent readerEvObj = new serverVarEvent(codigo);
	     (listener).onCodigoChange(readerEvObj);
	}
	public static String getCodigo() {
		return codigo;
	}
     
}
