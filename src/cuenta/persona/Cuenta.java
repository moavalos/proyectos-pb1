package cuenta.persona;

public class Cuenta {

	private static Persona titular;
	private static double cantidad;

	public Cuenta(Persona titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(Persona titular) {
		this.titular = titular;
		this.cantidad = 0.0;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad > 0)
			this.cantidad += cantidad;
	}
	
	public void retirar(double retirar) {
		this.cantidad -= cantidad;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [Titular = " + getTitular() + ", Cantidad = " + getCantidad() + "]";
	}

	

}
