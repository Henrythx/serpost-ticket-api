package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.TipoNotiEntity;


public interface TipoNotiService {
    TipoNotiEntity crearTipo(TipoNotiEntity tipo);

    TipoNotiEntity actualizarTipo(Long id, TipoNotiEntity tipo);

    void eliminarTipo(Long id);

    Optional<TipoNotiEntity> obtenerTipo(Long id);

    Optional<TipoNotiEntity> buscarPorNombre(String nombre);
    
    List<TipoNotiEntity> listarTipos();
}

