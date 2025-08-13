package com.proyectoSabi.sabi.Repository;

import com.proyectoSabi.sabi.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    List<Usuario> findByNombreContainingIgnoreCase(String nombre);

    List<Usuario> findByApellidoContainingIgnoreCase(String apellido);

    List<Usuario> findByEmailContainingIgnoreCase(String email);

    List<Usuario> findByTelefonoContainingIgnoreCase(String telefono);
}
