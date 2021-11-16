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
public class Costo {
    private double costoMaterial,costoConversion;

    public Costo(double costoMaterial, double costoConversion) {
        this.costoMaterial = costoMaterial;
        this.costoConversion = costoConversion;
    }
    
    public  double costoTotal()
    {
        return costoMaterial+costoConversion;
    }

    public double getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(double costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public double getCostoConversion() {
        return costoConversion;
    }

    public void setCostoConversion(double costoConversion) {
        this.costoConversion = costoConversion;
    }
    
    
}
