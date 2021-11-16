/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso_Modelo;

import costo_por_proceso.*;

/**
 *
 * @author ASUS
 */
public class Unidad {
    private double tasa_cc;
    private double tasa_cm;
    
   private Costo costo;
    
    private int cantidad;
    private String estado;

    
    
    public Unidad(double tasa_cc, double tasa_cm, Costo costo, int cantidad, String estado) {
        this.tasa_cc = tasa_cc;
        this.tasa_cm = tasa_cm;
        this.costo = costo;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public double getTasa_cc() {
        return tasa_cc;
    }

    public void setTasa_cc(double tasa_cc) {
        this.tasa_cc = tasa_cc;
    }

    public double getTasa_cm() {
        return tasa_cm;
    }

    public void setTasa_cm(double tasa_cm) {
        this.tasa_cm = tasa_cm;
    }

    public Proceso_Modelo.Costo getCosto() {
        return costo;
    }

    public void setCosto(Proceso_Modelo.Costo costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
