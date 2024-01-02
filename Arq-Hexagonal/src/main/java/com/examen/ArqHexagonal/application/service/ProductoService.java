package com.examen.ArqHexagonal.application.service;

import com.examen.ArqHexagonal.domain.model.Productos;
import com.examen.ArqHexagonal.domain.ports.in.ProductosIn;

import java.util.List;
import java.util.Optional;

public class ProductoService implements ProductosIn { //paso

    private final ProductosIn productosIn;

    public ProductoService(ProductosIn productosIn) {
        this.productosIn = productosIn;
    }

    @Override
    public Productos addProductos(Productos productos)  {
        return productosIn.addProductos(productos);
    }

    @Override
    public Optional<Productos> getProductos(Long producto_id) {
        return productosIn.getProductos(producto_id);
    }

    @Override
    public List<Productos> getProductos() {
        return productosIn.getProductos();
    }

    @Override
    public Optional<Productos> updateProductos(Long producto_id, Productos productos) {
        return productosIn.updateProductos(producto_id, productos);
    }

    @Override
    public boolean deleteProductos(Long producto_id) {
        return productosIn.deleteProductos(producto_id);
    }

    //básicas de Crear, Leer, Actualizar y Eliminar productos.

}
