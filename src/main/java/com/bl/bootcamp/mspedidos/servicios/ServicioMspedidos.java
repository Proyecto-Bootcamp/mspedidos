package com.bl.bootcamp.mspedidos.servicios;

import java.util.List;

import com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.dto.Pedido;

public interface ServicioMspedidos {
    List<Pedido> listarPedidos();

    Pedido obtenerPedido(Integer id);

    int crearPedido(Pedido pedido);

    int editarPedido(Pedido pedido);

    int borrarPedido(Integer id);
}
