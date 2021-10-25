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
public class Costo {
    double costoMaterial,costoConversion;

    public Costo(double costoMaterial, double costoConversion) {
        this.costoMaterial = costoMaterial;
        this.costoConversion = costoConversion;
    }
    
    public  double costoTotal()
    {
        return costoMaterial+costoConversion;
    }
    
}
