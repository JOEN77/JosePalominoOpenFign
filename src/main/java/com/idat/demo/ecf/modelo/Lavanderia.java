package com.idat.demo.ecf.modelo;

import java.util.List;

public class Lavanderia {
	
	private Integer idLavanderia;
	private String nombre;
	private List<Cliente> listarCliente;
	private List<Ropa> listarRopa;
	private List<Lavadora> listarLavadora;
	public Integer getIdLavanderia() {
		return idLavanderia;
	}
	public void setIdLavanderia(Integer idLavanderia) {
		this.idLavanderia = idLavanderia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Cliente> getListarCliente() {
		return listarCliente;
	}
	public void setListarCliente(List<Cliente> listarCliente) {
		this.listarCliente = listarCliente;
	}
	public List<Ropa> getListarRopa() {
		return listarRopa;
	}
	public void setListarRopa(List<Ropa> listarRopa) {
		this.listarRopa = listarRopa;
	}
	public List<Lavadora> getListarLavadora() {
		return listarLavadora;
	}
	public void setListarLavadora(List<Lavadora> listarLavadora) {
		this.listarLavadora = listarLavadora;
	}
	
	
	
	
	
}
