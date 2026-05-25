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
@Table(name = "ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario_solicitante")
    private UsuarioEntity usuarioSolicitante;

    @ManyToOne
    @JoinColumn(name = "id_usuario_tecnico")
    private UsuarioEntity usuarioTecnico;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "id_prioridad")
    private PrioridadEntity prioridad;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime resolved;
    
    
    

    //  CONSTRUCTOR
    public TicketEntity() {
    }

    public TicketEntity(UsuarioEntity usuarioSolicitante, UsuarioEntity usuarioTecnico, CategoriaEntity categoria,
            PrioridadEntity prioridad, String titulo, String descripcion) {
        this.usuarioSolicitante = usuarioSolicitante;
        this.usuarioTecnico = usuarioTecnico;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }






    //  GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(UsuarioEntity usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public UsuarioEntity getUsuarioTecnico() {
        return usuarioTecnico;
    }

    public void setUsuarioTecnico(UsuarioEntity usuarioTecnico) {
        this.usuarioTecnico = usuarioTecnico;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public PrioridadEntity getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PrioridadEntity prioridad) {
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public LocalDateTime getResolved() {
        return resolved;
    }

    public void setResolved(LocalDateTime resolved) {
        this.resolved = resolved;
    }

    
}
