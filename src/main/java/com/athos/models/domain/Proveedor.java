package com.athos.models.domain;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

public class Proveedor {
    private int id;
    private String nombreProveedor;
    private String telefono;
    private String email;
    private String direccion;
    
    public Proveedor() {
        
    }
    
    public Proveedor(int id) {
        this.id = id;
    }

    public Proveedor(String nombreProveedor, String telefono, String email, String direccion) {
        this.nombreProveedor = nombreProveedor;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public Proveedor(int id, String nombreProveedor, String telefono, String email, String direccion) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor: " + "id: " + id + "| Proveedor: " + nombreProveedor + "| telefono: " + telefono + "| email: " + email + "| direccion: " + direccion;
    }
}
