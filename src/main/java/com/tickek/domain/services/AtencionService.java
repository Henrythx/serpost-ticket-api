
package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.AtencionEntity;

public class AtencionService {
    public interface ListaAtencionService {
    AtencionEntity registrarCambio(AtencionEntity cambio);

    Optional<AtencionEntity> obtenerRegistro(Long id);

    List<AtencionEntity> listarPorTicket(Long ticketId);
    
    List<AtencionEntity> listarPorUsuario(Long usuarioId);
}

}
