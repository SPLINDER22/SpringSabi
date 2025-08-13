package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.DTO.ClienteDTO;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Suscripcion;
import com.proyectoSabi.sabi.Repository.SuscripcionRepository;
import com.proyectoSabi.sabi.Service.SuscripcionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuscripcionServiceImpl implements SuscripcionService {
    private final SuscripcionRepository suscripcionRepository;

    public SuscripcionServiceImpl(SuscripcionRepository suscripcionRepository) {
        this.suscripcionRepository = suscripcionRepository;
    }

    @Override
    public Suscripcion crearSuscripcion(Suscripcion suscripcion) {
        return null;
    }

    @Override
    public Suscripcion actualizarSuscripcion(Suscripcion suscripcion) {
        return null;
    }

    @Override
    public void eliminarSuscripcion(Long id) {

    }

    @Override
    public Optional<Suscripcion> obtenerSuscripcionPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Suscripcion> obtenerSuscripcionesPorCliente(Cliente cliente) {
        return List.of();
    }

    @Override
    public List<Suscripcion> obtenerSuscripcionesPorEstado(ClienteDTO.EstadoSuscripcion estado) {
        return List.of();
    }
}