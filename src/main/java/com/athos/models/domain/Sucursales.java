package com.athos.models.domain;

/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 4/09/2022
 * @time 14:48:15
 */
public class Sucursales {
    
    private int idSucursal;
    private String nombreSucursal;
    private String direccionSucursal;
    private String telefonoSucursal;
    private int idHorario;
    private int idProovedor;

    public Sucursales() {
    }

    public Sucursales(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Sucursales(String nombreSucursal, String direccionSucursal, String telefonoSucursal, int idHorario, int idProovedor) {
        this.nombreSucursal = nombreSucursal;
        this.direccionSucursal = direccionSucursal;
        this.telefonoSucursal = telefonoSucursal;
        this.idHorario = idHorario;
        this.idProovedor = idProovedor;
    }

    public Sucursales(int idSucursal, String nombreSucursal, String direccionSucursal, String telefonoSucursal, int idHorario, int idProovedor) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccionSucursal = direccionSucursal;
        this.telefonoSucursal = telefonoSucursal;
        this.idHorario = idHorario;
        this.idProovedor = idProovedor;
    }

    public Sucursales(int aInt, String string, String string0, String string1, String string2, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //GETTERS

    public int getIdSucursal() {
        return idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public String getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public int getIdProovedor() {
        return idProovedor;
    }
    
    //SETTERS

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public void setTelefonoSucursal(String telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public void setIdProovedor(int idProovedor) {
        this.idProovedor = idProovedor;
    }

    @Override
    public String toString() {
        return "Sucursales{" + "idSucursal=" + idSucursal + ", nombreSucursal=" + nombreSucursal + ", direccionSucursal=" + direccionSucursal + ", telefonoSucursal=" + telefonoSucursal + ", idHorario=" + idHorario + ", idProovedor=" + idProovedor + '}';
    }
    
    
}
