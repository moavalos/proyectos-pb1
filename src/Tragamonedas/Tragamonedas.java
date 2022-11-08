package Tragamonedas;

public class Tragamonedas {

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;

	public Tambor getTambor1() {
		return tambor1;
	}

	public Tambor getTambor2() {
		return tambor2;
	}

	public Tambor getTambor3() {
		return tambor3;
	}

	public Tragamonedas() {
		FixNumberGenerator generador = new FixNumberGenerator(1);
		tambor1 = new Tambor(generador);
		tambor2 = new Tambor(generador);
		tambor3 = new Tambor(generador);
	}

	/*
	 * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
	 */
	public void activar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}

	/*
	 * post: indica si el Tragamonedas entrega un premio a partir de la posición de
	 * sus 3 Tambores.
	 */
	public Boolean entregaPremio() {
		if (tambor1.getPosicion() == tambor2.getPosicion() && tambor2.getPosicion() == tambor3.getPosicion()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Imprime en pantalla el estado de las posiciones de sus 3 Tambores.
	 */
	public void imprimirEstado() {
		System.out.println("Tambor 1: " + tambor1.getPosicion());
		System.out.println("Tambor 2: " + tambor2.getPosicion());
		System.out.println("Tambor 3: " + tambor3.getPosicion());
	}

}
