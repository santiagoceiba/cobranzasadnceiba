package com.ceiba.core.servicio.deuda;

import com.ceiba.core.repositorio.Deuda.RepositorioDeuda;

public class ServicioEliminarDeuda {

	private final RepositorioDeuda repositorioDeuda;

	public ServicioEliminarDeuda(RepositorioDeuda repositorioDeuda) {
		this.repositorioDeuda = repositorioDeuda;
	}

	public void ejecutar(Long id) {
		this.repositorioDeuda.eliminar(id);
	}
}
