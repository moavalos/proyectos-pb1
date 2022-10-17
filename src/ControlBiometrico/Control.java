package ControlBiometrico;

public class Control {

	private String nombre;
	private Usuario[] usuarios;
	private final Integer REGISTROS = 50000;

	private Integer contadorUsuario = 0;

	public Control(String nombre, Integer cantidadUsuarios) {
		this.nombre = nombre;
		this.usuarios = new Usuario[cantidadUsuarios];
	}

	public Boolean registrarUsuario(Usuario usuarioNuevo) {
		this.usuarios[contadorUsuario++] = usuarioNuevo;
		return true;
	}

	public Usuario obtenerUsuarioPorNumeroDeUsuario(Integer num) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] == null)
				if (usuarios[i].getNumero().equals(num)) {
					return usuarios[i];
				}
		}
		return null;
	}

	public Usuario obtenerGerenteDeMayorSueldo() {
		
	}

	public void registrarIngreso(Integer numeroUsuario, Integer dia, Integer mes) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] == null) {
				if (dia >= 1 && dia <= 31)
					if (mes >= 1 && mes <= 12) {

					}
			}
		}

	}

	public void obtenerIngresosOrdenadosPorMes(Integer mes) {

	}

}
