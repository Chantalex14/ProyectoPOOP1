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
public class Urbanizacion {
    private String nombre;
    private String etapa;
    private String email;
    private String direccion;
    private String constructora;
    private Colaborador administrador;
    
    public String getNombre(){
        return this.nombre;
    }
    public String getEtapa(){
        return this.etapa;
    }
    public String getEmail(){
        return this.email;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getConstructora(){
        return this.constructora;
    }
    public Colaborador getAdministrador(){
        return this.administrador;
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    public void setEtapa(String et){
        this.etapa=et;
    }
    public void setEmail(String em){
        this.email=em;
    }
    public void setDireccion(String dir){
        this.direccion=dir;
    }
    public void setConstructora(String cons){
        this.constructora=cons;
    }
    public void setAdministrador(Colaborador col){
        this.administrador=col;
    }
    
}
