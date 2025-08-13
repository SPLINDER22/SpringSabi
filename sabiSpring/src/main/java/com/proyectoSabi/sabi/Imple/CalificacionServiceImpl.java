package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.Entity.Calificacion;
import com.proyectoSabi.sabi.Entity.Cliente;
import com.proyectoSabi.sabi.Entity.Entrenador;
import com.proyectoSabi.sabi.Repository.CalificacionRepository;
import com.proyectoSabi.sabi.Service.CalificacionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionServiceImpl implements CalificacionService {
    private final CalificacionRepository calificacionRepository;

    public CalificacionServiceImpl(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    @Override
    public Calificacion crearCalificacion(Calificacion calificacion) {
        return null;
    }

    @Override
    public Calificacion actualizarCalificacion(Calificacion calificacion) {
        return null;
    }

    @Override
    public void eliminarCalificacion(Long id) {

    }

    @Override
    public Optional<Calificacion> obtenerCalificacionPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Calificacion> obtenerCalificacionesPorCliente(Cliente cliente) {
        return List.of();
    }

    @Override
    public List<Calificacion> obtenerCalificacionesPorEntrenador(Entrenador entrenador) {
        return List.of();
    }
}