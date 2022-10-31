package ejerciciosBasicos;

import java.util.Scanner;

public class Punto {

	private Integer x;
	private Integer y;

	public Punto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Boolean ubicacionX() {
		return this.getX() == 0;
	}

	public Boolean ubicacionY() {
		return this.getY() == 0;
	}

	public Boolean ubicacionOrigenCoordenadas() {
		// (0,0)
		if (getX() == 0 && getY() == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el punto en el eje x");
		Integer x = teclado.nextInt();
		
		System.out.println("Ingrese el punto en el eje y");
		Integer y = teclado.nextInt();
		
		Punto punto = new Punto(x, y);
		
		System.out.println();

	}
}