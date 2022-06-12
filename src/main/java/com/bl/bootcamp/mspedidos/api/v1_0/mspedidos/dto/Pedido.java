package com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Pedido {

    private Integer idPedido;

    private Date fecha = new Date();

    @NotNull(message = "El precio no debe estar vacío")
    private Integer precioTotal;

    @NotNull(message = "El cliente no debe estar vacío")
    private Integer idCliente;
}
