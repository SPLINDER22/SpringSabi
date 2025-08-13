package com.proyectoSabi.sabi.Entity;

import com.proyectoSabi.sabi.DTO.EjercicioRutinaDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad EjercicioRutina
@Entity
@Table(name = "ejerciciosRutinas")
public class EjercicioRutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicioRutina;

    @ManyToOne
    @JoinColumn(name = "idEjercicio")
    private Ejercicio ejercicio;

    @ManyToOne
    @JoinColumn(name = "idRutina")
    private Rutina rutina;

    @Enumerated(EnumType.STRING)
    private EjercicioRutinaDTO.Semana semana;

    private Integer ordenEjercicio;
    private Integer series;
    private Integer repeticiones;
    private String pesoTiempo;

    @Enumerated(EnumType.STRING)
    private EjercicioRutinaDTO.Intensidad intensidad;
}



