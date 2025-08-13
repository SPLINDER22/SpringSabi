package com.proyectoSabi.sabi.Entity;

import com.proyectoSabi.sabi.DTO.UsuarioDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

// Entidad Usuario
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nomUsuario", length = 20)
    private String nombre;

    @Column(name = "apeUsuario", length = 20)
    private String apellido;

    @Column(name = "emaUsuario", length = 40)
    private String email;

    @Column(name = "passUsuario", length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    private UsuarioDTO.TipoDocumento tipDocumento;

    @Column(name = "numDocumento")
    private String numeroDocumento;

    @Column(name = "ciudadUsuario", length = 20)
    private String ciudad;

    @Enumerated(EnumType.STRING)
    private UsuarioDTO.EstadoUsuario estadoUsuario;

    @Enumerated(EnumType.STRING)
    private UsuarioDTO.RolUsuario rolUsuario;
}

// DTO Usuario
