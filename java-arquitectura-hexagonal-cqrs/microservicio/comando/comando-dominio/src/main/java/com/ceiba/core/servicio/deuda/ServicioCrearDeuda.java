package com.ceiba.core.servicio.deuda;

import com.ceiba.core.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.core.modelo.deuda.Deuda;
import com.ceiba.core.repositorio.Deuda.RepositorioDeuda;

public class ServicioCrearDeuda {

    private static final String EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA = "El usuario ya existe en el sistema";
    
    private final  RepositorioDeuda repositorioDeuda;

    public ServicioCrearDeuda( RepositorioDeuda repositorioDeuda) {
        this.repositorioDeuda = repositorioDeuda;
    }

    public Long ejecutar(Deuda deuda) {
    	validarExistenciaPrevia(deuda);
        return this.repositorioDeuda.crear(deuda);
    }

	private void validarExistenciaPrevia(Deuda deuda) {
		boolean existe = this.repositorioDeuda.existe(deuda.getIdDeuda());
    	if(existe) {
    		throw new ExcepcionDuplicidad(EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA);
    	}
	}
}
