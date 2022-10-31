package ejerciciosBasicosTest;

import ejerciciosBasicos.Nota;

public class testNota {

	public static void main(String[] args) {
		
		Nota nota1 = new Nota(3);
		System.out.println(nota1.aprobar());
		
		Nota nota2 = new Nota(7);
		System.out.println(nota2.aprobar());
		
		Nota nota3 = new Nota(2);
		nota3.recuperar(8);
		System.out.println(nota3.aprobar());
		

	}
}
