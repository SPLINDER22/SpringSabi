package com.proyectoSabi.sabi.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Ejercicio
@Entity
@Table(name = "ejercicios")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;

    @Column(name = "nomEjercicio", length = 200)
    private String nombre;

    @Column(name = "descEjercicio", length = 100)
    private String descripcion;

    private String tipoEjercicio;
    private String autorEjercicio;

    @Column(length = 255)
    private String urlVideo;
}

