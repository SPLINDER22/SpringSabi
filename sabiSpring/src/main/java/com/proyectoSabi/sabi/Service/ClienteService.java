package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.DTO.ClienteDTO;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCliente(Long id);
    Optional<Cliente> obtenerClientePorId(Long id);
    List<Cliente> obtenerClientesPorEstadoSuscripcion(ClienteDTO.EstadoSuscripcion estadoSuscripcion);
    List<Cliente> obtenerClientesPorEntrenador(Entrenador entrenador);
}
