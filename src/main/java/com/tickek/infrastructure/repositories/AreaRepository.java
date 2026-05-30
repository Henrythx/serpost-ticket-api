
package com.tickek.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.AreaEntity;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Long> {
    Optional<AreaEntity> findByNombre(String nombre);
    List<AreaEntity> findByActivo(boolean activo);
}

