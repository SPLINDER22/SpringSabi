package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Diagnostico;
import com.proyectoSabi.sabi.Entity.Entrenador;

import java.util.List;
import java.util.Optional;

public interface DiagnosticoService {
    Diagnostico crearDiagnostico(Diagnostico diagnostico);
    Diagnostico actualizarDiagnostico(Diagnostico diagnostico);
    void eliminarDiagnostico(Long id);
    Optional<Diagnostico> obtenerDiagnosticoPorId(Long id);
    List<Diagnostico> obtenerDiagnosticosPorCliente(Cliente cliente);
    List<Diagnostico> obtenerDiagnosticosPorEntrenador(Entrenador entrenador);
}