package ejerciciosBasicos;

public class DiscoRigido {

	private double tamano;
	private final static double BYTE = 1024;

	public DiscoRigido(double tamano) {
		this.tamano = tamano;
	}

	// 1 TB --> 1024 GB
	private double conversionTbAgB() {
		return tamano * BYTE;
	}

	// Cuantos dvds entran en 4.5 GB
	public double calcularDvds() {
		return conversionTbAgB() / 4.5F;
	}

	// Cuantos bluerays entran en 15 GB
	public double calcularBlueRays() {
		return conversionTbAgB() / 15;
	}

}
