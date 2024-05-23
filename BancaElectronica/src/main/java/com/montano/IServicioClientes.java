package com.montano;

public interface IServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultarCliente(int numero);
    Cliente[] obtenerClientes();
    Cliente buscarClientePorRFC(String rfc);
}
