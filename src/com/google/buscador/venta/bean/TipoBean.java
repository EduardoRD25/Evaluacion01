package com.google.buscador.venta.bean;

import lombok.Data;

@Data
public class TipoBean {

	private int idTipo;
	private String nombre;
	
	
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
