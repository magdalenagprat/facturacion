package com.coderhouse.facturacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "LINEA")
public class Linea {

    @Column(name = "LINEAID")
    @Id
    private Integer lineaId;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private Integer precio;

    public Linea() {
    }

    public Linea(Integer lineaId, Integer cantidad, String descripcion, Integer precio) {
        this.lineaId = lineaId;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getLineaId() {
        return lineaId;
    }

    public void setLineaId(Integer lineaId) {
        this.lineaId = lineaId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}

