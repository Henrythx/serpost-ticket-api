package com.tickek.infrastructure.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.PrioridadEntity;

@Repository

public interface PrioridadRepository extends JpaRepository<PrioridadEntity, Long> {
    Optional<PrioridadEntity> findByNombre(String nombre);
}

