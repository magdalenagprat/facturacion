package com.coderhouse.facturacion.dao;

import com.coderhouse.facturacion.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
