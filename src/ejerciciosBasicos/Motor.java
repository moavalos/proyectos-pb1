package ejerciciosBasicos;

public class Motor {

	private int tipoBomba;
	private String tipoFluido;
	private String combustible;

	public Motor(int tipoBomba, String tipoFluido, String combustible) {
		this.tipoBomba = tipoBomba;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}
	
	public void dimeTipoDeMotor() {
		switch(tipoBomba) {
		case 0:
			System.out.println("No hay establecido un valor definido para el tipo de bomba");
			break;
		case 1:
			System.out.println("La bomba es una bomba de agua");
			break;
		case 2:
			System.out.println("La bomba es una bomba de gasolina");
			break;
		case 3:
			System.out.println("La bomba es una bomba de hormigon");
			break;
		case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia");
			break;
		default:
			System.out.println("no hay bue");
			break;
		}
	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

}
