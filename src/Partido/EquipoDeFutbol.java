package Partido;
public class EquipoDeFutbol {

	private String nombre;
	private Jugador jugadores[];

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new Jugador[5];
	}

	/*
	 * La capacidad m�xima de un equipo es 5. No se permiten jugadores repetidos (ya
	 * sea el n�mero o nombre del jugador) Se retorna el resultado de la operaci�n
	 */
	public boolean agregarJugador(Jugador nuevo) {
		// Jugador jugador = new Jugador();
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] == null && jugadores.equals(nuevo.getNumero())) {
				jugadores[i] = nuevo;
				return true;
			}
		}
		return false;
	}

	/*
	 * Permite buscar un jugador por su numero.
	 * 
	 */
	public Jugador buscarPorNumero(int numero) {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] == null)
				if (jugadores[i].getNumero() == numero) {
					return jugadores[i];
				}
		}
		return null;
	}

	/*
	 * Permite buscar un jugador por su nombre.
	 * 
	 */
	public Jugador buscarPorNombre(String nombre) {
		for (int j = 0; j < jugadores.length; j++) {
			if (jugadores[j] == null)
				if (jugadores[j].getNombre().equals(nombre)) {
					return jugadores[j];
				}
		}
		return null;
	}

	/*
	 * Calcula el valor del equipo.
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		int suma = 0;
		int promedio = 0;
		for (int i = 1; i < jugadores.length; i++) {
			suma += jugadores[i].getEdad();
			promedio =  suma / jugadores.length;
		}
		return promedio;
	}

	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double precios = 0.0;
		double valores = 0.0;
		for (int i = 0; i < jugadores.length; i++) {
			precios += jugadores[i].getPrecio();
			valores = precios / jugadores.length;
		}
		return valores;
	}

	public String toString() {
		return this.nombre;
	}

}
