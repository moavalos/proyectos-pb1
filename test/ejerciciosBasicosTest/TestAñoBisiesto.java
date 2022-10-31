package ejerciciosBasicosTest;

import java.util.Scanner;

public class TestAñoBisiesto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese un año para saber si es bisiesto");
		Integer año = teclado.nextInt();

		if (año % 4 == 0) {
			System.out.println("año bisiesto");
		} else {
			System.out.println("no es bisiesto");
		}

	}

}
