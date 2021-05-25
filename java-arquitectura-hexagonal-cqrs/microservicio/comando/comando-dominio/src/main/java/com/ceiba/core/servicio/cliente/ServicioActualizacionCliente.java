package com.ceiba.core.servicio.cliente;

import com.ceiba.core.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.core.modelo.cliente.Cliente;
import com.ceiba.core.repositorio.cliente.RepositorioCliente;

public class ServicioActualizacionCliente {
	
	
    private static final String EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA = "El cliente ya existe en el sistema";
    
	private final RepositorioCliente repositorioCliente;

    public ServicioActualizacionCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente) {
    	validarExistenciaPrevia(cliente);
        this.repositorioCliente.actualizar(cliente);
    }

	private void validarExistenciaPrevia(Cliente cliente) {
		boolean existe = this.repositorioCliente.existeExcluyendoId(cliente.getIdCliente(),cliente.getNombre());
    	if(existe) {
    		throw new ExcepcionDuplicidad(EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA);
    	}
	}
}
