package ejerciciosBasicos;

public class Nota {

	private float nota;

	public Nota(float valorInicial) {
		this.nota = valorInicial;
	}

	public boolean aprobar() {
		return nota >= 7;
	}
	
	public void recuperar(float nuevoValor) {
		this.nota = nuevoValor;
	}

}
