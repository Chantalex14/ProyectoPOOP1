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
public class Colaborador extends Persona{
    private String puestoTra;
    private Empleado tipoEm;
    private boolean estadoAc;
    private String fechaIni;
    private String fechaFin;
    
    public String getPuestoTra(){
        return this.puestoTra;
    }
    public Empleado getTipoEm(){
        return this.tipoEm;
    }
    public boolean getEstadoAC(){
        return this.estadoAc;
    }
    public String getFechaIni(){
        return this.fechaIni;
    }
    public String getFechaFin(){
        return this.fechaFin;
    }
    public void setPuestoTra(String pt){
        this.puestoTra=pt;
    }
    public void setTipoEm(Empleado em){
        this.tipoEm=em;
    }
    public void setEstadoAc(boolean ea){
        this.estadoAc=ea;
    }
    public void setFechaIni(String fi){
        this.fechaIni=fi;
    }
    public void setFechaFin(String ff){
        this.fechaFin=ff;
    }
    
}
