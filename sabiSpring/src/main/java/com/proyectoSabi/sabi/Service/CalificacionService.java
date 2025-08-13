package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Calificacion;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;

import java.util.List;
import java.util.Optional;

public interface CalificacionService {
    Calificacion crearCalificacion(Calificacion calificacion);
    Calificacion actualizarCalificacion(Calificacion calificacion);
    void eliminarCalificacion(Long id);
    Optional<Calificacion> obtenerCalificacionPorId(Long id);
    List<Calificacion> obtenerCalificacionesPorCliente(Cliente cliente);
    List<Calificacion> obtenerCalificacionesPorEntrenador(Entrenador entrenador);
}