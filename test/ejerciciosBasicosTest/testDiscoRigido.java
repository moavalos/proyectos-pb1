package ejerciciosBasicosTest;

import ejerciciosBasicos.DiscoRigido;

public class testDiscoRigido {

	public static void main(String[] args) {
		
		DiscoRigido seagate = new DiscoRigido(10);
		DiscoRigido hitachi = new DiscoRigido(20);
		DiscoRigido westernDigital = new DiscoRigido(32);
		DiscoRigido toshiba = new DiscoRigido(48);

		System.out.println("Un disco rigido Seagate de 10 TB equivalen a " + seagate.calcularBlueRays() + " blue rays");
		System.out.println("Un disco rigido Seagate de 10 TB equivalen a " + seagate.calcularDvds() + " Dvds");

		System.out.println("Un disco rigido Hitachi de 20 TB equivalen a " + hitachi.calcularBlueRays() + " blue rays");
		System.out.println("Un disco rigido Hitachi de 20 TB equivalen a " + hitachi.calcularDvds() + " Dvds");

		System.out.println("Un disco rigido Western Digital de 30 TB equivalen a " + westernDigital.calcularBlueRays()
				+ " blue rays");
		System.out.println(
				"Un disco rigido Western Digital de 30 TB equivalen a " + westernDigital.calcularDvds() + " Dvds");

		System.out.println("Un disco rigido Toshiba de 48 TB equivalen a " + toshiba.calcularBlueRays() + " blue rays");
		System.out.println("Un disco rigido Toshiba de 48 TB equivalen a " + toshiba.calcularDvds() + " Dvds");
	}
}
