package ejerciciosBasicos;

public class Coche {

	private final int CERO_KM = 0;
	private final int AÑO_ACTUAL = 2022;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int añoFabricacion;
	private double precio;

	public Coche(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public Coche(String marca, String modelo, int kilometros, int año, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometros;
		this.añoFabricacion = año;
		this.precio = precio;
	}

	public int calcularAntiguedad() {
		return AÑO_ACTUAL - añoFabricacion;
	}

	public int getKilometrosActuales() {
		return kilometrosActuales;
	}

	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidadCoches() {
		return cantidadCoches++;
	}

}
