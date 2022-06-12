package com.bl.bootcamp.mspedidos.persistencia;

import java.util.List;

import com.bl.bootcamp.mspedidos.persistencia.modelo.PedidoBean;

public interface PedidoRepository {
    public List<PedidoBean> listarPedidos();

    PedidoBean obtenerPedido(Integer id);

    int crearPedido(PedidoBean pedido);

    int editarPedido(PedidoBean pedido);

    int borrarPedido(Integer id);
}
