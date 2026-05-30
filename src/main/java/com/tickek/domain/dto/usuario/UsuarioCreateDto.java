package com.tickek.domain.dto.usuario;

public class UsuarioCreateDto {
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private Long areaId;
    private Long rolId;


    public UsuarioCreateDto(String nombre, String apellido, String email, String password, Long areaId, Long rolId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.areaId = areaId;
        this.rolId = rolId;
    }

    
    
}

