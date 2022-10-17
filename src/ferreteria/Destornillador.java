package ferreteria;

public class Destornillador {

	private final TipoDeCabeza TIPO_DE_CABEZA;
	private final char SENTIDO_HORARIO = 'H';
	private final char SENTIDO_ANTIHORARIO = 'A';

	public Destornillador(TipoDeCabeza tipoDeCabeza) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	}

	public void desatornillar(Tornillo tornillo) {
		boolean ok = true;
		if (tornillo.getTIPO_DE_CABEZA() == TIPO_DE_CABEZA)
			while (ok) {
				ok = tornillo.girar(SENTIDO_ANTIHORARIO);
			}
	}

	public void atornillar(Tornillo tornillo) {
		boolean ok = true;
		if (tornillo.getTIPO_DE_CABEZA() == TIPO_DE_CABEZA)
			while (ok) {
				ok = tornillo.girar(SENTIDO_HORARIO);
			}
	}

	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
		boolean ok = true;
		if ((tornillo.getTIPO_DE_CABEZA() == TIPO_DE_CABEZA) && (tornillo.getLONGITUD() <= tarugo.getLONGITUD()))
			while (ok) {
				ok = tornillo.girar(SENTIDO_ANTIHORARIO);
			}
	}

	public void atornillar(Tornillo tornillo, Tarugo tarugo) {
		boolean ok = true;
		if (tornillo.getTIPO_DE_CABEZA() == TIPO_DE_CABEZA && tornillo.getLONGITUD() <= tarugo.getLONGITUD())
			while (ok) {
				ok = tornillo.girar(SENTIDO_HORARIO);
			}
	}

}
