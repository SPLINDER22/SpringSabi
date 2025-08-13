package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
