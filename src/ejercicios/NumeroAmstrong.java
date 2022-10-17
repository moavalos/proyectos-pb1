package ejercicios;

public class NumeroAmstrong {
	/*
	 * Un número de Amstrong es aquel que es igual a la suma de sus dígitos elevados
	 * a la potencia de su número de cifras.
	 */
	public static void main(String args[]) {

		int númeroOriginal, últimoDigito;
		double dígitos;
		double suma = 0;
		int número = 371;
		númeroOriginal = número;
		dígitos = Math.floor(Math.log10(número)) + 1; /*
														 * Calcula el total de dígitos del número
														 */
		// Math.floor Devuelve el máximo entero menor o igual a un número pasado como
		// parámetro.
		// Math.log10 Devuelve el logaritmo en base 10 de un número pasado como
		// parámetro

		while (número > 0) {
			últimoDigito = número % 10; //Extrae el último dígito
			suma = suma + Math.pow(últimoDigito, dígitos);
			número = número / 10;
		}
		if (númeroOriginal == suma) {
			System.out.println(númeroOriginal + " es un número de Amstrong");
		} else {
			System.out.println(númeroOriginal + " no es un número de Amstrong");
		}
	}

}
