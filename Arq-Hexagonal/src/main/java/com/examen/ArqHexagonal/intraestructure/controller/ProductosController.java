package com.examen.ArqHexagonal.intraestructure.controller;

import com.examen.ArqHexagonal.application.service.ProductoService;
import com.examen.ArqHexagonal.domain.model.Productos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidad")
public class ProductosController { //paso 9

    private final ProductoService productoService;
    public ProductosController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping //Crea un nuevo producto en la base de datos.
    public ResponseEntity<Productos> addProductos(@RequestBody Productos productos) {
        Productos addProductos = productoService.addProductos(productos);
        return new ResponseEntity<>(addProductos, HttpStatus.CREATED);
    }
    @GetMapping //Obtiene la lista completa de productos.
    public ResponseEntity<List<Productos>> getProductos() {
        return new ResponseEntity<>(productoService.getProductos(), HttpStatus.OK);
    }

    @GetMapping ("/{producto_id}")//Obtiene los detalles de un producto específico mediante su ID.
    public ResponseEntity<Productos> getProductos(@PathVariable Long producto_id) {
        return productoService.getProductos(producto_id).map(productos -> new ResponseEntity<>(productos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{producto_id}") //Actualiza la información de un producto existente.
    public ResponseEntity<Productos> updateProductos(@PathVariable Long producto_id, @RequestBody Productos productos) {
        return productoService.updateProductos(producto_id, productos)
                .map(productos1 -> new ResponseEntity<>(productos1, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{producto_id}") //Elimina un producto de la base de datos según su ID.
    public ResponseEntity<Boolean> deleteProductos(@PathVariable Long producto_id) {
        if (productoService.deleteProductos(producto_id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
