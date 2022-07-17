package com.coderhouse.facturacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Column(name = "PRODUCTOID")
    @Id
    private Integer productoId;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private Integer precio;

    @Column(name = "STOCK")
    private Integer stock;

    public Producto() {
    }

    public Producto(Integer productoId, String descripcion, Integer precio, Integer cantidad) {
        this.productoId = productoId;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
