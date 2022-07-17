package com.coderhouse.facturacion.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMPROBANTE")
public class Comprobante {

    @Column(name = "COMPROBANTEID")
    @Id
    private Integer comprobanteId;

    @Column(name = "CLIENTEID")
    private Integer clienteId;

    @Column(name = "TOTAL")
    private Integer total;
    @Column(name = "FECHA")
    private Date fecha;

    public Comprobante() {
    }

    public Comprobante(Integer comprobanteId, Integer clienteId, Integer total, Date fecha) {
        this.comprobanteId = comprobanteId;
        this.clienteId = clienteId;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getComprobanteId() {
        return comprobanteId;
    }

    public void setComprobanteId(Integer comprobanteId) {
        this.comprobanteId = comprobanteId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
