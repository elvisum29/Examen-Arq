package com.examen.ArqHexagonal.domain.ports.in;

import com.examen.ArqHexagonal.domain.model.FacturaDetalle;

import java.util.Optional;

public interface FacturaDetalleIn {

    //básicas de Crear, Leer, Actualizar y Eliminar productos.

    FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle); //Crear o agregar una nueva Factura.

    Optional<FacturaDetalle> getFacturaDetalle(Long detalle_id); //Leer una Factura.

}
