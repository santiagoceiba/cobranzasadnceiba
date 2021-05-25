package com.ceiba.core.repositorio.cliente;

import com.ceiba.core.modelo.cliente.Cliente;

public interface RepositorioCliente {
	
	/**
	 * Permite crear un cliente
	 * @param cliente
	 * @return el id generado
	 */
    Long crear(Cliente cliente);
    
    /**
	 * Permite actualizar un cliente
	 * @param cliente
	 */
    void actualizar(Cliente cliente);
    
    /**
     * Permite eliminar un cliente
     * @param id
     */
    void eliminar(Long idCliente);
    
    /**
     * Permite validar si existe un cliente con un nombre
     * @param nombre
     * @return si existe o no
     */
    boolean existe(String nombre);
    
    /**
     * Permite validar si existe un cliente con un nombre excluyendo un id
     * @param nombre
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long idCliente,String nombre);
}
