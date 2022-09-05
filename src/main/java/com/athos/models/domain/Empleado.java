package com.athos.models.domain;


import java.time.LocalDate;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 17:16:42
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */
public class Empleado {
    
    private int id;
    private LocalDate fechaContratacion;
    private int idPersona;
    private int idSucursal;
    
    public Empleado(){
        
    }

    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(LocalDate fechaContratacion, int idPersona, int idSucursal) {
        this.fechaContratacion = fechaContratacion;
        this.idPersona = idPersona;
        this.idSucursal = idSucursal;
    }

    public Empleado(int id, LocalDate fechaContratacion, int idPersona, int idSucursal) {
        this.id = id;
        this.fechaContratacion = fechaContratacion;
        this.idPersona = idPersona;
        this.idSucursal = idSucursal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", fechaContratacion=" + fechaContratacion + ", idPersona=" + idPersona + ", idSucursal=" + idSucursal + '}';
    }
    
    
    
}
