package com.bl.bootcamp.mspedidos.servicios.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.conversor.PedidoConversor;
import com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.dto.Pedido;
import com.bl.bootcamp.mspedidos.persistencia.PedidoRepository;
import com.bl.bootcamp.mspedidos.servicios.ServicioMspedidos;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioMspedidosImpl implements ServicioMspedidos {

    private final PedidoRepository repositorio;
    private final PedidoConversor conversor;

    @Autowired
    public ServicioMspedidosImpl(PedidoRepository repositorio, PedidoConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    public List<Pedido> listarPedidos() {
        return this.repositorio.listarPedidos().stream().map(conversor::aDto).collect(Collectors.toList());
    }

    @Override
    public Pedido obtenerPedido(Integer id) {
        return conversor.aDto(this.repositorio.obtenerPedido(id));
    }

    @Override
    public int crearPedido(Pedido pedido) {
        return this.repositorio.crearPedido(conversor.aModelo(pedido));
    }

    @Override
    public int editarPedido(Pedido pedido) {
        return this.repositorio.editarPedido(conversor.aModelo(pedido));
    }

    @Override
    public int borrarPedido(Integer id) {
        return this.repositorio.borrarPedido(id);
    }

}
