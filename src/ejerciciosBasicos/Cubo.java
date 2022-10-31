package ejerciciosBasicos;

public class Cubo {

	private float lonfigutLado;

	public Cubo(float lado) {
		this.lonfigutLado = lado;
	}

	public float getLonfigutLado() {
		return lonfigutLado;
	}

	public void setLonfigutLado(float lonfigutLado) {
		this.lonfigutLado = lonfigutLado;
	}

	public float getSuperficieCara() {
		return (float) (6 * (Math.pow(lonfigutLado, 2)));
	}

	public float getVolumen() {
		return (float) Math.pow(lonfigutLado, 3);
	}

	public static void main(String[] args) {
		Cubo cubito = new Cubo(5);
		System.out.println("La superficie total del cubo es de: " + cubito.getSuperficieCara());
		System.out.println("Su volumen es de " + cubito.getVolumen());
	}
}
