package com.proyectoSabi.sabi.Service;

import com.proyectoSabi.sabi.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
    Optional<Usuario> obtenerUsuarioPorId(Long id);
    Optional<Usuario> obtenerUsuarioPorEmail(String email);
}