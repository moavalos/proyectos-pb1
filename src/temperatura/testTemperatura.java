package temperatura;
public class testTemperatura {

public class TestTemperatura {

	public static void main(String[] args) {
		double temperturaArgentina = 11.0; // Utiliza la unidad de medida Celsius
		double temperturaEEUU = 56.0; // Utiliza la unidad de medida Farenheit
		
		Temperatura termometro = new Temperatura(0);

		// Argentina
		System.out.println("Argentina");
		//unidadDeseada = Temperatura.CELSIUS;
		termometro.setValor(temperturaArgentina);
		System.out.println("La temperatura argentina es de " + termometro.getValor() + " grados cent�grados");
		System.out.println("La temperatura argentina es de " + termometro.convertir(termometro.FARENHEIT) + " grados farenheit");
		System.out.println("La temperatura absoluta en argentina es de " + termometro.convertir((byte) termometro.KELVIN) + " grados kelvin");		

		// EEUU
		System.out.println("\nEEUU");
		termometro.setValor(temperturaEEUU, termometro.FARENHEIT);
		System.out.println("La temperatura EEUU es de " + termometro.convertir(termometro.FARENHEIT) + " grados farenheit");
		System.out.println("La temperatura absoluta en EEUU es de " + termometro.convertir((byte) termometro.KELVIN) + " grados kelvin");		

		// Temperaturas inv�lidas
		System.out.println("Intentamos guarda -300� C");
		temperturaArgentina = -300.0;
		termometro.setValor(temperturaArgentina);
		System.out.println("La temperatura argentina es de " + termometro.getValor() + " grados cent�grados");
		termometro.setValor(-5);
		System.out.println("La temperatura argentina es de " + termometro.getValor() + " grados cent�grados");

	}

}
