package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.DTO.NivelRutina;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Entity.Rutina;

import java.util.List;
import java.util.Optional;

public interface RutinaService {
    Rutina crearRutina(Rutina rutina);
    Rutina actualizarRutina(Rutina rutina);
    void eliminarRutina(Long id);
    Optional<Rutina> obtenerRutinaPorId(Long id);
    List<Rutina> obtenerRutinasPorNivel(NivelRutina nivel);
    List<Rutina> obtenerRutinasPorCliente(Cliente cliente);
    List<Rutina> obtenerRutinasPorEntrenador(Entrenador entrenador);
}