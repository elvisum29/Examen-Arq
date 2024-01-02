package com.examen.ArqHexagonal.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.util.Objects;

@Getter @Setter
public class Productos { //paso 1
    //public Objects HttpStatus;

    private Long producto_id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Productos() {
    }

    public Productos(Long producto_id, String nombre,String  descripcion, double precio, int stock) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }


}
