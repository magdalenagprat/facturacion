package com.coderhouse.facturacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "LINEA")
public class Venta {

    @Column(name = "VENTAID")
    @Id
    private Integer ventaId;

    @Column(name = "COMPROBANTEID")
    private Integer comprobanteId;

    @Column(name = "PRODUCTOID")
    private String productoId;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "TOTAL")
    private Integer total;

    public Venta() {
    }

    public Venta(Integer ventaId, Integer comprobanteId, String productoId, Integer cantidad, Integer total) {
        this.ventaId = ventaId;
        this.comprobanteId = comprobanteId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Integer getVentaId() {
        return ventaId;
    }

    public void setVentaId(Integer ventaId) {
        this.ventaId = ventaId;
    }

    public Integer getComprobanteId() {
        return comprobanteId;
    }

    public void setComprobanteId(Integer comprobanteId) {
        this.comprobanteId = comprobanteId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

