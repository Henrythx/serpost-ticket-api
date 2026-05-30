package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.PrioridadEntity;

public interface PrioridadService {
    PrioridadEntity crearPrioridad(PrioridadEntity prioridad);

    PrioridadEntity actualizarPrioridad(Long id, PrioridadEntity prioridad);

    void eliminarPrioridad(Long id);

    Optional<PrioridadEntity> obtenerPrioridad(Long id);

    Optional<PrioridadEntity> buscarPorNombre(String nombre);
    
    List<PrioridadEntity> listarPrioridades();
}
