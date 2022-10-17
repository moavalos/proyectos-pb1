package ejerciciosTest;

import java.util.Scanner;

import ejercicios.EcuacionCuadratica;

public class TestEcuacionCuadratica {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("holap. ingrese el valor de a, b y c en ese orden para calcular las raices");
		
		Integer a = teclado.nextInt();
		Integer b = teclado.nextInt();
		Integer c = teclado.nextInt();
		EcuacionCuadratica nueva = new EcuacionCuadratica(a, b, c);
		
		System.out.println(nueva.toString());
		System.out.println(" ");
		System.out.println("Siendo el resultado del discriminante " + nueva.getDiscriminante());
		System.out.println("Las raices son " + nueva.calcularRaiz1() + " y " + nueva.calcularRaiz2());
		

	}

}
