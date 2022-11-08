package Tragamonedas;

public class FixNumberGenerator implements NumberGenerator {
	private Integer numero;

	/*
	 * Este generador devolverá siempre number cuando se llame al método generate()
	 */
	public FixNumberGenerator(Integer number) {
		this.numero = number;
	}

	@Override
	public Integer generate() {
		return numero;
	}
}
