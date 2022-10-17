package testPartido;

import java.util.Scanner;

import Partido.EquipoDeFutbol;
import Partido.Evento;
import Partido.Jugador;
import Partido.Partido;

public class test {


	final static Integer EQUIPO_LOCAL = 1, EQUIPO_RIVAL = 2, AGREGAR_JUGADOR = 3, BUSCAR_POR_NUMERO = 4,
			BUSCAR_POR_NOMBRE = 5, EDAD_PROMEDIO = 6, VALOR_EQUIPO = 7, JUGAR = 8;

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Integer opcionDeseada = 0;
		EquipoDeFutbol equipo = new EquipoDeFutbol("");
		Partido partido = new Partido(null, null);
		Jugador jugador = new Jugador(0, "", 0, 0.0);
		Evento evento = new Evento(0, null, null);
		
		do {
			System.out.println("");
			System.out.println("WELCOMEEEEEEEEEEEEE");
			System.out.println("Selecciona que mierda quiere hacer");
			System.out.println("1 - Insertar equipo local");
			System.out.println("2 - Insertar equipo rival/visitante");
			System.out.println("3 - Agregar jugador al equipo");
			System.out.println("4 - Buscar jugador por numero");
			System.out.println("5 - Buscar jugador por nombre");
			System.out.println("6 - Calcular la edad promedio del equipo");
			System.out.println("7 - Calcular el valor por precio del equipo");
			System.out.println("8 - Jugar partido"); // en este metodo entra metodos de Evento, su enum y partidoDeFutbol
			
			opcionDeseada = teclado.nextInt();
			
			switch(opcionDeseada) {
			case EQUIPO_LOCAL:
				equipoLocal(equipo, teclado);
				break;
			case EQUIPO_RIVAL:
				equipoRival(equipo, teclado);
				break;
			case AGREGAR_JUGADOR:
				break;
			case BUSCAR_POR_NUMERO:
				break;
			case BUSCAR_POR_NOMBRE:
				break;
			case EDAD_PROMEDIO:
				break;
			case VALOR_EQUIPO:
				break;
			case JUGAR:
				break;
			default:
				System.out.println("error");
				break;
			}
		} while(opcionDeseada != 7);
	}
	
	public static void equipoLocal(EquipoDeFutbol equipo, Scanner teclado) {
		System.out.println("Ingrese el nombre del equipo local");
		String nombre = teclado.next();
		EquipoDeFutbol equipoLocal = new EquipoDeFutbol(nombre);
		if(equipoLocal.equals(equipo)) {
			System.out.println("se creó correctamente");
		}
	}
	public static void equipoRival(EquipoDeFutbol equipo, Scanner teclado) {
		System.out.println("Ingrese el nombre del equipo rival");
		String nombre = teclado.next();
		EquipoDeFutbol equipoRival = new EquipoDeFutbol(nombre);
		if(equipoRival.equals(equipo)) {
			System.out.println("se creó correctamente");
		}
	}
	
	public static void agregarJugador(Scanner teclado, Jugador jugador1, EquipoDeFutbol equipo) {
		System.out.println("Ingrese el numero del jugador");
		Integer numero = teclado.nextInt();
		System.out.println("Ingrese su nombre");
		String nombre = teclado.next();
		System.out.println("Ingrese su edad");
		Integer edad = teclado.nextInt();
		System.out.println("Ingrese su precio");
		Double precio = teclado.nextDouble();
		
		Jugador jugador = new Jugador(numero, nombre, edad, precio);
		
		if(jugador.equals(jugador1)) {
			System.out.println("se agregó correctamente");
		}
		
		System.out.println("Ingrese el equipo donde quiere agregar al jugador");
		System.out.println("opciones:");
		System.out.println("1 - Equipo local: " + equipoLocal.getNombre);
		System.out.println("2 - Equipo rival: " + equipoRival.getNombre);
	}

	AMONESTAR = 7, EXPULSAR = 8, GANADOR = 9

}
