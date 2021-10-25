/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costo_por_proceso;

/**
 *
 * @author ASUS
 */
public class Unidad {
    double tasa_cc;
    double tasa_cm;
    
   Costo costo;
    
    int cantidad;
    String estado;

    public Unidad(double tasa_cc, double tasa_cm, Costo costo, int cantidad, String estado) {
        this.tasa_cc = tasa_cc;
        this.tasa_cm = tasa_cm;
        this.costo = costo;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    
    
    
}
