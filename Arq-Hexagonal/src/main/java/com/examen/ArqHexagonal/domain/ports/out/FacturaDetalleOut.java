package com.examen.ArqHexagonal.domain.ports.out;

import com.examen.ArqHexagonal.domain.model.FacturaDetalle;

import java.util.Optional;

public interface FacturaDetalleOut {

    FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle); //Crear o agregar una nueva Factura.

    Optional<FacturaDetalle> getFacturaDetalle(Long detalle_id); //Leer una Factura.



}
