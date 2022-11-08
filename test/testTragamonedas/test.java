package testTragamonedas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Tragamonedas.FixNumberGenerator;
import Tragamonedas.Tambor;
import Tragamonedas.Tragamonedas;

public class test {

	@Test
	public void probarTambor() {
		Integer posicionInicial;
		Integer posicionNueva;
		FixNumberGenerator generador = new FixNumberGenerator(1);
		Tambor tambor = new Tambor(generador);
		posicionInicial = tambor.getPosicion();
		tambor.girar();
		posicionNueva = tambor.getPosicion();
		assertTrue(posicionInicial != posicionNueva && posicionNueva > 0 && posicionNueva < 11);
	}

	@Test
	public void probarTragamonedasConNumerosAleatorios() {
		Tragamonedas tragamonedas = new Tragamonedas();
		tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if (tragamonedas.entregaPremio()) {
			System.out.println("Todos los tambores están en la misma posición. Ganaste!");
		} else {
			System.out.println("Los tambores no están en la misma posición. Perdiste!");
		}
		assertTrue(tragamonedas.getTambor1().getPosicion() > 0 && tragamonedas.getTambor1().getPosicion() <= 10
				&& tragamonedas.getTambor2().getPosicion() > 0 && tragamonedas.getTambor2().getPosicion() <= 10
				&& tragamonedas.getTambor3().getPosicion() > 0 && tragamonedas.getTambor2().getPosicion() <= 10);
	}

	@Test
	public void probarTragamonedasConNumerosIguales() {
		Tragamonedas tragamonedas = new Tragamonedas();
		// tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if (tragamonedas.entregaPremio()) {
			System.out.println("Todos los tambores están en la misma posición. Ganaste!");
		} else {
			System.out.println("Los tambores no están en la misma posición. Perdiste!");
		}
		assertTrue(tragamonedas.getTambor1().getPosicion() == 1 && tragamonedas.getTambor2().getPosicion() == 1
				&& tragamonedas.getTambor3().getPosicion() == 1);
	}
}
