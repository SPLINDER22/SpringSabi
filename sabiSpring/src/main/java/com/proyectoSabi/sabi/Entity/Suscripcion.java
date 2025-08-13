package com.proyectoSabi.sabi.Entity;

import com.proyectoSabi.sabi.DTO.SuscripcionDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Suscripcion
@Entity
@Table(name = "suscripciones")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSuscripcion;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    private LocalDate inicioSuscripcion;
    private Double valorSuscripcion;

    @Enumerated(EnumType.STRING)
    private SuscripcionDTO.EstadoPago estadoPago;
}

