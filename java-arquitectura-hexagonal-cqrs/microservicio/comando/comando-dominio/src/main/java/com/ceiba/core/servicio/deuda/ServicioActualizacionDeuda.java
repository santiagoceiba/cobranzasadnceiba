package com.ceiba.core.servicio.deuda;

import com.ceiba.core.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.core.modelo.deuda.Deuda;
import com.ceiba.core.repositorio.Deuda.RepositorioDeuda;

public class ServicioActualizacionDeuda {
	
	
    private static final String EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA = "El cliente ya existe en el sistema";
    
	private final RepositorioDeuda repositorioDeuda;

    public ServicioActualizacionDeuda(RepositorioDeuda repositorioDeuda) {
        this.repositorioDeuda = repositorioDeuda;
    }

    public void ejecutar(Deuda deuda) {
    	validarExistenciaPrevia(deuda);
        this.repositorioDeuda.actualizar(deuda);
    }

	private void validarExistenciaPrevia(Deuda deuda) {
		boolean existe = this.repositorioDeuda.existe(deuda.getIdDeuda());
    	if(existe) {
    		throw new ExcepcionDuplicidad(EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA);
    	}
	}
}
