package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.TicketEntity;

public interface TicketService {
    TicketEntity crearTicket(TicketEntity ticket);

    TicketEntity actualizarTicket(Long id, TicketEntity ticket);

    void eliminarTicket(Long id);

    Optional<TicketEntity> obtenerTicket(Long id);

    List<TicketEntity> listarTickets();

    
    List<TicketEntity> listarPorSolicitante(Long usuarioId);

    List<TicketEntity> listarPorTecnico(Long usuarioId);

    List<TicketEntity> listarPorCategoria(Long categoriaId);

    List<TicketEntity> listarPorPrioridad(Long prioridadId);

    TicketEntity asignarTecnico(Long ticketId, Long tecnicoId);

    TicketEntity cambiarEstado(Long ticketId, String nuevoEstado);
    
    TicketEntity resolverTicket(Long ticketId);
}
