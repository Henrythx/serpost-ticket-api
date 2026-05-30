package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.CategoriaEntity;

public interface CategoriaService {
    CategoriaEntity crearCategoria(CategoriaEntity categoria);
    
    CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoria);

    void eliminarCategoria(Long id);

    Optional<CategoriaEntity> obtenerCategoria(Long id);

    Optional<CategoriaEntity> buscarPorNombre(String nombre);

    List<CategoriaEntity> listarCategorias();

    List<CategoriaEntity> listarCategoriasActivas();
}

