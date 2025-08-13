package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
