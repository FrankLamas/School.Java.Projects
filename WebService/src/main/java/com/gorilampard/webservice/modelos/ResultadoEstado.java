/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gorilampard.webservice.modelos;

/**
 *
 * @author falco
 */
public class ResultadoEstado {
    private int estado;

    public ResultadoEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
