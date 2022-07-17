package com.coderhouse.facturacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Column(name = "CLIENTEID")
    @Id
    private Integer clienteId;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DNI")
    private Integer dni;

    public Cliente() {
    }

    public Cliente(Integer clienteId, String nombre, String apellido, Integer dni) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
