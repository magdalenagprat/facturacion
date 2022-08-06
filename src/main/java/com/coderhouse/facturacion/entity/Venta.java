package com.coderhouse.facturacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "LINEA")
public class Venta {

    @Column(name = "VENTAID")
    @Id
    private Integer ventaId;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "TOTAL")
    private Integer total;

    @ManyToOne
    @JoinColumn(name="COMPROBANTEID")
    private Comprobante comprobante;

    @Column(name = "PRODUCTOID")
    private Integer producto;

    public Venta() {
    }

    public Venta(Integer ventaId, Integer cantidad, Integer total, Comprobante comprobante, Integer producto) {
        this.ventaId = ventaId;
        this.cantidad = cantidad;
        this.total = total;
        this.comprobante = comprobante;
        this.producto = producto;
    }

    public Integer getVentaId() {
        return ventaId;
    }

    public void setVentaId(Integer ventaId) {
        this.ventaId = ventaId;
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

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }
}

