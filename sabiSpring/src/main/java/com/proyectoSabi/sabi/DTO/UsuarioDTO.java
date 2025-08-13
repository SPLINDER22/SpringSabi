package com.proyectoSabi.sabi.DTO;

public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String ciudad;
    private EstadoUsuario estado;
    private RolUsuario rol;

    // Getters y Setters

    // Enums
    public enum TipoDocumento { CC, CE, PASAPORTE, TI }
    public enum EstadoUsuario { ACTIVO, INACTIVO, SUSPENDIDO }
    public enum RolUsuario { CLIENTE, ENTRENADOR, ADMIN }
}

