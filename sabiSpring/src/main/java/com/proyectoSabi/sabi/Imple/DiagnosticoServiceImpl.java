package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Diagnostico;
import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Repository.DiagnosticoRepository;
import com.proyectoSabi.sabi.Service.DiagnosticoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService {
    private final DiagnosticoRepository diagnosticoRepository;

    public DiagnosticoServiceImpl(DiagnosticoRepository diagnosticoRepository) {
        this.diagnosticoRepository = diagnosticoRepository;
    }


    @Override
    public Diagnostico crearDiagnostico(Diagnostico diagnostico) {
        return null;
    }

    @Override
    public Diagnostico actualizarDiagnostico(Diagnostico diagnostico) {
        return null;
    }

    @Override
    public void eliminarDiagnostico(Long id) {

    }

    @Override
    public Optional<Diagnostico> obtenerDiagnosticoPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Diagnostico> obtenerDiagnosticosPorCliente(Cliente cliente) {
        return List.of();
    }

    @Override
    public List<Diagnostico> obtenerDiagnosticosPorEntrenador(Entrenador entrenador) {
        return List.of();
    }
}
