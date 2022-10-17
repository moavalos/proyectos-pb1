package Partido;

public class Partido {

	private EquipoDeFutbol local;
	private EquipoDeFutbol visitante;
	private Evento goles[];
	private Evento amontestados[];
	private Evento expulsados[];

	public Partido(EquipoDeFutbol local, EquipoDeFutbol visitante) {
		this.local = local;
		this.visitante = visitante;
		this.goles = new Evento[100];
		this.amontestados = new Evento[5];
		this.expulsados = new Evento[3];
	}

	/*
	 * Se debe marcar un nuevo Gol Dependiendo del autor (seg�n al equipo que
	 * pertenezca) y del tipo (si es a favor o en contra) se sabr� a quien
	 * contabilizarlo
	 */
	public void marcar(Evento gol) {
		Integer contador = 0;
		for (int i = 0; i < goles.length; i++) {
			if (goles[i].getTipo().equals(TipoDeEvento.GOL_A_FAVOR) && goles[i].getAutor().equals(getLocal())) {
				goles[i] = gol;
			} else if (goles[i].getTipo().equals(TipoDeEvento.GOL_EN_CONTRA)
					&& goles[i].getAutor().equals(getVisitante())) {
				goles[i] = gol;
			}

		}
	}

	/*
	 * Se registra un nuevo amonestado en el partido. Si el mismo ya pose�a una
	 * amonestaci�n previa, se lo debe expulsar. El m�todo devuelve la cantidad de
	 * amonestaciones del jugador. Los valores posibles de retorno son: 1 - Si no
	 * ten�a amonestaci�n previa o 2 - Si ya pose�a una amonestaci�n previa y
	 * termina siendo expulsado
	 * 
	 */
	public int amonestar(Evento amonestado) {
		int cantidadAmonestaciones = 0;
		for (int i = 0; i < amontestados.length; i++) {
			// if (amontestados[i].) {

		}
		return 0;

	}

	/*
	 * Se registra un nuevo expulsado en el partido.
	 */
	public void expulsar(Evento expulsado) {

	}

	/*
	 * Se cuentan la cantidad de goles por equipo (Se debe considerar si el gol
	 * result� a favor o en contra), y devuelve el equipo ganador (Si hubo un empate
	 * retorna null)
	 */
	public EquipoDeFutbol getGanador() {
		return null;
	}

	/*
	 * El m�todo toString debe describir el ESTADO del partido (Equipos que se
	 * enfrentan, los goles realizados, los amonestado y expulsados).
	 */
	public String toString() {
		String resultado = "";
		return resultado;
	}

	public EquipoDeFutbol getLocal() {
		return local;
	}

	public EquipoDeFutbol getVisitante() {
		return visitante;
	}
}
