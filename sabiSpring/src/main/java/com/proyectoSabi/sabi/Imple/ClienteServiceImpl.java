package com.proyectoSabi.sabi.Imple;


import com.proyectoSabi.sabi.DTO.ClienteDTO;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Repository.ClienteRepository;
import com.proyectoSabi.sabi.Service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> obtenerClientesPorEstadoSuscripcion(ClienteDTO.EstadoSuscripcion estadoSuscripcion) {
        return List.of();
    }

    @Override
    public List<Cliente> obtenerClientesPorEntrenador(Entrenador entrenador) {
        return List.of();
    }

}
