package com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.conversor;

import com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.dto.Pedido;
import com.bl.bootcamp.mspedidos.persistencia.modelo.PedidoBean;
import org.springframework.stereotype.Component;

@Component
public class PedidoConversor {
    public PedidoBean aModelo(Pedido dto) {
        return new PedidoBean(dto.getIdPedido(), dto.getFecha(), dto.getPrecioTotal(), dto.getIdCliente());
    }

    public Pedido aDto(PedidoBean dto) {
        Pedido pedido = new Pedido();
        pedido.setIdPedido(dto.getIdpedido());
        pedido.setFecha(dto.getFecha());
        pedido.setPrecioTotal(dto.getPreciototal());
        pedido.setIdCliente(dto.getIdcliente());
        return pedido;
    }
}
