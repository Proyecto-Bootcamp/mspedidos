package com.bl.bootcamp.mspedidos.ext.clientes;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bl.bootcamp.mspedidos.ext.modelo.ClienteDTO;

@FeignClient(value = "${com.bl.bootcamp.ext.clientes.clientes.name}", url = "${com.bl.bootcamp.ext.clientes.clientes.url}")
public interface ClienteCliente {

	// Ejemplo de llamada a servicio
	// @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// ClienteDTO method(@RequestParam("") Object o);

}
