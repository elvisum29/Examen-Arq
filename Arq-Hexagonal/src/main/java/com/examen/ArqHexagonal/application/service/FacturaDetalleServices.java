package com.examen.ArqHexagonal.application.service;

import com.examen.ArqHexagonal.domain.model.FacturaDetalle;
import com.examen.ArqHexagonal.domain.ports.in.FacturaDetalleIn;

import java.util.Optional;

public class FacturaDetalleServices implements FacturaDetalleIn {


    protected final FacturaDetalleIn facturaDetalleIn;

    public FacturaDetalleServices(FacturaDetalleIn facturaDetalleIn) {
        this.facturaDetalleIn = facturaDetalleIn;
    }

    @Override
    public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle) {
        return null;
    }

    @Override
    public Optional<FacturaDetalle> getFacturaDetalle(Long detalle_id) {
        return Optional.empty();
    }
}
