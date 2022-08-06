package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.entity.Comprobante;
import com.coderhouse.facturacion.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobante")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping()
    public List<Comprobante> buscarTodos() {
        return comprobanteService.buscarTodos();
    }

    @GetMapping("/{comprobanteId}")
    public Comprobante buscarPorId(@PathVariable Integer comprobanteId) {
        return comprobanteService.buscarPorId(comprobanteId);
    }

    @PostMapping("/actualizar")
    public Comprobante actualizar(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.actualizar(comprobante);
    }

    @PostMapping("/crear")
    public Comprobante crear(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.crear(comprobante);
    }

    @PostMapping("/eliminar")
    public void eliminar(@RequestBody Comprobante comprobante) throws Exception {
        comprobanteService.eliminar(comprobante);
    }

    @GetMapping("/eliminar/{clienteId}")
    public void eliminarPorId(@PathVariable Integer comprobanteId) {
        comprobanteService.eliminarPorId(comprobanteId);
    }
}
