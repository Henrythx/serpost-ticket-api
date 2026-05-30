


package com.tickek.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_atencion")
public class AtencionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_ticket")
    private TicketEntity ticket;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "id_estado_actual")
    private EstadoEntity estadoActual;

    @ManyToOne
    @JoinColumn(name = "id_estado_antiguo")
    private EstadoEntity estadoAntiguo;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private LocalDateTime created;
    private LocalDateTime updated;



    
    //  CONTROLLERS
    public AtencionEntity() {
    }

    public AtencionEntity(TicketEntity ticket, UsuarioEntity usuario, EstadoEntity estadoActual,
            EstadoEntity estadoAntiguo, String descripcion) {
        this.ticket = ticket;
        this.usuario = usuario;
        this.estadoActual = estadoActual;
        this.estadoAntiguo = estadoAntiguo;
        this.descripcion = descripcion;
    }




    //  GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TicketEntity getTicket() {
        return ticket;
    }

    public void setTicket(TicketEntity ticket) {
        this.ticket = ticket;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public EstadoEntity getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoEntity estadoActual) {
        this.estadoActual = estadoActual;
    }

    public EstadoEntity getEstadoAntiguo() {
        return estadoAntiguo;
    }

    public void setEstadoAntiguo(EstadoEntity estadoAntiguo) {
        this.estadoAntiguo = estadoAntiguo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    } 
    

}
