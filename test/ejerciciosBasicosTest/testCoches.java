package ejerciciosBasicosTest;

import ejerciciosBasicos.Coche;

public class testCoches {
	
	public static void main(String[] args) {

		Coche coche1 = new Coche("Fiat", "Palio", 700000.00);
		Coche coche2 = new Coche("Suzuki", "Vitara", 1000000.00);
		Coche coche3 = new Coche("Ford", "Fiesta", 500000.00);
		
		System.out.println(coche3.getCantidadCoches());
	}
}
