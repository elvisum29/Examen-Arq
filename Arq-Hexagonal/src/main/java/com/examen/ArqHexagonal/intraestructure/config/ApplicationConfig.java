package com.examen.ArqHexagonal.intraestructure.config;

import com.examen.ArqHexagonal.application.service.ProductoService;
import com.examen.ArqHexagonal.application.useCase.ProductoServiceImpl;
import com.examen.ArqHexagonal.domain.ports.out.ProductosOut;
import com.examen.ArqHexagonal.intraestructure.repository.ProductosJPARepository;
import com.examen.ArqHexagonal.intraestructure.repository.ProductosJPARepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public ProductoService productoService(ProductosOut productosOut) {
        return new ProductoService(new ProductoServiceImpl(productosOut));
    }

    @Bean
    public ProductosOut productosOut(ProductosJPARepositoryAdapter productosJPARepositoryAdapter) {
        return productosJPARepositoryAdapter;
    }
}
