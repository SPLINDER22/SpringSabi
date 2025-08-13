package com.proyectoSabi.sabi.Entity;

import com.proyectoSabi.sabi.DTO.ClienteDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Cliente
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private ClienteDTO.Genero genero;

    private Integer edad;
    private Double estatura;
    private Double peso;

    @Enumerated(EnumType.STRING)
    private ClienteDTO.EstadoSuscripcion estadoSuscripcion;

    @Column(length = 500)
    private String biografia;

    private Double promCalificacion;
}



