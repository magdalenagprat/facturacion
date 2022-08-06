package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dao.ClienteRepository;
import com.coderhouse.facturacion.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarPorId(Integer clienteId) {
        return clienteRepository.findById(clienteId).orElse(null);
    }

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }


    public Cliente crear(Cliente cliente) throws Exception {
    if (buscarPorId(cliente.getClienteId()) == null) {
        return clienteRepository.save(cliente);
    }
        else {
        throw new Exception( "El cliente ya existe");
    }
}

    public Cliente actualizar(Cliente cliente) throws Exception {
        if (buscarPorId(cliente.getClienteId()) != null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception("El cliente no existe");
        }
    }

    public void eliminar(Cliente cliente) throws Exception {
        if (buscarPorId(cliente.getClienteId()) != null) {
            clienteRepository.delete(cliente);
        } else {
            throw new Exception("El cliente no existe");
        }
    }

    public void eliminarPorId(Integer clienteId) {
        clienteRepository.deleteById(clienteId);
    }
}
