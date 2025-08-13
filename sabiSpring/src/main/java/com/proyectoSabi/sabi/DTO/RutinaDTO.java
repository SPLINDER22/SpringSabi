package com.proyectoSabi.sabi.DTO;

// DTO Rutina
public class RutinaDTO {
    private Long idRutina;
    private String nombre;
    private NivelRutina nivel;
    private Long idAutor;
    private List<EjercicioRutinaDTO> ejercicios;

    // Getters y Setters
}

// Enums
public enum NivelRutina { PRINCIPIANTE, INTERMEDIO, AVANZADO }