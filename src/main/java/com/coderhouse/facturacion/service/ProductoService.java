package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dao.ProductoRepository;
import com.coderhouse.facturacion.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto buscarPorId(Integer productoId) {
        return productoRepository.findById(productoId).orElse(null);
    }

    public List<Producto> buscarTodos() {
        return productoRepository.findAll();
    }


    public Producto crear(Producto producto) throws Exception {
        if (buscarPorId(producto.getProductoId()) == null) {
            return productoRepository.save(producto);
        }
        else {
            throw new Exception( "El producto ya existe");
        }
    }

    public Producto actualizar(Producto producto) throws Exception {
        if (buscarPorId(producto.getProductoId()) != null) {
            return productoRepository.save(producto);
        } else {
            throw new Exception("El producto no existe");
        }
    }

    public void eliminar(Producto producto) throws Exception {
        if (buscarPorId(producto.getProductoId()) != null) {
            productoRepository.delete(producto);
        } else {
            throw new Exception("El producto no existe");
        }
    }

    public void eliminarPorId(Integer productoId) {
        productoRepository.deleteById(productoId);
    }
}
