/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1p;

/**
 *
 * @author Alex Bermúdez
 */
public class Visitante extends Persona{
    private String empresa;
    private String historialSan;
    
    public String getEmpresa(){
        return this.empresa;
    }
    public String getHistorialSan(){
        return this.historialSan;
    }
    public void setEmpresa(String em){
        this.empresa=em;
    }
    public void serHistorialSan(String his){
        this.historialSan=his;
    }
    
}
