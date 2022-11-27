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
public class Residente extends Persona{
    private boolean estadoAc;
    private int mz;
    private int villa;
    private int cantidadPer;
    private Urbanizacion urbanizacion;
    
    public boolean getEstadoAc(){
        return this.estadoAc;
    }
    public int getMz(){
        return this.mz;
    }
    public int getVilla(){
        return this.villa;
    }
    public int getCantidadPer(){
        return this.cantidadPer;
    }
    public Urbanizacion getUrbanizacion(){
        return this.urbanizacion;
    }
    public void setEstadoAc(Boolean ea){
        this.estadoAc=ea;
    }
    public void setMz(int m){
        this.mz=m;
    }
    public void setVilla(int v){
        this.villa=v;
    }
    public void setCantidadPer(int p){
        this.cantidadPer=p;
    }
    public void serUrbanizacion(Urbanizacion ub){
        this.urbanizacion=ub;
    }
    
}
