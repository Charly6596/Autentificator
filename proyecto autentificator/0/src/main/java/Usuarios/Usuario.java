package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Usuario {

		private String nombre;
		private String apellido;
		private String correo;
		private String password;
		private String fechanacimiento;
		private String sexo;
		private String tel;
		private String direccion;
		private String nacionalidad;
		Connection con = null;
		
		
		public Usuario(String nombre, String apellido, String correo,
				String password, String fechanacimiento, String sexo, String tel,
				String direccion, String nacionalidad) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.password = password;
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

		public String getpassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFechanacimiento() {
			return fechanacimiento;
		}

		public void setFechanacimiento(String fechanacimiento) {
			this.fechanacimiento = fechanacimiento;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
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

