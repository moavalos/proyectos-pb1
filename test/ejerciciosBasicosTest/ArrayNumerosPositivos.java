package ejerciciosBasicosTest;

import java.util.Scanner;

public class ArrayNumerosPositivos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("ingresa el tamaño de un array");
		Integer tamaño = teclado.nextInt();

		Integer numeros[] = new Integer[tamaño];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.println((i+1) + " = " + numeros[i]);
		}
	}

}
