package ejerciciosBasicosTest;

import java.util.Scanner;

import ejerciciosBasicos.Cerradura;

public class testCerradura {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Cerradura c = new Cerradura(1212, 3);

		System.out.println(c.cerrar());
		System.out.println(c.abrir(1211));
		System.out.println(c.abrir(1211));
		System.out.println(c.abrir(1211));
		System.out.println(c.fueBloqueada());
		
		System.out.println(c.abrir(1212));
	}
}
