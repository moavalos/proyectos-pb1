package ferreteria;

public class Tornillo {

	private final TipoDeCabeza TIPO_DE_CABEZA;
	private final Integer LONGITUD;
	private final Integer CANTIDAD_DE_ROSCA;
	private Integer posicionActual;

	private final char SENTIDO_HORARIO = 'H';
	private final char SENTIDO_ANTIHORARIO = 'A';

	public Tornillo(TipoDeCabeza tipoDeCabeza, int longitud, int cantidadDeRosca) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRosca;
		this.posicionActual = 0;
	}

	public boolean girar(char sentido) {
		boolean sePudoGirar = false;
		switch (sentido) {
		case SENTIDO_HORARIO:
			if (posicionActual < CANTIDAD_DE_ROSCA) {
				posicionActual++;
				sePudoGirar = true;
			} else {
				sePudoGirar = false;
			}
			break;
		case SENTIDO_ANTIHORARIO:
			if (posicionActual > 0) {
				posicionActual--;
				sePudoGirar = true;
			} else {
				sePudoGirar = false;
			}
			break;
		default:
			sePudoGirar = false;
		}

		return sePudoGirar;
	}

	public TipoDeCabeza getTIPO_DE_CABEZA() {
		return TIPO_DE_CABEZA;
	}

	public Integer getLONGITUD() {
		return LONGITUD;
	}

	public Integer getCANTIDAD_DE_ROSCA() {
		return CANTIDAD_DE_ROSCA;
	}
}
