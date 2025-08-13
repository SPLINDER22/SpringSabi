package com.proyectoSabi.sabi.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Diagnostico
@Entity
@Table(name = "diagnosticos")
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    private Double imc;
    private LocalDate fechaDiagnostico;
    private String frecuenciaDiagnostico;
    private LocalDate proxDiagnostico;
}
