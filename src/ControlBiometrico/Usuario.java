package ControlBiometrico;

public class Usuario {

	private Integer numero;
	private String apellido;
	private TipoDeUsuario tipoDeEmpleado;
	private Double sueldo;

	public Usuario(Integer numero, String apellido, TipoDeUsuario tipoDeEmpleado, Double sueldo) {
		this.numero = numero;
		this.apellido = apellido;
		this.tipoDeEmpleado = tipoDeEmpleado;
		this.sueldo = sueldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoDeUsuario getTipoDeEmpleado() {
		return tipoDeEmpleado;
	}

	public void setTipoDeEmpleado(TipoDeUsuario tipoDeEmpleado) {
		this.tipoDeEmpleado = tipoDeEmpleado;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

}
