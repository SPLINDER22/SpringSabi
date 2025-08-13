package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.DTO.ClienteDTO;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Suscripcion;

import java.util.List;
import java.util.Optional;

public interface SuscripcionService {
    Suscripcion crearSuscripcion(Suscripcion suscripcion);
    Suscripcion actualizarSuscripcion(Suscripcion suscripcion);
    void eliminarSuscripcion(Long id);
    Optional<Suscripcion> obtenerSuscripcionPorId(Long id);
    List<Suscripcion> obtenerSuscripcionesPorCliente(Cliente cliente);
    List<Suscripcion> obtenerSuscripcionesPorEstado(ClienteDTO.EstadoSuscripcion estado);
}