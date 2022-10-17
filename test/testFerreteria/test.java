package testFerreteria;

import ferreteria.Destornillador;
import ferreteria.Tarugo;
import ferreteria.TipoDeCabeza;
import ferreteria.Tornillo;

public class test {

	public static void main(String[] args) {

		Destornillador philiips = new Destornillador(TipoDeCabeza.PHILLIPS);
		Destornillador plano = new Destornillador(TipoDeCabeza.PLANO);
		Destornillador allen = new Destornillador(TipoDeCabeza.ALLEN);

		Tornillo phillips1 = new Tornillo(TipoDeCabeza.PHILLIPS, 6, 4);
		Tornillo phillips2 = new Tornillo(TipoDeCabeza.PHILLIPS, 10, 8);
		Tornillo plano1 = new Tornillo(TipoDeCabeza.PLANO, 6, 4);
		Tornillo plano2 = new Tornillo(TipoDeCabeza.PLANO, 4, 2);

		Tarugo generico1 = new Tarugo(10);
		Tarugo generico2 = new Tarugo(5);
	}
}
