package com.examen.ArqHexagonal.application.useCase;

import com.examen.ArqHexagonal.domain.model.FacturaDetalle;
import com.examen.ArqHexagonal.domain.ports.in.FacturaDetalleIn;
import com.examen.ArqHexagonal.domain.ports.out.FacturaDetalleOut;

import java.util.Optional;

public class FacturaDetalleServiceImpl implements FacturaDetalleIn {

    private final FacturaDetalleOut facturaDetalleOut;

    public FacturaDetalleServiceImpl(FacturaDetalleOut facturaDetalleOut) {
        this.facturaDetalleOut = facturaDetalleOut;
    }
    @Override
    public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle) {

        return facturaDetalleOut.addFacturaDetalle(facturaDetalle);
    }

    @Override
    public Optional<FacturaDetalle> getFacturaDetalle(Long detalle_id) {
        return Optional.empty();
    }
}
