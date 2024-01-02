package com.examen.ArqHexagonal.intraestructure.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "FacturaDetalle")
public class FacturaDetalleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private ProductosEntity productosEntity;
    private FacturaCabeceraEntity facturaCabeceraEntity;
    private Long detalle_id;
    private Long producto_id = productosEntity.getProducto_id();
    private Long factura_id = facturaCabeceraEntity.getFactura_id();
    private int cantidad;
    private double precio_unitario;
    private double subtotal;

    public FacturaDetalleEntity() {
    }

    public FacturaDetalleEntity(Long detalle_id, Long producto_id, Long factura_id, int cantidad, double precio_unitario, double subtotal) {
        this.detalle_id = detalle_id;
        this.producto_id = producto_id;
        this.factura_id = factura_id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }




}
