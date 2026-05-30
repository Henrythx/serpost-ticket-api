package com.tickek.infrastructure.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.EstadoEntity;

@Repository
public interface EstadoRepository extends JpaRepository
<EstadoEntity, Long> {
    Optional<EstadoEntity> findByNombre(String nombre);
}

