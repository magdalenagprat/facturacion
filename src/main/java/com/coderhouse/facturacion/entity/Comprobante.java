package com.coderhouse.facturacion.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "COMPROBANTE")
public class Comprobante {

    @Column(name = "COMPROBANTEID")
    @Id
    private Integer comprobanteId;

    @Column(name = "TOTAL")
    private Integer total;
    @Column(name = "FECHA")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="CLIENTEID")
    private Cliente clienteId;

    public Comprobante() {
    }

    public Comprobante(Integer comprobanteId, Integer total, LocalDate fecha, Cliente clienteId) {
        this.comprobanteId = comprobanteId;
        this.total = total;
        this.fecha = fecha;
        this.clienteId = clienteId;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }
}
