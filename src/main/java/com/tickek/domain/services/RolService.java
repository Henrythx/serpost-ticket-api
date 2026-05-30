package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.RolEntity;

public interface RolService {
    RolEntity crearRol(RolEntity rol);

    RolEntity actualizarRol(Long id, RolEntity rol);

    void eliminarRol(Long id);

    Optional<RolEntity> obtenerRol(Long id);

    Optional<RolEntity> buscarPorNombre(String nombre);
    
    
    List<RolEntity> listarRoles();
}
