package ejerciciosBasicos;

public class Distancia {
	public final byte DECAMETRO = 0;
	public final byte HECTOMETRO = 1;
	public final byte KILOMETRO = 2;
	public float convertirADecametro = 0.1F;
	public float convertirAHectometro = 0.01F;
	public float convertirAKilometro = 0.001F;
	private double valor;

	public Distancia(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor, byte unidad) {
		// utilizamos este metodo cuando queremos pasar el valor que tenemos en otra 	unidad a 	metros 
		switch (unidad) {
		case DECAMETRO:
			this.valor = valor / convertirADecametro;
			break;
		case HECTOMETRO:
			this.valor = valor / convertirAHectometro;
			break;
		case KILOMETRO:
			this.valor = valor / convertirAKilometro;
			break;
		default:
			break;
		}
	}

	public double convertir(byte unidad) {
		double valor = this.valor;
		switch (unidad) {

		case DECAMETRO:
			valor *= convertirADecametro;
			break;
		case HECTOMETRO:
			valor *= convertirAHectometro;
			break;
		case KILOMETRO:
			valor *= convertirAKilometro;
			break;
		default:
			break;
		}
		return valor;

	}
}
