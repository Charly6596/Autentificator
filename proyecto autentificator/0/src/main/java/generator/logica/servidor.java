package generator.logica;

public class servidor {
	private int id;
	private Acceso acceso;
	private Conexion conexion;
	
	public servidor() {
		System.out.println("Se ha creado el servidor");
	}
	public void init() {
		this.acceso = new Acceso();
		this.conexion = new Conexion();
		generarCodigo();
		
	}
	private Acceso generarCodigo() {
		this.acceso.generarCodigo();
		this.acceso.encriptar();
		this.acceso.guardar();
	}
	private void mostrarCodigo() {
		//muestra el codigo por pantalla

}
