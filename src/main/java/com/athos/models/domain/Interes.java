
package com.athos.models.domain;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 2/09/2022
 * @time 22:21:33
 *
 * Codigo Tecnico: IN5BV
 */
public class Interes {
    private int idInteres;
    private int generoLiterarioId;
    private int clienteId;

    public Interes() {
    }

    public Interes(int idInteres, int generoLiterarioId, int clienteId) {
        this.idInteres = idInteres;
        this.generoLiterarioId = generoLiterarioId;
        this.clienteId = clienteId;
    }

    public Interes(int generoLiterarioId, int clienteId) {
        this.generoLiterarioId = generoLiterarioId;
        this.clienteId = clienteId;
    }

    public Interes(int idInteres) {
        this.idInteres = idInteres;
    }

    public int getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(int idInteres) {
        this.idInteres = idInteres;
    }

    public int getGeneroLiterarioId() {
        return generoLiterarioId;
    }

    public void setGeneroLiterarioId(int generoLiterarioId) {
        this.generoLiterarioId = generoLiterarioId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Interes{" + "idInteres=" + idInteres + ", generoLiterarioId=" + generoLiterarioId + ", clienteId=" + clienteId + '}';
    }
    
    
}
