package testAlarma;

import Alarma.Alarma;

public class testtt {

	public static void main(String[] args) {

		Alarma a = new Alarma(1234);

		a.encender(1234);
		System.out.println(a.activada());
	}
}
