package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Entrenador;

import java.util.List;
import java.util.Optional;

public interface EntrenadorService {
    Entrenador crearEntrenador(Entrenador entrenador);
    Entrenador actualizarEntrenador(Entrenador entrenador);
    void eliminarEntrenador(Long id);
    Optional<Entrenador> obtenerEntrenadorPorId(Long id);
    List<Entrenador> obtenerEntrenadorePorDisponibilidad(boolean disponibilidad);
}