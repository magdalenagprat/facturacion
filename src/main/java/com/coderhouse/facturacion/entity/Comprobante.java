package com.coderhouse.facturacion.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMPROBANTE")
public class Comprobante {

    @Column(name = "COMPROBANTEID")
    @Id
    private Integer comprobanteId;

    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "LINEA")
    private String linea;

    @Column(name = "FECHA")
    private Date fecha;

    public Comprobante() {
    }

    public Comprobante(Integer comprobanteId, Integer total, Integer cantidad, String linea, Date fecha) {
        this.comprobanteId = comprobanteId;
        this.total = total;
        this.cantidad = cantidad;
        this.linea = linea;
        this.fecha = fecha;
    }

    public Integer getComprobanteId() {
        return comprobanteId;
    }

    public void setComprobanteId(Integer comprobanteId) {
        this.comprobanteId = comprobanteId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
