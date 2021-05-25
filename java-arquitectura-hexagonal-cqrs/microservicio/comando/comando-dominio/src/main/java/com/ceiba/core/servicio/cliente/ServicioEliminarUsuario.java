package com.ceiba.core.servicio.cliente;

import com.ceiba.core.repositorio.cliente.RepositorioCliente;

public class ServicioEliminarUsuario {

    private final RepositorioCliente repositorioCliente;

    public ServicioEliminarUsuario(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Long id) {
        this.repositorioCliente.eliminar(id);
    }
}
