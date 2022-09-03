package com.athos.models.domain;

/**
 *
 * @author Daniel de Jesús Estrada Rojo
 * @date 2/09/2022
 * @time 21:53:09
 *
 * Codigo Tecnico: IN5BV
 */
public class Cliente {
    private int idCliente;
    private String direccion;
    private String emailCliente;
    private String telefonoCliente;
    private String nit;
    private int personaId;

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String direccion, String emailCliente, String telefonoCliente, String nit, int personaId) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;
        this.nit = nit;
        this.personaId = personaId;
    }

    public Cliente(String direccion, String emailCliente, String telefonoCliente, String nit, int personaId) {
        this.direccion = direccion;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;
        this.nit = nit;
        this.personaId = personaId;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", direccion=" + direccion + ", emailCliente=" + emailCliente + ", telefonoCliente=" + telefonoCliente + ", nit=" + nit + ", personaId=" + personaId + '}';
    }
    
    
}
