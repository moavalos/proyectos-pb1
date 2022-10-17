package testCalculadora;

import java.util.Scanner;

import calculadora.Calculadora;

public class test {


	final static int SUMA = 1, RESTA = 2, MULTIPLICACION = 3, DIVISION = 4, AREA_CIRCULO = 5,
			NUMERO_POSITIVO_NEGATIVO = 6, POTENCIA = 7, SUMATORIA = 8, SUMATORIA_V2 = 9, PRODUCTORIA = 10,
			PRODUCTORIA_V2 = 11, DIVISORES = 12, SALIR = 15;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcionDeseada = 0;
		Calculadora casio = new Calculadora(80, 2);
		Calculadora celular = new Calculadora();

		do {
			System.out.println("");
			System.out.println("BIENVENIDOS A LA CALCULADORA");
			System.out.println("-----------------------------");

			System.out.println("Primero, elija dos numeros para el objeto con parametros.");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicaci�n");
			System.out.println("4 - Divisi�n");
			System.out.println("5 - �rea de un c�rculo");
			System.out.println("6 - N�mero positivo o negativo");
			System.out.println("7 - Potencia");
			System.out.println("8 - Sumatoria con limite");
			System.out.println("9 - Sumatoria con limite inferior y limite superior");
			System.out.println("10 - Productoria con limite");
			System.out.println("11 - Productoria con lmite inferior y limite superior");
			System.out.println("12 - Contar los divisores de un n�mero");
			System.out.println("15 - Salir");

			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {
			case SUMA:
				suma(casio, celular, teclado);
				break;
			case RESTA:
				resta(casio, celular, teclado);
				break;
			case MULTIPLICACION:
				multiplicacion(casio, celular, teclado);
				break;
			case DIVISION:
				division(casio, celular, teclado);
				break;
			case AREA_CIRCULO:
				areaDelCirculo(celular, teclado);
				break;
			case NUMERO_POSITIVO_NEGATIVO:
				esPositivo(celular, teclado);
				break;
			case POTENCIA:
				potencia(casio, celular, teclado);
				break;
			case SUMATORIA:
				sumatoria(celular, teclado);
				break;
			case SUMATORIA_V2:
				sumatoriaV2(celular, teclado);
				break;
			case PRODUCTORIA:
				productoria(celular, teclado);
				break;
			case PRODUCTORIA_V2:
				productoriaV2(celular, teclado);
				break;
			case DIVISORES:
				contarDivisores(celular, teclado);
				break;
			case SALIR:
				System.out.println("chauhis");
				break;
			default:
				System.out.println("ERROR");
				break;

			}
		} while (opcionDeseada != SALIR);

	}

	public static void suma(Calculadora casio, Calculadora celular, Scanner teclado) {
		double operador1 = 0;
		double operador2 = 0;

		System.out.println("Ingrese el operador 1");
		operador1 = teclado.nextDouble();

		System.out.println("Ingrese el operador 2");
		operador2 = teclado.nextDouble();

		System.out.println("La suma sin parametros es: " + casio.sumar());
		System.out.println("La suma con parametros es: " + celular.sumar(operador1, operador2));

	}

	public static void resta(Calculadora casio, Calculadora celular, Scanner teclado) {
		double operador1 = 0;
		double operador2 = 0;

		System.out.println("Ingrese el operador 1");
		operador1 = teclado.nextDouble();

		System.out.println("Ingrese el operador 2");
		operador2 = teclado.nextDouble();

		System.out.println("La resta sin parametros es: " + casio.restar());
		System.out.println("La resta con parametros es: " + celular.restar(operador1, operador2));

	}

	public static void multiplicacion(Calculadora casio, Calculadora celular, Scanner teclado) {
		double operador1 = 0;
		double operador2 = 0;

		System.out.println("Ingrese el operador 1");
		operador1 = teclado.nextDouble();

		System.out.println("Ingrese el operador 2");
		operador2 = teclado.nextDouble();

		System.out.println("La multiplicacion sin parametros es: " + casio.multiplicar());
		System.out.println("La multiplicacion con parametros es: " + celular.multiplicar(operador1, operador2));

	}

	public static void division(Calculadora casio, Calculadora celular, Scanner teclado) {
		double operador1 = 0;
		double operador2 = 0;

		System.out.println("Ingrese el operador 1");
		operador1 = teclado.nextDouble();

		System.out.println("Ingrese el operador 2");
		operador2 = teclado.nextDouble();

		System.out.println("La division sin parametros es: " + casio.dividir());
		System.out.println("La division con parametros es: " + celular.dividir(operador1, operador2));

	}

	public static void areaDelCirculo(Calculadora celular, Scanner teclado) {
		double radio = 0;
		System.out.println("Ingrese el radio del circulo para calcular el area");
		radio = teclado.nextDouble();

		System.out.println("El area del circulo es: " + celular.areaDelCirculo(radio));

	}

	public static void esPositivo(Calculadora celular, Scanner teclado) {
		double numero = 0;
		System.out.println("Ingrese un numero para saber si es positivo o negativo");
		numero = teclado.nextDouble();

		System.out.println(celular.esPositivo(numero));

	}

	public static void potencia(Calculadora casio, Calculadora celular, Scanner teclado) {
		double operador1 = 0;
		double operador2 = 0;

		System.out.println("Ingrese el operador 1");
		operador1 = teclado.nextDouble();

		System.out.println("Ingrese el operador 2");
		operador2 = teclado.nextDouble();

		System.out.println("El resultado de la potencia es: " + casio.potencia());
		System.out.println("El resultado de la potencia es: " + celular.potencia(operador1, operador2));

	}

	public static void sumatoria(Calculadora celular, Scanner teclado) {
		int limite = 0;

		System.out.println("Ingrese el limite para sumar los numeros menores a el");
		limite = teclado.nextInt();

		System.out.println("La sumatoria es: " + celular.sumatoria(limite));
	}

	public static void sumatoriaV2(Calculadora celular, Scanner teclado) {
		int limiteInferior = 0;
		int limiteSuperior = 0;

		System.out.println("Ingrese el limite inferior");
		limiteInferior = teclado.nextInt();

		System.out.println("Ingrese el limite Superior");
		limiteSuperior = teclado.nextInt();

		System.out.println("La sumatoria entre estos dos limites es: " + celular.sumatoriaV2(limiteInferior, limiteSuperior));
	}

	public static void productoria(Calculadora celular, Scanner teclado) {
		int limite = 0;
		System.out.println("Ingrese el limite para multiplicar los valores menores a �l");
		limite = teclado.nextInt();

		System.out.println("La productoria es: " + celular.productoria(limite));
	}

	public static void productoriaV2(Calculadora celular, Scanner teclado) {
		int limiteInferior = 0;
		int limiteSuperior = 0;

		System.out.println("Ingrese el limite inferior");
		limiteInferior = teclado.nextInt();

		System.out.println("Ingrese el limite Superior");
		limiteSuperior = teclado.nextInt();

		System.out.println("La productoria entre estos dos limites es: " + celular.productoriaV2(limiteInferior, limiteSuperior));
	}

	public static void contarDivisores(Calculadora celular, Scanner teclado) {
		int numero = 0;

		System.out.println("Ingrese el numero para contar sus divisores");
		numero = teclado.nextInt();

		System.out.println("Los divisores son: " + celular.contarDivisores(numero));

	}

}
