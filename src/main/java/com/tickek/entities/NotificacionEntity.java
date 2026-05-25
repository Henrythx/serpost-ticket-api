package com.tickek.entities;

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
@Table(name = "notificacion")
public class NotificacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_ticket")
    private TicketEntity ticket;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoNotiEntity tipo;

    @Column(nullable = false, length = 255)
    private String emailDestino;

    @Column(nullable = false, length = 255)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String cuerpo;

    private boolean enviado;

    private LocalDateTime created;




    //  CONSTRUCTOR
    public NotificacionEntity() {
    }

    public NotificacionEntity(TicketEntity ticket, TipoNotiEntity tipo, String emailDestino, String titulo,
            String cuerpo) {
        this.ticket = ticket;
        this.tipo = tipo;
        this.emailDestino = emailDestino;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
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

    public TipoNotiEntity getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotiEntity tipo) {
        this.tipo = tipo;
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }



    
}

