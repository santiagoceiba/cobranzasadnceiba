package com.ceiba.core.repositorio.acuerdo;

import com.ceiba.core.modelo.acuerdo.AcuerdoPago;

public interface RepositorioAcuerdo {
	
	/**
	 * Permite crear un AcuerdoPago
	 * @param AcuerdoPago
	 * @return el id generado
	 */
    Long crear(AcuerdoPago AcuerdoPago);
    
    /**
	 * Permite actualizar un AcuerdoPago
	 * @param AcuerdoPago
	 */
    void actualizar(AcuerdoPago AcuerdoPago);
    
    /**
     * Permite eliminar un AcuerdoPago
     * @param idAcuerdoPago
     */
    void eliminar(Long idAcuerdoPago);
    
    /**
     * Permite validar si existe una AcuerdoPago con id
     * @param idAcuerdoPago
     * @return si existe o no
     */
    boolean existe(Long idAcuerdoPago );
    
}
