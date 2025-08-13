package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Repository.EntrenadorRepository;
import com.proyectoSabi.sabi.Service.EntrenadorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {
    private final EntrenadorRepository entrenadorRepository;

    public EntrenadorServiceImpl(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    @Override
    public Entrenador crearEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @Override
    public Entrenador actualizarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @Override
    public void eliminarEntrenador(Long id) {
        entrenadorRepository.deleteById(id);
    }

    @Override
    public Optional<Entrenador> obtenerEntrenadorPorId(Long id) {
        return entrenadorRepository.findById(id);
    }

    @Override
    public List<Entrenador> obtenerEntrenadorePorDisponibilidad(boolean disponibilidad) {
        return List.of();
    }
}