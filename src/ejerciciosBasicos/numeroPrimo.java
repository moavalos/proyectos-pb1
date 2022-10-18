package ejerciciosBasicos;

import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Integer numero = teclado.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				if (numero % 1 == 0 && numero % numero == 0)
					System.out.println("el numero es primo. es divisible solo por " + i);
			}

		}
	}

}
