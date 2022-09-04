package com.athos.models.domain;



/**
 *
 * @author Bryan Daniel Cabrera Mendoza
 * @date 4/09/2022
 * @time 14:14:03
 */

import java.time.LocalDate;

public class Autores {
    private int idAutores;
    private String PaisOrigen;
    private LocalDate FechaNacimiento;
    private int personaId;

    public Autores() {
    }

    public Autores(int idAutores) {
        this.idAutores = idAutores;
    }

    public Autores(String PaisOrigen, LocalDate FechaNacimiento, int personaId) {
        this.PaisOrigen = PaisOrigen;
        this.FechaNacimiento = FechaNacimiento;
        this.personaId = personaId;
    }

    public Autores(int idAutores, String PaisOrigen, LocalDate FechaNacimiento, int personaId) {
        this.idAutores = idAutores;
        this.PaisOrigen = PaisOrigen;
        this.FechaNacimiento = FechaNacimiento;
        this.personaId = personaId;
    }

    //GETTERS
    public int getIdAutores() {
        return idAutores;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public int getPersonaId() {
        return personaId;
    }
    
    //SETTERS
    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    @Override
    public String toString() {
        return "Autores{" + "idAutores=" + idAutores + ", PaisOrigen=" + PaisOrigen + ", FechaNacimiento=" + FechaNacimiento + ", personaId=" + personaId + '}';
    }
    
    
}
