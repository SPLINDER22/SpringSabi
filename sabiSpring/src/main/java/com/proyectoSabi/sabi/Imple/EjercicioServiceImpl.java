package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.Entity.Ejercicio;
import com.proyectoSabi.sabi.Repository.EjercicioRepository;
import com.proyectoSabi.sabi.Service.EjercicioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EjercicioServiceImpl implements EjercicioService {
    private final EjercicioRepository ejercicioRepository;

    public EjercicioServiceImpl(EjercicioRepository ejercicioRepository) {
        this.ejercicioRepository = ejercicioRepository;
    }

    @Override
    public Ejercicio crearEjercicio(Ejercicio ejercicio) {
        return null;
    }

    @Override
    public Ejercicio actualizarEjercicio(Ejercicio ejercicio) {
        return null;
    }

    @Override
    public void eliminarEjercicio(Long id) {

    }

    @Override
    public Optional<Ejercicio> obtenerEjercicioPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Ejercicio> obtenerEjerciciosPorNombre(String nombre) {
        return List.of();
    }
}