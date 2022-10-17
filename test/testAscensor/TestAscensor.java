package testAscensor;

import java.util.Scanner;

import Ascensor.Ascensor;

public class TestAscensor {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Ascensor ascensorEdificio12 = new Ascensor(300, 50);

		int opcionMenu;
		boolean salir = false;
		double peso;
		do {
			opcionMenu = mostrarMenu(1, 8, teclado);

			switch (opcionMenu) {
			case 1:
				if (ascensorEdificio12.abrirPuerta()) {
					System.out.println("Se abre la puerta.");
				} else {
					System.out.println("No se pudo abrir la puerta.");
				}
				break;
			case 2:
				if (ascensorEdificio12.cerrarPuerta()) {
					System.out.println("Se cierra la puerta.");
				} else {
					System.out.println("La puerta no se pudo cerrar, excediste el peso m�ximo.");
				}
				break;
			case 3:
				System.out.print("Ingrese el peso que va a ingresar al ascensor: ");
				peso = teclado.nextDouble();
				if (ascensorEdificio12.ingresar(peso)) {
					System.out.println("El ascensor tiene " + ascensorEdificio12.getCalculoDeSobrecarga()
							+ " kg de sobrecarga. Por favor descienda.");
				} else {
					System.out.println("Disfrute el viaje en el ascensor.");
				}
				break;
			case 4:
				System.out.print("Ingrese el peso que va a salir del ascensor: ");
				peso = teclado.nextDouble();
				ascensorEdificio12.salir(peso);
				break;

			case 5:
				System.out.println("Estas en el piso: " + ascensorEdificio12.getPisoActual());
				if (ascensorEdificio12.subir()) {
					System.out.println("Ya subiste, ahora estas en el piso: " + ascensorEdificio12.getPisoActual());
				} else {
					System.out.println(
							"No se puede subir: Verifique si est� en el �ltimo piso o si la puerta est� abierta.");
				}
				break;

			case 6:
				System.out.println("Estas en el piso: " + ascensorEdificio12.getPisoActual());
				if (ascensorEdificio12.bajar()) {
					System.out.println("Ya bajaste, ahora estas en el piso: " + ascensorEdificio12.getPisoActual());
				} else {
					System.out.println(
							"No se puede bajar: Verifique si est� en planta baja o si la puerta est� abierta.");
				}
				break;
			case 7:
				System.out.println("Estas en el piso: " + ascensorEdificio12.getPisoActual());
				System.out.print("Ingrese al piso al que desea ir:");
				int pisoDeseado = teclado.nextInt();

				if (ascensorEdificio12.irAlPiso(pisoDeseado)) {
					System.out.println("Ya subiste al piso deseado, ahora estas en el piso: "
							+ ascensorEdificio12.getPisoActual());
				} else {
					System.out.println("El piso deseado es inv�lido, por favor, verifique los l�mites del edificio.");
				}
				break;
			case 8:
				salir = true;
				break;

			}

		} while (salir != true);
	}

	private static int mostrarMenu(int min, int max, Scanner teclado) {
		int opcion = 0;

		do {
			System.out.println(" \nPanel de control");
			System.out.println("1 - Abrir la puerta");
			System.out.println("2 - Cerrar la puerta");
			System.out.println("3 - Ingresar");
			System.out.println("4 - Salir");
			System.out.println("5 - Subir");
			System.out.println("6 - Bajar");
			System.out.println("7 - ir al piso");
			System.out.println("8 - SALIR DEL MEN�");
			System.out.println("**************");

			opcion = teclado.nextInt();

		} while (opcion < min || opcion > max);
		return opcion;

	}

}
