package ejerciciosBasicos;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer cantidadNumeros;
		Integer suma = 0;
		Integer numero = 0;

		System.out.println("ingrese cuantos numeros quiere ingresar para calcular su promedio");
		cantidadNumeros = teclado.nextInt();
		System.out.println("ingrese los numeros segun la cantidad que indicó");
		for (int i = 0; i < cantidadNumeros; i++) {
			numero = teclado.nextInt();
			suma += numero;
		}
		Integer promedio = suma / cantidadNumeros;
		System.out.println("el promedio es " + promedio);

	}

}
