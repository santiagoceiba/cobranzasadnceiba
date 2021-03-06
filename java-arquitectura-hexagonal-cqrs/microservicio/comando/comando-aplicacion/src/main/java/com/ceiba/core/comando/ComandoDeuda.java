package com.ceiba.core.comando;

import java.time.LocalDate;

import com.ceiba.core.modelo.cliente.Cliente;

public class ComandoDeuda {
	
	
	private Long idDeuda;
	private Double monto;
	private LocalDate fechaInicialDeudaCliente;
	private String nombreEntidadDeuda;
	private String conceptoDeuda;
	private Cliente idCliente;
	
	
	public Long getIdDeuda() {
		return idDeuda;
	}
	public void setIdDeuda(Long idDeuda) {
		this.idDeuda = idDeuda;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public LocalDate getFechaInicialDeudaCliente() {
		return fechaInicialDeudaCliente;
	}
	public void setFechaInicialDeudaCliente(LocalDate fechaInicialDeudaCliente) {
		this.fechaInicialDeudaCliente = fechaInicialDeudaCliente;
	}
	public String getNombreEntidadDeuda() {
		return nombreEntidadDeuda;
	}
	public void setNombreEntidadDeuda(String nombreEntidadDeuda) {
		this.nombreEntidadDeuda = nombreEntidadDeuda;
	}
	public String getConceptoDeuda() {
		return conceptoDeuda;
	}
	public void setConceptoDeuda(String conceptoDeuda) {
		this.conceptoDeuda = conceptoDeuda;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	public ComandoDeuda(Long idDeuda, Double monto, LocalDate fechaInicialDeudaCliente, String nombreEntidadDeuda,
			String conceptoDeuda, Cliente idCliente) {
		super();
		this.idDeuda = idDeuda;
		this.monto = monto;
		this.fechaInicialDeudaCliente = fechaInicialDeudaCliente;
		this.nombreEntidadDeuda = nombreEntidadDeuda;
		this.conceptoDeuda = conceptoDeuda;
		this.idCliente = idCliente;
	}
	
	
	
}
