package com.universidad.mvc.model;

/**
 * JavaBean que representa la entidad Producto del dominio.
 * Implementa Serializable para permitir almacenamiento en sesión si se
 * requiere.
 */
public class Producto implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    // Constructor vacío requerido por JavaBean
    public Producto() {
    }

    public Producto(int id, String nombre, String categoria,
            double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    // --- Getters y Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String cat) {
        this.categoria = cat;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}