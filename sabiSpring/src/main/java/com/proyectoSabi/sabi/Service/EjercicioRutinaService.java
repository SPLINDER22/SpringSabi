package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Ejercicio;
import com.proyectoSabi.sabi.Entity.EjercicioRutina;
import com.proyectoSabi.sabi.Entity.Rutina;

import java.util.List;
import java.util.Optional;

public interface EjercicioRutinaService {
    EjercicioRutina crearEjercicioRutina(EjercicioRutina ejercicioRutina);
    EjercicioRutina actualizarEjercicioRutina(EjercicioRutina ejercicioRutina);
    void eliminarEjercicioRutina(Long id);
    Optional<EjercicioRutina> obtenerEjercicioRutinaPorId(Long id);
    List<EjercicioRutina> obtenerEjerciciosRutinasPorRutina(Rutina rutina);
    List<EjercicioRutina> obtenerEjerciciosRutinasPorEjercicio(Ejercicio ejercicio);
}