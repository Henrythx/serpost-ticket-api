package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.NotificacionEntity;


public interface NotificacionService {
    NotificacionEntity crearNotificacion(NotificacionEntity notificacion);
    Optional<NotificacionEntity> obtenerNotificacion(Long id);
    List<NotificacionEntity> listarPorTicket(Long ticketId);
    List<NotificacionEntity> listarPendientes();
    NotificacionEntity marcarComoEnviada(Long id);
}
