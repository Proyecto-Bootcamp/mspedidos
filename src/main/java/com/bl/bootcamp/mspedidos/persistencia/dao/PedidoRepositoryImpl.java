package com.bl.bootcamp.mspedidos.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.mspedidos.persistencia.PedidoRepository;
import com.bl.bootcamp.mspedidos.persistencia.mapper.PedidoBeanMapper;
import com.bl.bootcamp.mspedidos.persistencia.modelo.PedidoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository {
    private final PedidoBeanMapper mapper;

    @Autowired
    public PedidoRepositoryImpl(PedidoBeanMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public PedidoBean obtenerPedido(Integer id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PedidoBean> listarPedidos() {
        return this.mapper.listarPedidos();
    }

    @Override
    public int crearPedido(PedidoBean proveedor) {
        return this.mapper.insert(proveedor);
    }

    @Override
    public int editarPedido(PedidoBean proveedor) {
        return this.mapper.updateByPrimaryKeySelective(proveedor);
    }

    @Override
    public int borrarPedido(Integer id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
}
