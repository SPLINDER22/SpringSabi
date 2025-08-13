package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
