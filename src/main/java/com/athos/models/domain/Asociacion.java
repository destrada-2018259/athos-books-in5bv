
package com.athos.models.domain;

/**
 *
 * @author Dorbal Emilio Aldana Ramos
 * @date 4/09/2022
 * @time 13:21:39
 * Carné 2021604
 * Código técnico: IN5BV
 * Grupo: 1
 */
public class Asociacion {
    private String libroId;
    private int autorId;
    private int generoId;

    public Asociacion() {
    }

    public Asociacion(String libroId, int autorId, int generoId) {
        this.libroId = libroId;
        this.autorId = autorId;
        this.generoId = generoId;
    }

    public String getLibroId() {
        return libroId;
    }

    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getGeneroId() {
        return generoId;
    }

    public void setGeneroId(int generoId) {
        this.generoId = generoId;
    }

    @Override
    public String toString() {
        return "Asociacion{" + "libro_id=" + libroId + ", autor_id=" + autorId + ", genero_id=" + generoId + '}';
    }

    
    
    
}
