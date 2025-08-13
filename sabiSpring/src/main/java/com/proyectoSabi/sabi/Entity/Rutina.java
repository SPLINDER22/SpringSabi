package com.proyectoSabi.sabi.Entity;

import com.proyectoSabi.sabi.DTO.NivelRutina;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Entidad Rutina
@Entity
@Table(name = "rutinas")
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRutina;

    @Column(name = "nomRutina", length = 50)
    private String nombre;

    @Enumerated(EnumType.STRING)
    private NivelRutina nivel;

    @ManyToOne
    @JoinColumn(name = "autorRutina")
    private Entrenador autor;

    @OneToMany(mappedBy = "rutina", cascade = CascadeType.ALL)
    private List<EjercicioRutina> ejercicios = new ArrayList<>();

    @OneToMany(mappedBy = "rutina")
    private List<Calificacion> calificaciones = new ArrayList<>();
}

