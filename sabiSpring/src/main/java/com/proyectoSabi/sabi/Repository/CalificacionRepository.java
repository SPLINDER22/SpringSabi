package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
