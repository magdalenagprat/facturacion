package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.entity.Producto;
import com.coderhouse.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> buscarTodos() {
        return productoService.buscarTodos();
    }

    @GetMapping("/{productoId}")
    public Producto buscarPorId(@PathVariable Integer productoId) {
        return productoService.buscarPorId(productoId);
    }

    @PostMapping("/actualizar")
    public Producto actualizar(@RequestBody Producto producto) throws Exception {
        return productoService.actualizar(producto);
    }

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto producto) throws Exception {
        return productoService.crear(producto);
    }

}

