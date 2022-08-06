package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dao.ComprobanteRepository;
import com.coderhouse.facturacion.entity.Comprobante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    public Comprobante buscarPorId(Integer comprobanteId) {
        return comprobanteRepository.findById(comprobanteId).orElse(null);
    }

    public List<Comprobante> buscarTodos() {
        return comprobanteRepository.findAll();
    }


    public Comprobante crear(Comprobante comprobante) throws Exception {
        if (buscarPorId(comprobante.getComprobanteId()) == null) {
            return comprobanteRepository.save(comprobante);
        }
        else {
            throw new Exception( "El comprobante ya existe");
        }
    }

    public Comprobante actualizar(Comprobante comprobante) throws Exception {
        if (buscarPorId(comprobante.getComprobanteId()) != null) {
            return comprobanteRepository.save(comprobante);
        } else {
            throw new Exception("El comprobante no existe");
        }
    }

    public void eliminar(Comprobante comprobante) throws Exception {
        if (buscarPorId(comprobante.getComprobanteId()) != null) {
            comprobanteRepository.delete(comprobante);
        } else {
            throw new Exception("El comprobante no existe");
        }
    }

    public void eliminarPorId(Integer comprobanteId) {
        comprobanteRepository.deleteById(comprobanteId);
    }
}
