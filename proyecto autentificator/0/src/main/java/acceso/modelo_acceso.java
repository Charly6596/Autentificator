package acceso;

import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class modelo_acceso {
	//A esto no se le está dando uso, por eso lo he comentado!!!!!!!!!!!!!!!!
/*
	//atributos de la clase acceso
	private String codigo;
	private String salt;
	
	//contructor
	public modelo_acceso(String codigo, String salt) {
		this.codigo = codigo;
		this.salt = salt;
	}
*/	
	
	//método número aleatorio
	public int generarCodigo() {
		int rand = 0;
		Random rnd = new Random();
		rand = rnd.nextInt(89999)+10000;
		return rand;
	}
	
	//numero aleatorio sacado del método número aleatorio
	String s1 = Integer.toString(generarCodigo());
	
	//codificar
	
	public String codificaCodigo(String s1) {
		String b=null;
		try {
			b = LogicaComun.Encriptacion.encripta(s1);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	//numero codificado
	String codif = codificaCodigo(s1);
	
	//mete el numero codificado en la DB y recibe el id de esa tabla
	int id_acceso = Helper_acceso.insertarAcceso(codif);
		
		
	//Aqui deberían ir los getters setters y toString
	
	
	
}
