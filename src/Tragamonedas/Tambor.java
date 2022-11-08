package Tragamonedas;

public class Tambor {

	private final int POSICION_MINIMA = 1;
	private final int POSICION_MAXIMA = 8;
	private Integer posicion;

	public Tambor(NumberGenerator generator) {
		this.posicion = generator.generate();
	}

	/*
	 * post: devuelve el número de posición en la que se encuentra el Tambor. Es un
	 * valor comprendido entre 1 y 10.
	 */
	public Integer getPosicion() {
		return posicion;
	}

	/*
	 * post: hace girar el tambor y luego se detiene en una posición comprendida
	 * entre 1 y 10.
	 */
	public void girar() {
		RandoNumberGenerator generadorRandom = new RandoNumberGenerator();
		this.posicion = generadorRandom.generate();
	}

}
