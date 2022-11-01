package Alarma;

public class Sensor {

	private Boolean estado;

	public Sensor() {

	}

	public boolean activado() {
		if(estado.equals(true)) 
			return true;
		return false;
	}

	public void activar() {
		estado = true;
	}

	public void desactivar() {
		estado = false;
	}

}
