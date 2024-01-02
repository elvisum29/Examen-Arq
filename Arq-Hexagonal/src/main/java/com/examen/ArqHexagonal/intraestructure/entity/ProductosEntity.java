package com.examen.ArqHexagonal.intraestructure.entity;

import com.examen.ArqHexagonal.domain.model.Productos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

@Entity
@Getter @Setter
@Table(name = "productos")
public class ProductosEntity { //paso 6

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producto_id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public ProductosEntity() {
    }

    public ProductosEntity(Long producto_id, String nombre, String descripcion, double precio, int stock) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public static ProductosEntity fromDomainModel(Productos productos){
        return new ProductosEntity(productos.getProducto_id(), productos.getNombre(), productos.getDescripcion(), productos.getPrecio(), productos.getStock());
    }

    public Productos toDomainModel(){
        return new Productos(producto_id, nombre, descripcion, precio, stock);
    }
}
