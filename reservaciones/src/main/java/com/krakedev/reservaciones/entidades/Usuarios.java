package com.krakedev.reservaciones.entidades;

public class Usuarios {

	private String usu_cedula;
	private String usu_correo;
	private String usu_nombre;

	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuarios(String usu_cedula, String usu_correo, String usu_nombre) {
		super();
		this.usu_cedula = usu_cedula;
		this.usu_correo = usu_correo;
		this.usu_nombre = usu_nombre;
	}

	public String getUsu_cedula() {
		return usu_cedula;
	}

	public void setUsu_cedula(String usu_cedula) {
		this.usu_cedula = usu_cedula;
	}

	public String getUsu_correo() {
		return usu_correo;
	}

	public void setUsu_correo(String usu_correo) {
		this.usu_correo = usu_correo;
	}

	public String getUsu_nombre() {
		return usu_nombre;
	}

	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}

	@Override
	public String toString() {
		return "Usuarios [usu_cedula=" + usu_cedula + ", usu_correo=" + usu_correo + ", usu_nombre=" + usu_nombre + "]";
	}

}
