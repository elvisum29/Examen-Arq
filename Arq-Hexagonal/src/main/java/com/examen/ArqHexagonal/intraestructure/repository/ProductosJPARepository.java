package com.examen.ArqHexagonal.intraestructure.repository;

import com.examen.ArqHexagonal.intraestructure.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosJPARepository extends JpaRepository<ProductosEntity, Long> {
}
