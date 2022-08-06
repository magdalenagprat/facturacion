package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.entity.Cliente;
import com.coderhouse.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> buscarTodos() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{clienteId}")
    public Cliente buscarPorId(@PathVariable Integer clienteId) {
        return clienteService.buscarPorId(clienteId);
    }

    @PostMapping("/actualizar")
    public Cliente actualizar(@RequestBody Cliente cliente) throws Exception {
        return clienteService.actualizar(cliente);
    }

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crear(cliente);
    }

    @PostMapping("/eliminar")
    public void eliminar(@RequestBody Cliente cliente) throws Exception {
        clienteService.eliminar(cliente);
    }

    @GetMapping("/eliminar/{clienteId}")
    public void eliminarPorId(@PathVariable Integer clienteId) {
        clienteService.eliminarPorId(clienteId);
    }
}
