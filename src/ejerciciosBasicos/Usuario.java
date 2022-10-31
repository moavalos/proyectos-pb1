package ejerciciosBasicos;

public class Usuario {
	
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	public Usuario(String usuario, String password, String nombre, String apellido, int dni, int edad) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	

}
