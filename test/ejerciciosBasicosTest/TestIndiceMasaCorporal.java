package ejerciciosBasicosTest;

import java.util.Scanner;

import ejerciciosBasicos.IndiceMasaCorporal;

public class TestIndiceMasaCorporal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al Indice de Masa Corporal Nacional.");
		
		System.out.println("Ingrese su peso");
		Double peso = teclado.nextDouble();
		
		System.out.println("Ingrese su estatura");
		Double estatura = teclado.nextDouble();
		
		IndiceMasaCorporal indice = new IndiceMasaCorporal(peso, estatura);
		
		System.out.println("Su imc es: " + indice.calcularImc() + ". Tenes " + indice.imc());

	}

}
