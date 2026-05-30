package com.tickek.infrastructure.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.TipoNotiEntity;

@Repository
public interface TipoNotiRepository extends JpaRepository<TipoNotiEntity, Long> {
    Optional<TipoNotiEntity> findByNombre(String nombre);
}

