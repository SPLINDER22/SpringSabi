package com.proyectoSabi.sabi.DTO;

// DTO Cliente
public class ClienteDTO {
    private Long idCliente;
    private UsuarioDTO usuario;
    private Genero genero;
    private Integer edad;
    private Double estatura;
    private Double peso;
    private EstadoSuscripcion estadoSuscripcion;
    private String biografia;
    private Double promedioCalificacion;

    // Getters y Setters

    // Enums
    public enum Genero { MASCULINO, FEMENINO, OTRO }
    public enum EstadoSuscripcion { ACTIVA, INACTIVA, VENCIDA }
}