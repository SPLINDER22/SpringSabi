package com.proyectoSabi.sabi.DTO;


// DTO Suscripcion
public class SuscripcionDTO {
    private Long idSuscripcion;
    private Long idCliente;
    private LocalDate inicio;
    private Double valor;
    private EstadoPago estadoPago;

    // Getters y Setters

    // Enums
    public enum EstadoPago { PENDIENTE, COMPLETADO, RECHAZADO, REEMBOLSADO }

}
