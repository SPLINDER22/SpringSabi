package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.EjercicioRutina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjercicioRutinaRepository extends JpaRepository<EjercicioRutina, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
