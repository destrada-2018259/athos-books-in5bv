package com.athos.models.domain;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 4/09/2022
 */

public class Libro {
    private String isbn;
    private String nombre;
    private String prologo;
    private int stock;
    private String edicion;
    private int editorialId;
    private int proveedorId;
    
    public Libro() {
        
    }
    
    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Libro(String nombre, String prologo, int stock, String edicion, int editorialId, int proveedorId) {
        this.nombre = nombre;
        this.prologo = prologo;
        this.stock = stock;
        this.edicion = edicion;
        this.editorialId = editorialId;
        this.proveedorId = proveedorId;
    }

    public Libro(String isbn, String nombre, String prologo, int stock, String edicion, int editorialId, int proveedorId) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.prologo = prologo;
        this.stock = stock;
        this.edicion = edicion;
        this.editorialId = editorialId;
        this.proveedorId = proveedorId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        this.prologo = prologo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getEditorialId() {
        return editorialId;
    }

    public void setEditorialId(int editorialId) {
        this.editorialId = editorialId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    @Override
    public String toString() {
        return "Libro: " + "isbn: " + isbn + "| nombre: " + nombre + "| prologo: " + prologo + "| stock: " + stock + "| edicion: " + edicion + "| editorialId: " + editorialId + "| proveedorId: " + proveedorId;
    }
}