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
public class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;
    
    public String getCedula(){
        return this.cedula;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getEmail(){
        return this.email;
    }
    public void setCedula(String ci){
        this.cedula=ci;
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    public void setTelefono(String t){
        this.telefono=t;
    }
    public void setEmail(String e){
        this.email=e;
    }
    
}
