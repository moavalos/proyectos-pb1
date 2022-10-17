package testAvion;

import java.util.Scanner;

import Avion.Pasajero;
import Avion.Vuelo;

public class Chekin {

	public static void main(String[] args) {
		System.out.println("Bienvenido ");
		int CantidadPasajero = 192;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);
		Pasajero pasajero = new Pasajero(44318877, "mora", "avalos");
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				registrarPasajero(vuelo, pasajero);
				break;
			case 2:
				elegirAsiento(vuelo, pasajero);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);
	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

	public static void registrarPasajero(Vuelo actual, Pasajero pasajero) {
		/*
		 * Interfaz de usuario encargada de cargar un pasajero al vuelo. Debe ingresar
		 * los datos necesarios e informar por pantalla el resultado de la operación
		 */
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.println("Ingrese su dni");
		dni = teclado.nextInt();
		System.out.println("Ingrese su nombre");
		nombre = teclado.next();
		System.out.println("Ingrese su apellido");
		apellido = teclado.next();
		pasajero = new Pasajero(dni, nombre, apellido);
		if (actual.agregarPasajero(pasajero)) 
			System.out.println("Se pudo agregar");
		
	}

	private static void elegirAsiento(Vuelo actual, Pasajero pasajeroASentar) {
		/*
		 * Interfaz de usuario encargada de gestionar la asignación de asientos en el
		 * vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el
		 * resultado de la operación
		 */
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		
		System.out.println("Ingrese su dni");
		dni = teclado.nextInt();
		System.out.println("elija la fila");
		fila = teclado.nextInt();
		System.out.println("elija la columna");
		columna = teclado.nextInt();
		
		pasajeroASentar = new Pasajero(dni);
		
		if (actual.asignarAsiento(pasajeroASentar, fila, columna))
			System.out.println("Se pudo asigar asiento");

	}

	private static void listarPasajeros(Vuelo actual) {
		/*
		 * Se debe mostrar la lista de pasajeros registrados para éste vuelo ordenados
		 * por DNI
		 */
		System.out.println("Pasajeros: " + actual.toString());
	}

}
