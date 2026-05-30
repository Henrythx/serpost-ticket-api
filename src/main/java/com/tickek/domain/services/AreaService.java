package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.AreaEntity;

public interface AreaService {
    AreaEntity crearArea(AreaEntity area);

    AreaEntity actualizarArea(Long id, AreaEntity area);

    void eliminarArea(Long id);

    Optional<AreaEntity> obtenerArea(Long id);

    Optional<AreaEntity> buscarPorNombre(String nombre);

    List<AreaEntity> listarAreas();
    
    List<AreaEntity> listarAreasActivas();
}
