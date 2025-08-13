package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Ejercicio;

import java.util.List;
import java.util.Optional;

public interface EjercicioService {
    Ejercicio crearEjercicio(Ejercicio ejercicio);
    Ejercicio actualizarEjercicio(Ejercicio ejercicio);
    void eliminarEjercicio(Long id);
    Optional<Ejercicio> obtenerEjercicioPorId(Long id);
    List<Ejercicio> obtenerEjerciciosPorNombre(String nombre);
}
