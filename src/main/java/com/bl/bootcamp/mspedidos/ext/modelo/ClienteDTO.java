package com.bl.bootcamp.mspedidos.ext.modelo;

import lombok.Data;

@Data
public class ClienteDTO {
    private Integer idcliente;

    private String nombre;

    private String apellidos;

    private String email;

    private String telefono;
}