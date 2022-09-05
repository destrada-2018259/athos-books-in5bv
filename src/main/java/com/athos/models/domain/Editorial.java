

package com.athos.models.domain;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 2/09/2022
 * @time 22:12:59
 *
 * Codigo Tecnico: IN5BV
 */
import java.time.LocalDate;

public class Editorial {

    private int id;
    private String nombreEditorial;
    private String sedeEditorial;
    private String direccionEditorial;
    private String telefonoEditorial;
    private String emailEditorial;
    private String sitioWeb;
    private LocalDate fundacion;

    public Editorial() {
        
    }

    public Editorial(int id) {
        this.id = id;
    }

    public Editorial(String nombreEditorial, String sedeEditorial, String direccionEditorial, String telefonoEditorial, String emailEditorial, String sitioWeb, LocalDate fundacion) {
        this.nombreEditorial = nombreEditorial;
        this.sedeEditorial = sedeEditorial;
        this.direccionEditorial = direccionEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.emailEditorial = emailEditorial;
        this.sitioWeb = sitioWeb;
        this.fundacion = fundacion;
    }

    public Editorial(int id, String nombreEditorial, String sedeEditorial, String direccionEditorial, String telefonoEditorial, String emailEditorial, String sitioWeb, LocalDate fundacion) {
        this.id = id;
        this.nombreEditorial = nombreEditorial;
        this.sedeEditorial = sedeEditorial;
        this.direccionEditorial = direccionEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.emailEditorial = emailEditorial;
        this.sitioWeb = sitioWeb;
        this.fundacion = fundacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getSedeEditorial() {
        return sedeEditorial;
    }

    public void setSedeEditorial(String sedeEditorial) {
        this.sedeEditorial = sedeEditorial;
    }

    public String getDireccionEditorial() {
        return direccionEditorial;
    }

    public void setDireccionEditorial(String direccionEditorial) {
        this.direccionEditorial = direccionEditorial;
    }

    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    public String getEmailEditorial() {
        return emailEditorial;
    }

    public void setEmailEditorial(String emailEditorial) {
        this.emailEditorial = emailEditorial;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombreEditorial=" + nombreEditorial + ", sedeEditorial=" + sedeEditorial + ", direccionEditorial=" + direccionEditorial + ", telefonoEditorial=" + telefonoEditorial + ", emailEditorial=" + emailEditorial + ", sitioWeb=" + sitioWeb + ", fundacion=" + fundacion + '}';
    }
    
}
