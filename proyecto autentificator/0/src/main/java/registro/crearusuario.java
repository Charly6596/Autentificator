package registro;

	public class crearusuario {

		private String nombre;
		private String apellido;
		private String correo;
		private String contraseña;
		private String fechanacimiento;
		private char sexo;
		private String tel;
		private String direccion;
		private String nacionalidad;
		
		public void registro(String nombre, String apellido, String correo,
				String contraseña, String fechanacimiento, char sexo, String tel,
				String direccion, String nacionalidad){
			
			@SuppressWarnings("unused")
			String in="INSERT INTO "+" . usuario (nombre , apellidos , correo , contraseña , fechanacimiento ,sexo , tel , direccion , nacionalidad)"
					+ "VALUE('"+nombre+"','"+apellido+"','"+correo+"','"+contraseña+"','"+fechanacimiento+"','"+sexo+"','"+tel+"','"+direccion+"','"+nacionalidad+"')";
			
		}
		
		public crearusuario(String nombre, String apellido, String correo,
				String contraseña, String fechanacimiento, char sexo, String tel,
				String direccion, String nacionalidad) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.contraseña = contraseña;
			this.fechanacimiento = fechanacimiento;
			this.sexo = sexo;
			this.tel = tel;
			this.direccion = direccion;
			this.nacionalidad = nacionalidad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public String getFechanacimiento() {
			return fechanacimiento;
		}

		public void setFechanacimiento(String fechanacimiento) {
			this.fechanacimiento = fechanacimiento;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
			
}

