package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.EstadoEntity;

public interface EstadoService {
    EstadoEntity crearEstado(EstadoEntity estado);

    EstadoEntity actualizarEstado(Long id, EstadoEntity estado);

    void eliminarEstado(Long id);

    Optional<EstadoEntity> obtenerEstado(Long id);

    Optional<EstadoEntity> buscarPorNombre(String nombre);
    
    List<EstadoEntity> listarEstados();
}

