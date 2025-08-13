package com.proyectoSabi.sabi.Imple;

import com.proyectoSabi.sabi.Entity.Ejercicio;
import com.proyectoSabi.sabi.Entity.EjercicioRutina;
import com.proyectoSabi.sabi.Entity.Rutina;
import com.proyectoSabi.sabi.Repository.EjercicioRutinaRepository;
import com.proyectoSabi.sabi.Service.EjercicioRutinaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EjercicioRutinaServiceImpl implements EjercicioRutinaService {
    private final EjercicioRutinaRepository ejercicioRutinaRepository;

    public EjercicioRutinaServiceImpl(EjercicioRutinaRepository ejercicioRutinaRepository) {
        this.ejercicioRutinaRepository = ejercicioRutinaRepository;
    }

    @Override
    public EjercicioRutina crearEjercicioRutina(EjercicioRutina ejercicioRutina) {
        return null;
    }

    @Override
    public EjercicioRutina actualizarEjercicioRutina(EjercicioRutina ejercicioRutina) {
        return null;
    }

    @Override
    public void eliminarEjercicioRutina(Long id) {

    }

    @Override
    public Optional<EjercicioRutina> obtenerEjercicioRutinaPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<EjercicioRutina> obtenerEjerciciosRutinasPorRutina(Rutina rutina) {
        return List.of();
    }

    @Override
    public List<EjercicioRutina> obtenerEjerciciosRutinasPorEjercicio(Ejercicio ejercicio) {
        return List.of();
    }
}