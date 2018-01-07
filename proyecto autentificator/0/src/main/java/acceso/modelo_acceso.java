package acceso;

import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class modelo_acceso {
	//A esto no se le está dando uso, por eso lo he comentado!!!!!!!!!!!!!!!!

	//atributos de la clase acceso
	private String codigo;
	private String salt;
	private int id_acceso;
	
	//contructor
	public modelo_acceso() {
		generarCodigo();
		guardarCodigo();
	}
	
	
	//método número aleatorio
	private void generarCodigo() {
		int rand = 0;
		Random rnd = new Random();
		rand = rnd.nextInt(89999)+10000;
		this.codigo = Integer.toString(rand);
	}
	
	//codificar
	private void guardarCodigo() {
		this.id_acceso = Helper_acceso.insertarAcceso(this.codigo);
		//TODO: comprobar que no este el codigo repetido
	}
	
	private String codificaCodigo(String s1) {
		String b=null;
		try {
			b = LogicaComun.Encriptacion.encripta(s1);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getId_acceso() {
		return id_acceso;
	}


	public void setId_acceso(int id_acceso) {
		this.id_acceso = id_acceso;
	}
	
	
	
	
}
