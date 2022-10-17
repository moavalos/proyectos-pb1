package temperatura;

public class Temperatura {

	public final byte CELSIUS = 32;
	public final byte FARENHEIT = 32;
	public final double KELVIN = 273.15;

	private final double CONSTANTE_FARENHEIT_NUEVE_QUINTOS = 1.8;
	private final double CONSTANTE_FARENHEIT_TREINTA_Y_DOS = 32;
	private final double UNIDAD_DE_CONVERSION_KELVIN = 273.15;
	private final double MINIMA_TEMPERATURA_VALIDA = -UNIDAD_DE_CONVERSION_KELVIN;

	private double valor;

	public Temperatura(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		if (temperaturaValida(valor)) {
			this.valor = valor;
		}
	}

	public void setValor(double valor, byte unidad) {
		double temperaturaEnCelcius = this.convertirACelcius(valor, unidad);
		if (temperaturaValida(convertirACelcius(valor, unidad))) {
			this.setValor(temperaturaEnCelcius);
		}
	}

	public double convertir(byte unidad) {
		double resultado = 0.0;

		switch (unidad) {
		case 1:
			resultado = this.valor;
			break;
		case 2:
			resultado = (this.valor * CONSTANTE_FARENHEIT_NUEVE_QUINTOS) + CONSTANTE_FARENHEIT_TREINTA_Y_DOS;
			break;
		case (byte) KELVIN:
			resultado = this.valor + UNIDAD_DE_CONVERSION_KELVIN;
			break;
		}
		return resultado;
	}

	private double convertirACelcius(double valor, byte unidad) {
		double temperaturaEnCelcius = 0.0;
		switch (unidad) {
		case 1: // 0
			temperaturaEnCelcius = valor;
			break;
		case 2: // 1
			temperaturaEnCelcius = (valor - CONSTANTE_FARENHEIT_TREINTA_Y_DOS) / CONSTANTE_FARENHEIT_NUEVE_QUINTOS;
			break;
		case (byte) KELVIN: // 2
			temperaturaEnCelcius = valor - UNIDAD_DE_CONVERSION_KELVIN;
			break;
		}
		return temperaturaEnCelcius;
	}

	private boolean temperaturaValida(double valorEnCelcius) {
		if (valorEnCelcius >= MINIMA_TEMPERATURA_VALIDA) {
			return true;
		} else {
			return false;
		}
	}

}
