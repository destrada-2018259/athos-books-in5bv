package com.athos.models.domain;

import java.time.LocalTime;

/**
 *
 * @author Juan Jose Rivas Alvarez
 * @date 4 sep 2022
 * @time 16:05:59
 * Carné: 2020573
 * Grupo: 1
 * Codigo Tecnico: IN5BV
 */

public class Horario {

    private int id;
    private LocalTime horario_inicio;
    private LocalTime horario_final;
    private boolean lunes;
    private boolean martes;
    private boolean miercoles;
    private boolean jueves;
    private boolean viernes;
    private boolean sabado;
    private boolean domingo;
    
    public Horario(){
        
    }

    public Horario(int id) {
        this.id = id;
    }

    public Horario(LocalTime horario_inicio, LocalTime horario_final, boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean viernes, boolean sabado, boolean domingo) {
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
    }

    public Horario(int id, LocalTime horario_inicio, LocalTime horario_final, boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean viernes, boolean sabado, boolean domingo) {
        this.id = id;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(LocalTime horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public LocalTime getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(LocalTime horario_final) {
        this.horario_final = horario_final;
    }

    public boolean isLunes() {
        return lunes;
    }

    public void setLunes(boolean lunes) {
        this.lunes = lunes;
    }

    public boolean isMartes() {
        return martes;
    }

    public void setMartes(boolean martes) {
        this.martes = martes;
    }

    public boolean isMiercoles() {
        return miercoles;
    }

    public void setMiercoles(boolean miercoles) {
        this.miercoles = miercoles;
    }

    public boolean isJueves() {
        return jueves;
    }

    public void setJueves(boolean jueves) {
        this.jueves = jueves;
    }

    public boolean isViernes() {
        return viernes;
    }

    public void setViernes(boolean viernes) {
        this.viernes = viernes;
    }

    public boolean isSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

    public boolean isDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }

    @Override
    public String toString() {
        return "Horario{" + "id=" + id + ", horario_inicio=" + horario_inicio + ", horario_final=" + horario_final + ", lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves=" + jueves + ", viernes=" + viernes + ", sabado=" + sabado + ", domingo=" + domingo + '}';
    }


    
}

