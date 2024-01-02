package com.examen.ArqHexagonal.intraestructure.entity;

import com.examen.ArqHexagonal.domain.model.FacturaCabecera;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "FacturaCabecera")
public class FacturaCabeceraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long factura_id;
    private String cliente_nombre;
    private String cliente_num_documento;
    private Date fecha_emision;
    private double total;

    public FacturaCabeceraEntity() {
    }

    public FacturaCabeceraEntity(Long factura_id, String cliente_nombre, String cliente_num_documento, Date fecha_emision, double total) {
        this.factura_id = factura_id;
        this.cliente_nombre = cliente_nombre;
        this.cliente_num_documento = cliente_num_documento;
        this.fecha_emision = fecha_emision;
        this.total = total;
    }
    public static FacturaCabeceraEntity fromDomainModelFacturaCabecera(FacturaCabecera facturaCabecera){
        return new FacturaCabeceraEntity(facturaCabecera.getFactura_id(),facturaCabecera.getCliente_nombre(),facturaCabecera.getCliente_num_documento(),facturaCabecera.getFecha_emision(),facturaCabecera.getTotal());
    }

    public FacturaCabecera toDomainModelFacturaCabecera(){
        return new FacturaCabecera(factura_id, cliente_nombre, cliente_num_documento, fecha_emision, total);
    }

}
