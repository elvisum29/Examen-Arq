package com.examen.ArqHexagonal.domain.ports.in;


import com.examen.ArqHexagonal.domain.model.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductosIn { //paso 2

    //básicas de Crear, Leer, Actualizar y Eliminar productos.

    Productos addProductos(Productos productos) ; //Crear o agregar un nuevo producto.

    Optional<Productos> getProductos(Long producto_id); //Leer un producto.

    List<Productos> getProductos();

    Optional<Productos> updateProductos(Long producto_id, Productos productos); //Actualizar un producto.

    boolean deleteProductos(Long producto_id); //Eliminar un producto.
}
