package com.coderhouse.facturacion.dao;

import com.coderhouse.facturacion.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
