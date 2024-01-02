package com.examen.ArqHexagonal.domain.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FacturaCabecera {
    private Long factura_id;
    private String cliente_nombre;
    private String cliente_num_documento;
    private Date fecha_emision;
    private double total;

    public FacturaCabecera() {
    }

    public FacturaCabecera(Long factura_id, String cliente_nombre, String cliente_num_documento, Date fecha_emision, double total) {
        this.factura_id = factura_id;
        this.cliente_nombre = cliente_nombre;
        this.cliente_num_documento = cliente_num_documento;
        this.fecha_emision = fecha_emision;
        this.total = total;
    }
}
