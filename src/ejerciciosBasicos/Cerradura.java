package ejerciciosBasicos;

public class Cerradura {

	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	
	private Integer fallos;

	public Cerradura(Integer clave, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = clave;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(int clave) {
		if (this.claveDeApertura.equals(clave) && fallos < cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		} else {
			fallos++;
			return false;
		}
	}

	public boolean cerrar() {
		return !estaAbierta();
	}

	public boolean estaAbierta() {
		return true;
	}

	public boolean fueBloqueada() {
		if (fallos >= cantidadDeFallosConsecutivosQueLaBloquean)
			return true;
		return false;
	}

}
