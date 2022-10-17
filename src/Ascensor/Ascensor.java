package Ascensor;

public class Ascensor {

	private final int PISO_MAXIMO;
	private final int PISO_MINIMO;
	private final double PESO_MAXIMO;
	private final int CAPACIDAD_MAXIMA;
	private boolean puertaAbierta;
	private boolean sobrecarga;
	private int pisoActual;
	private double pesoActual;
	private int capacidadActual;
	// public Persona[] ocupantes;

	public double peso;
	private final int PLANTA_BAJA = 0;

	public Ascensor(double pesoMaximo, int pisoMaximo) {
		this.CAPACIDAD_MAXIMA = 0;
		this.PISO_MINIMO = PLANTA_BAJA;
		this.PISO_MAXIMO = pisoMaximo;
		this.PESO_MAXIMO = pesoMaximo;
		this.pesoActual = 0;
		this.pisoActual = PISO_MINIMO;
		this.puertaAbierta = false;
		this.sobrecarga = false;
	}

	public boolean ingresar(double elQueSube) {
		this.pesoActual += peso;
		if (pesoActual > PESO_MAXIMO) {
			sobrecarga = true;
		}
		return sobrecarga;
	}

	public void salir(double elQueBaja) {
		pesoActual -= peso;
	}

	public boolean abrirPuerta() {
		puertaAbierta = true;
		return puertaAbierta;
	}

	public boolean cerrarPuerta() {
		if (sobrecarga == false) {
			puertaAbierta = false;
		}
		return puertaAbierta;
	}

	public boolean subir() {
		boolean sePuedeSubir = false;
		if (pisoActual + 1 >= PISO_MAXIMO && puertaAbierta == false) {
			this.pisoActual++;
			sePuedeSubir = true;
		}
		return sePuedeSubir;

	}

	public boolean bajar() {
		boolean sePuedeBajar = false;
		if (pisoActual - 1 <= PISO_MAXIMO && puertaAbierta == false) {
			pisoActual--;
			sePuedeBajar = true;
		}
		return sePuedeBajar;

	}

	public boolean irAlPiso(int pisoDeseado) {
		boolean sePuedeIrAlPiso = false;
		while (pisoDeseado >= PISO_MINIMO && pisoDeseado <= PISO_MAXIMO && pisoActual != pisoDeseado
				&& puertaAbierta == false) {
			if (pisoDeseado > pisoActual) {
				subir();
			} else {
				bajar();
			}
			sePuedeIrAlPiso = true;
		}
		return sePuedeIrAlPiso;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public double getPesoActual() {
		return pesoActual;
	}

	public double getCalculoDeSobrecarga() {
		return pesoActual - PESO_MAXIMO;
	}

}
