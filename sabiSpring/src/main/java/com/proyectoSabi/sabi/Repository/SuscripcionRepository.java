package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuscripcionRepository extends JpaRepository<Suscripcion, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}

