package com.ceiba.core.servicio.cliente;

import com.ceiba.core.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.core.modelo.cliente.Cliente;
import com.ceiba.core.repositorio.cliente.RepositorioCliente;

public class ServicioCrearCliente {

    private static final String EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA = "El usuario ya existe en el sistema";
    
    private final RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public Long ejecutar(Cliente cliente) {
    	validarExistenciaPrevia(cliente);
        return this.repositorioCliente.crear(cliente);
    }

	private void validarExistenciaPrevia(Cliente cliente) {
		boolean existe = this.repositorioCliente.existe(cliente.getNombre());
    	if(existe) {
    		throw new ExcepcionDuplicidad(EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA);
    	}
	}
}
