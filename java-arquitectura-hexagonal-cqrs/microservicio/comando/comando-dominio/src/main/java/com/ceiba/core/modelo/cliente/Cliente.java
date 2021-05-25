package com.ceiba.core.modelo.cliente;

import static com.ceiba.core.dominio.ValidadorArgumento.validarObligatorio;

import java.util.List;

import com.ceiba.core.modelo.deuda.Deuda;

public class Cliente {

	private static final String SE_DEBE_INGRESAR_LA_CEDULA = "Se debe ingresar la cedula del cliente";
	private static final String SE_DEBE_INGRESAR_DEUDA = "Se debe ingresar al menos una deuda para el cliente";
	private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_CLIENTE = "Se debe ingresar el nombre de cliente";

	private Long idCliente;
	private String nombre;
	private String cedula;
	private List<Deuda> listaDeudasCliente;

	public Cliente(Long idCliente, String nombre, String cedula, List<Deuda> listaDeudasCliente) {
		validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_CLIENTE);
		validarObligatorio(cedula, SE_DEBE_INGRESAR_LA_CEDULA);
		validarObligatorio(listaDeudasCliente, SE_DEBE_INGRESAR_DEUDA);
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.listaDeudasCliente = listaDeudasCliente;
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public List<Deuda> getListaDeudasCliente() {
		return listaDeudasCliente;
	}

	public void setListaDeudasCliente(List<Deuda> listaDeudasCliente) {
		this.listaDeudasCliente = listaDeudasCliente;
	}

}
