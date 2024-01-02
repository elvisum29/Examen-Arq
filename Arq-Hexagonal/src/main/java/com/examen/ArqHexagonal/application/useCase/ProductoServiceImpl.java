package com.examen.ArqHexagonal.application.useCase;

import com.examen.ArqHexagonal.domain.model.Productos;
import com.examen.ArqHexagonal.domain.ports.in.ProductosIn;
import com.examen.ArqHexagonal.domain.ports.out.ProductosOut;

import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductosIn { // paso 5

    private final ProductosOut productosOut;
    public ProductoServiceImpl(ProductosOut productosOut) {
        this.productosOut = productosOut;
    }

    @Override
    public Productos addProductos(Productos productos) {
        return productosOut.addProductos(productos);
    }

    @Override
    public Optional<Productos> getProductos(Long producto_id) {
        return productosOut.getProductos(producto_id);
    }

    @Override
    public List<Productos> getProductos() {
        return productosOut.getProductos();
    }

    @Override
    public Optional<Productos> updateProductos(Long producto_id, Productos productos) {
        return productosOut.updateProductos(producto_id, productos);
    }

    @Override
    public boolean deleteProductos(Long producto_id) {
        return productosOut.deleteProductos( producto_id);
    }



}
