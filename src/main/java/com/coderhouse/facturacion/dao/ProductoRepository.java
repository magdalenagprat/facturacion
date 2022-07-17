package com.coderhouse.facturacion.dao;

import com.coderhouse.facturacion.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}