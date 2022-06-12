package com.bl.bootcamp.mspedidos.api.v1_0.mspedidos;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.bootcamp.mspedidos.api.v1_0.mspedidos.dto.Pedido;
import com.bl.bootcamp.mspedidos.servicios.ServicioMspedidos;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequestMapping(path = "/v1_0/mspedidos", produces = MediaType.APPLICATION_JSON_VALUE)
public class MspedidosController {
    private ServicioMspedidos servicio;

    @Autowired
    public MspedidosController(ServicioMspedidos servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public @ResponseBody List<Pedido> listarPedidos() {
        return servicio.listarPedidos();
    }

    @GetMapping("/{id}")
    public @ResponseBody Pedido obtenerPedido(@PathVariable Integer id) {
        return servicio.obtenerPedido(id);
    }

    @PostMapping
    public @ResponseBody int crearPedido(@Valid @RequestBody Pedido pedido) {
        return servicio.crearPedido(pedido);
    }

    @PutMapping
    public @ResponseBody int editarPedido(@Valid @RequestBody Pedido pedido) {

        return servicio.editarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarPedido(@PathVariable Integer id) {
        return servicio.borrarPedido(id);
    }

}
