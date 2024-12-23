package com.krakedev.reservaciones.entidades;

public class Reservaciones {

	private int res_id;

	private Usuarios usu_id;

	private Rutas rut_id;

	public Reservaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservaciones(int res_id, Usuarios usu_id, Rutas rut_id) {
		super();
		this.res_id = res_id;
		this.usu_id = usu_id;
		this.rut_id = rut_id;
	}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public Usuarios getUsu_id() {
		return usu_id;
	}

	public void setUsu_id(Usuarios usu_id) {
		this.usu_id = usu_id;
	}

	public Rutas getRut_id() {
		return rut_id;
	}

	public void setRut_id(Rutas rut_id) {
		this.rut_id = rut_id;
	}

	@Override
	public String toString() {
		return "Reservaciones [res_id=" + res_id + ", usu_id=" + usu_id + ", rut_id=" + rut_id + "]";
	}

}
