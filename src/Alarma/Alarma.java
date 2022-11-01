package Alarma;

public class Alarma {

	private Sensor sensorDeMovimiento;
	private Sensor sensorDeContacto;
	private Sensor sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;

	public Alarma(int codigo) {
		this.codigoDeSeguridad = codigo;
	}

	public void encender(int cod) {
		if (codigoDeSeguridad == cod)
			encendida = true;
	}

	public void apagar() {
		encendida = false;
	}

	public boolean activada() {
		if (encendida == true) {
			sensorDeMovimiento.activar();
			sensorDeContacto.activar();
			sensorDeSonido.activar();
			return true;
		}
		return false;
	}

}
