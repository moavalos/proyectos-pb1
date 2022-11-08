package password;

public class Password {

	private Integer longitud = 8;
	private String contrasena;

	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	public String generarPassword() {
		String password = "";
		for (int i = 0; i < longitud; i++) {
			Integer eleccion = ((int) Math.floor(Math.random() * 3 + 1));
			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				password += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					password += mayusculas;
				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					password += numeros;
				}
			}
		}
		return password;

	}

	public String esFuerte() {

		Integer numeros = 0;
		Integer minusculas = 0;
		Integer mayusculas = 0;
		String estado;

		for (int i = 0; i < contrasena.length(); i++) {
			if (contrasena.charAt(i) >= 97 && contrasena.charAt(i) <= 122) {
				minusculas += 1;
			} else {
				if (contrasena.charAt(i) >= 65 && contrasena.charAt(i) <= 90) {
					mayusculas += 1;
				} else {
					numeros += 1;
				}
			}
		}
		if (numeros >= 5 && minusculas >= 1 && mayusculas >= 2) {
			estado = " strong password";
			return estado;
		} else {
			estado = " weak password";
			return estado;
		}
	}

	public Integer getLongitud() {
		if (this.longitud >= 8)
			;
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public Boolean mayorQueOcho(Integer longitud2) {
		// ArrayList<Password> contra = new ArrayList<>();
		Boolean si = false;
		for (int i = 0; i < this.longitud; i++) {
			if (this.longitud >= 8) {
				si = true;
			}
		}
		return si;

	}

}
