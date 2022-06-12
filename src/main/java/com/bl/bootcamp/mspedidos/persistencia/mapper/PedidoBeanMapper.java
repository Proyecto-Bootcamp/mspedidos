package com.bl.bootcamp.mspedidos.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.mspedidos.persistencia.modelo.PedidoBean;

public interface PedidoBeanMapper {
    int deleteByPrimaryKey(Integer idpedido);

    int insert(PedidoBean record);

    int insertSelective(PedidoBean record);

    PedidoBean selectByPrimaryKey(Integer idpedido);

    int updateByPrimaryKeySelective(PedidoBean record);

    int updateByPrimaryKey(PedidoBean record);

    List<PedidoBean> listarPedidos();

}