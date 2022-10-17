package ejercicios;

public class IndiceMasaCorporal {

	private Double peso; // kilogramos
	private Double estatura; // metros

	public IndiceMasaCorporal(Double peso, Double estatura) {
		this.peso = peso;
		this.estatura = estatura;
	}

	public Double calcularImc() {
		return (double) Math.round(this.peso / Math.pow(this.estatura, 2));
	}

	public String imc() {
		if (calcularImc() < 16) {
			return "Delgadez severa";
		} else if (calcularImc() >= 16 && calcularImc() < 17) {
			return "Delgadez moderada";
		} else if (calcularImc() > 17 && calcularImc() <= 18.5) {
			return "Delgadez leve";
		} else if (calcularImc() > 18.5 && calcularImc() <= 25) {
			return "Peso normal";
		} else if (calcularImc() > 25 && calcularImc() <= 30) {
			return "Sobrepeso";
		} else if (calcularImc() > 30 && calcularImc() <= 35) {
			return "Obesidad leve";
		} else if (calcularImc() > 35 && calcularImc() <= 40) {
			return "Obesidad moderada";
		} else if (calcularImc() >= 40) {
			return "Obesidad mórbida";
		} else {
			return "error";
		}

	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

}
