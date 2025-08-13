package com.proyectoSabi.sabi.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Calificacion
@Entity
@Table(name = "calificaciones")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCalificacion;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idRutina")
    private Rutina rutina;

    private Integer calificacion;
    private LocalDate fechaCalificacion;

    @Column(length = 200)
    private String comentario;
}


