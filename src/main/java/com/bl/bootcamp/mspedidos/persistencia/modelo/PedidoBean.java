package com.bl.bootcamp.mspedidos.persistencia.modelo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PedidoBean {
    private Integer idpedido;

    private Date fecha = new Date();

    private Integer preciototal;

    private Integer idcliente;

}