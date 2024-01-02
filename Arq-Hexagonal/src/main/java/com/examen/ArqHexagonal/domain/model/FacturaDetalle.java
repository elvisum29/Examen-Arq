package com.examen.ArqHexagonal.domain.model;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class FacturaDetalle {

    private Productos productos;
    private FacturaCabecera facturaCabecera;

    private Long detalle_id;
    private Long factura_id=facturaCabecera.getFactura_id();
    private Long producto_id=productos.getProducto_id();
    private int cantidad;
    private double precio_unitario;
    private double subtotal;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Productos productos, FacturaCabecera facturaCabecera, Long detalle_id, Long factura_id, Long producto_id, int cantidad, double precio_unitario, double subtotal) {
        this.productos = productos;
        this.facturaCabecera = facturaCabecera;
        this.detalle_id = detalle_id;
        this.factura_id = factura_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }
}
