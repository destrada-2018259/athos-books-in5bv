package com.athos.models.domain;

/**
 *
 * @author Dorbal Emilio Aldana Ramos
 * @date 3/09/2022
 * @time 14:56:04 Carné 2021604 Código técnico: IN5BV Grupo: 1
 */
public class Renta {

    private int id;
    private String fechaRenta;
    private String fechaDevolucion;
    private int clienteId;
    private int libroId;
    private int sucursalId;

    public Renta() {
    }

    public Renta(int id) {
        this.id = id;
    }

    public Renta(String fechaRenta, String fechaDevolucion, int clienteId, int libroId, int sucursalId) {
        this.fechaRenta = fechaRenta;
        this.fechaDevolucion = fechaDevolucion;
        this.clienteId = clienteId;
        this.libroId = libroId;
        this.sucursalId = sucursalId;
    }

    public Renta(int id, String fechaRenta, String fechaDevolucion, int clienteId, int libroId, int sucursalId) {
        this.id = id;
        this.fechaRenta = fechaRenta;
        this.fechaDevolucion = fechaDevolucion;
        this.clienteId = clienteId;
        this.libroId = libroId;
        this.sucursalId = sucursalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaRenta() {
        return fechaRenta;
    }

    public void setFechaRenta(String fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }

    @Override
    public String toString() {
        return "Renta{" + "id=" + id + ", fechaRenta=" + fechaRenta + ", fechaDevolucion=" + fechaDevolucion + ", clienteId=" + clienteId + ", libroId=" + libroId + ", sucursalId=" + sucursalId + '}';
    }

    
}
