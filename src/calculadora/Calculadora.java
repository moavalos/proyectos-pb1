package calculadora;

public class Calculadora {


	private double operador1;
	private double operador2;

	public Calculadora() {

	}

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double sumar() {
		double resultado = operador1 + operador2;
		return resultado;

	}

	public double sumar(double operador1, double operador2) {
		double resultado = operador1 + operador2;
		return resultado;
	}

	public double restar() {
		double resultado = operador1 - operador2;
		return resultado;
	}

	public double restar(double operador1, double operador2) {
		double resultado = operador1 - operador2;
		return resultado;
	}

	public double multiplicar() {
		double resultado = operador1 * operador2;
		return resultado;
	}

	public double multiplicar(double operador1, double operador2) {
		double resultado = operador1 * operador2;
		return resultado;

	}

	// metodo mejorado
	public double dividir() {
		double resultado = 0; // = operador1 / operador2;
		if (operador2 <= 0) {
			System.out.println("No es posible dividir por 0");
		} else {
			resultado = operador1 / operador2;
		}
		return resultado;

	}

	public double dividir(double operador1, double operador2) {
		double resultado = operador1 / operador2;
		if (operador2 <= 0) {
			System.out.println("No es posible dividir por 0");
		} else {
			resultado = operador1 / operador2;
		}
		return resultado;

	}

	public double areaDelCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		return area;

	}

	public double esPositivo(double numero) {
		if (numero >= 0) {
			System.out.println("El numero es positivo");
		} else {
			System.out.println("El numero es negativo");
		}
		return numero;
	}

	public double potencia(double operador1, double operador2) {
		double potencia = Math.pow(operador1, operador2);
		return potencia;
	}

	public double potencia() {
		double potencia = Math.pow(operador1, operador2);
		return potencia;
	}

	public double sumatoria(int limite) {
		int resultado = 0;
		for (int i = 0; i < limite; i++) {
			resultado += i;
		}
		return resultado;

	}

	public double sumatoriaV2(int limiteInferior, int limiteSuperior) {
		int resultado = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado += i;
		}
		return resultado;
	}

	public double productoria(int limite) {
		int resultado = 1;
		for (int i = 1; i < limite; i++) {
			resultado *= i;
		}
		return resultado;

	}

	public double productoriaV2(int limiteInferior, int limiteSuperior) {
		int resultado = 1;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public String contarDivisores(int numero) {
		String resultado = "";
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) { // si el resto de la division da 0, el numero es un divisor
				resultado += (i + " ");
			}
		}

		return resultado;
	}


}
