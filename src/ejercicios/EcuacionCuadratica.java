package ejercicios;

public class EcuacionCuadratica {

	private Integer a;
	private Integer b;
	private Integer c;

	public EcuacionCuadratica(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double getDiscriminante() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	public Double calcularRaiz1() {
		return (double) Math.round((-b + Math.sqrt(getDiscriminante())) / (2 * a));
	}
	
	public Double calcularRaiz2() {
		return (double) Math.round((-b - Math.sqrt(getDiscriminante())) / (2 * a));
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Ecuacion cuadratica [a = " + a + ", b = " + b + ", c = " + c + "]";
	}

}
