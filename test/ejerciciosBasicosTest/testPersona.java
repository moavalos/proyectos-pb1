package ejerciciosBasicosTest;

import ejerciciosBasicos.Persona;

public class testPersona {

	public static void main(String[] args) {

		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
		
		System.out.println(sofia);
		System.out.println("El peso de sofia es: " + sofia.pesar() + " y mide: " + sofia.medir());
		
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumplirAños();
		
		System.out.println("El nuevo peso de sofia es: " + sofia.pesar() + ", ahora mide: " + sofia.medir() + " y tiene: " + sofia.getEdad());

	}

}
