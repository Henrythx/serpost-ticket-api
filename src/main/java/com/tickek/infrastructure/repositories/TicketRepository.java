package com.tickek.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.TicketEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
    List<TicketEntity> findByUsuarioSolicitanteId(Long usuarioId);
    List<TicketEntity> findByUsuarioTecnicoId(Long usuarioId);
    List<TicketEntity> findByCategoriaId(Long categoriaId);
    List<TicketEntity> findByPrioridadId(Long prioridadId);
}

