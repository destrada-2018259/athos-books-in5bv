package com.athos.models.domain;

/**
 * @author Jefferson Gadiel Yuman Pérez
 * @date 3/09/2022
 */

public class Persona {
    private int id;
    private String nombre1;
    private String nombre2;
    private String nombre3;
    private String apellido1;
    private String apellido2;
    
    public Persona() {
        
    }
    
    public Persona(int id) {
        this.id = id;
    }

    public Persona(String nombre1, String nombre2, String nombre3, String apellido1, String apellido2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Persona(int id, String nombre1, String nombre2, String nombre3, String apellido1, String apellido2) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Persona: " + "id: " + id + "| nombre1: " + nombre1 + "| nombre2: " + nombre2 + "| nombre3: " + nombre3 + "| apellido1: " + apellido1 + "| apellido2: " + apellido2;
    }
}
