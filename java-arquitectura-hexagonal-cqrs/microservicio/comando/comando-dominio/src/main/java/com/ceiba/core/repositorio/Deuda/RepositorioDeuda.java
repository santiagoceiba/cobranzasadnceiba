package com.ceiba.core.repositorio.Deuda;

import com.ceiba.core.modelo.deuda.Deuda;

public interface RepositorioDeuda {

	/**
	 * Permite crear un deuda
	 * @param deuda
	 * @return el id generado
	 */
    Long crear(Deuda deuda);
    
    /**
	 * Permite actualizar un deuda
	 * @param deuda
	 */
    void actualizar(Deuda deuda);
    
    /**
     * Permite eliminar un deuda
     * @param idDeuda
     */
    void eliminar(Long idDeuda);
    
    /**
     * Permite validar si existe una deuda con id
     * @param idDeuda
     * @return si existe o no
     */
    boolean existe(Long idDeuda );
    
}
