package com.proyectoSabi.sabi.DTO;

// DTO EjercicioRutina
public class EjercicioRutinaDTO {
    private Long idEjercicioRutina;
    private Long idEjercicio;
    private Long idRutina;
    private Semana semana;
    private Integer orden;
    private Integer series;
    private Integer repeticiones;
    private String pesoTiempo;
    private Intensidad intensidad;

    // Getters y Setters

    // Enums
    public enum Semana { SEMANA1, SEMANA2, SEMANA3, SEMANA4 }
    public enum Intensidad { BAJA, MEDIA, ALTA }

}