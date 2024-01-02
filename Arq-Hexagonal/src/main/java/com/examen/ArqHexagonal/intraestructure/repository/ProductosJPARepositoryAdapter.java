package com.examen.ArqHexagonal.intraestructure.repository;

import com.examen.ArqHexagonal.domain.model.Productos;
import com.examen.ArqHexagonal.domain.ports.out.ProductosOut;
import com.examen.ArqHexagonal.intraestructure.entity.ProductosEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductosJPARepositoryAdapter implements ProductosOut { //paso 8

    private final ProductosJPARepository productosJPARepository;

    public ProductosJPARepositoryAdapter(ProductosJPARepository productosJPARepository) {
        this.productosJPARepository = productosJPARepository;
    }


    @Override
    public Productos addProductos(Productos productos) {

        ProductosEntity productosEntity = ProductosEntity.fromDomainModel(productos);
        return productosJPARepository.save(productosEntity).toDomainModel();
    }

    @Override
    public Optional<Productos> getProductos(Long producto_id) {
        return productosJPARepository.findById(producto_id).map(ProductosEntity::toDomainModel);
    }

    @Override
    public List<Productos> getProductos() {
        return productosJPARepository.findAll().stream().map(ProductosEntity::toDomainModel).toList();
    }

    @Override
    public Optional<Productos> updateProductos(Long producto_id, Productos productos) {
        if (productosJPARepository.existsById(producto_id)) {
            ProductosEntity productosEntity = ProductosEntity.fromDomainModel(productos);
            return Optional.of(productosJPARepository.save(productosEntity).toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteProductos(Long producto_id) {
        if (productosJPARepository.existsById(producto_id)) {
            productosJPARepository.deleteById(producto_id);
            return true;
        }
        return false;
    }


}
