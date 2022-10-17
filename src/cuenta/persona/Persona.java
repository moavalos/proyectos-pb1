package cuenta.persona;

public class Persona {
	
	private String nombre;
	private Integer edad;
	private Integer dni;
	
	public Persona(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public boolean esMayorDeEdad(Persona persona) {
		if(persona.getEdad() >= 18)
			return true;
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona ingresada [nombre = " + nombre + ", edad = " + edad + ", dni = " + dni + "]";
	}
	
	
	
	

}
