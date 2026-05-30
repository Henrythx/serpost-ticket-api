package com.tickek.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickek.domain.model.AtencionEntity;

@Repository
public interface AtencionRepository extends JpaRepository<AtencionEntity, Long> {
    List<AtencionEntity> findByTicketId(Long ticketId);
    List<AtencionEntity> findByUsuarioId(Long usuarioId);
}