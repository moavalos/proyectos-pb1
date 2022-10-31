package testPassword;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import password.Password;

public class TestPassword {

	@Test
	public void queLaLongitudDeLaContraseaSeaMayorQueOcho() {
		Integer longitud = 8;
		Password contra = new Password(longitud);
		contra.mayorQueOcho(longitud);
		assertEquals(longitud, contra.getLongitud());
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Hola.\nEst�s ac� para generar una contrase�a completamente segura");

		System.out.println("Ingrese cuantas contrase�as quiere");
		Integer cantidad = teclado.nextInt();

		System.out.println("Ingrese la longitud de las contrasena");
		Integer longitud = teclado.nextInt();

		Password password[] = new Password[cantidad];
		String contraFuerte[] = new String[cantidad];

		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(longitud);
			contraFuerte[i] = password[i].generarPassword();
			System.out.println(password[i].getContrasena() + password[i].esFuerte());

			/*
			 * hay un 70% de posibilidades de q tire contrase�a segura si la longitud es
			 * mayor a 8, mientras mas larga sea la longitud de la contrase�a mejor.
			 */

		}

	}
}
