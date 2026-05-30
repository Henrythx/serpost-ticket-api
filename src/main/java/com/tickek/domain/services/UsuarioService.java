package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.dto.usuario.UsuarioCreateDto;
import com.tickek.domain.model.UsuarioEntity;

public interface UsuarioService {
    UsuarioEntity crearUsuario(UsuarioCreateDto dto);

    // UsuarioEntity actualizarUsuario(Long id, UsuarioEntity usuario);

    // void eliminarUsuario(Long id);

    // Optional<UsuarioEntity> obtenerUsuario(Long id);

    // Optional<UsuarioEntity> buscarPorEmail(String email);

    // List<UsuarioEntity> listarUsuarios();

    // List<UsuarioEntity> listarPorArea(Long areaId);

    // List<UsuarioEntity> listarPorRol(Long rolId);

    // void activarUsuario(Long id);
    
    // void desactivarUsuario(Long id);
}

