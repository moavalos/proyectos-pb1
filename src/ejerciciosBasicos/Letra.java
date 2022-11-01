package ejerciciosBasicos;

public class Letra {

	private char letra;

	public Letra(char letra) {
		this.letra = letra;
	}

	public boolean esVocal() {
		switch (letra) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Letra letra = new Letra('c');
		System.out.println(letra.esVocal());

	}

}
