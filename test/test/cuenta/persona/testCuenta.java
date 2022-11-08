package test.cuenta.persona;

import java.util.Scanner;

import cuenta.persona.Cuenta;
import cuenta.persona.Persona;

public class testCuenta {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner teclado = new Scanner(System.in);
		Persona persona = new Persona(null, null, null);
		Cuenta cuenta = new Cuenta(persona);

		do {
			System.out.println("");
			System.out.println("bienvenido al banco, selecciona q mierda vas a hacer");
			System.out.println("1 - ingresar una persona");
			System.out.println("2 - crear una cuenta");
			System.out.println("3 - retirar dinero");
			System.out.println("4 - depositar dinero");
			System.out.println("5 - ver datos de cuenta/persona");
			System.out.println("6 - saber si el titular es mayor de edad");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				ingresarPersona(teclado, persona);
				break;
			case 2:
				crearCuenta(teclado, persona, cuenta);
				break;
			case 3:
				retirar(teclado, cuenta);
				break;
			case 4:
				depositar();
				break;
			case 5:
				verDatos();
				break;
			case 6:
				preguntarSiEsMayorDeEdad();
				break;
			default:
				System.out.println("error");
				break;
			}
		} while (opcion != 7);

	}

	private static void preguntarSiEsMayorDeEdad() {
		// TODO Auto-generated method stub

	}

	private static void verDatos() {
		// TODO Auto-generated method stub

	}

	private static void depositar() {
		// TODO Auto-generated method stub

	}

	private static void retirar(Scanner teclado, Cuenta cuenta) {
		System.out.println("ingresa el monto de su cuenta");
		double cantidadEnLaCuenta = teclado.nextDouble();
		System.out.println("ingresa la cantidad que queres retirar");
		double cantidad = teclado.nextDouble();
		if (cantidad < cantidadEnLaCuenta) {
			cuenta.retirar(cantidad);
			System.out.println("te quedan " + cuenta.getCantidad());
		}
	}

	private static void crearCuenta(Scanner teclado, Persona persona, Cuenta cuentita) {
		System.out.println("ingrese la cantidad que tiene en su cuenta");
		double cantidad = teclado.nextDouble();
		System.out.println("ingrese el dni del titular");
		Integer dni = teclado.nextInt();

		cuentita = new Cuenta(persona, cantidad);
		
		if (persona.getDni().equals(dni)) {
			System.out.println("se creó la cuentita");
			System.out.println(cuentita.toString());

		}

	}

	private static void ingresarPersona(Scanner teclado, Persona personita) {
		System.out.println("Ingrese su nombre");
		String nombre = teclado.next();

		System.out.println("Ingrese su edad");
		Integer edad = teclado.nextInt();

		System.out.println("Ingrese su dni");
		Integer dni = teclado.nextInt();

		personita = new Persona(nombre, edad, dni);

		if (personita.equals(personita) && personita.esMayorDeEdad(personita)) {
			System.out.println("se agregó correctamente");
			System.out.println(personita.toString());
		} else {
			System.out.println("algo está mal, quizas no sos mayor de 18");
		}

	}

}
