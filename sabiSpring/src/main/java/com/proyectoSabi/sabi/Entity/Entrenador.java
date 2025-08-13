package com.proyectoSabi.sabi.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Entrenador
@Entity
@Table(name = "entrenadores")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntrenador;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @Column(length = 100)
    private String especialidad;

    private LocalDate finSuscripcion;
    private Integer xpAños;
    private Integer renovaciones;
}

