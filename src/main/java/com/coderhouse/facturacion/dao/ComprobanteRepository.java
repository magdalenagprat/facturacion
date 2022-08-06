package com.coderhouse.facturacion.dao;

import com.coderhouse.facturacion.entity.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}
