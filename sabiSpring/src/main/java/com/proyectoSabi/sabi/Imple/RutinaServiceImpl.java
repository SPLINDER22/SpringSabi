package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.DTO.NivelRutina;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Entity.Rutina;
import com.proyectoSabi.sabi.Repository.RutinaRepository;
import com.proyectoSabi.sabi.Service.RutinaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RutinaServiceImpl implements RutinaService {
    private final RutinaRepository rutinaRepository;

    public RutinaServiceImpl(RutinaRepository rutinaRepository) {
        this.rutinaRepository = rutinaRepository;
    }

    @Override
    public Rutina crearRutina(Rutina rutina) {
        return rutinaRepository.save(rutina);
    }

    @Override
    public Rutina actualizarRutina(Rutina rutina) {
        return rutinaRepository.save(rutina);
    }

    @Override
    public void eliminarRutina(Long id) {
        rutinaRepository.deleteById(id);
    }

    @Override
    public Optional<Rutina> obtenerRutinaPorId(Long id) {
        return rutinaRepository.findById(id);
    }

    @Override
    public List<Rutina> obtenerRutinasPorNivel(NivelRutina nivel) {
        return List.of();
    }

    @Override
    public List<Rutina> obtenerRutinasPorCliente(Cliente cliente) {
        return List.of();
    }

    @Override
    public List<Rutina> obtenerRutinasPorEntrenador(Entrenador entrenador) {
        return List.of();
    }
}
