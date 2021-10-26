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
public class Departamento {
    
    String nombre;
    Unidad unidadesTerminadas;
    Unidad unidadesIniciadas;
    Costo costoInicial,costoFinal;
    Unidad uep_inicial;
    Unidad uep_final;
    double totalCosteado,ueMateriales,ueCConversion;
    double costoContabilizado,costoContabilizar;
    
    

    public Departamento(String nombre, Unidad unidadesTerminadas, Unidad unidadesIniciadas, Costo costoInicial, Costo costoFinal, Unidad uep_inicial, Unidad uep_final) {
        this.nombre = nombre;
        this.unidadesTerminadas = unidadesTerminadas;
        this.unidadesIniciadas = unidadesIniciadas;
        this.costoInicial = costoInicial;
        this.costoFinal = costoFinal;
        this.uep_inicial = uep_inicial;
        this.uep_final = uep_final;
        
        
        
        this.totalCosteado = uep_final.cantidad + unidadesTerminadas.cantidad;
        
    }
    
    
    
    public double margenDeError()
    {
        return this.costoContabilizado-this.costoContabilizar;
    }
    
   
    
    
    public void costoPorContabilizado(boolean esPeps) {
        if(esPeps) {
            this.costoContabilizado = costoInicial.costoTotal() +
                    (uep_inicial.cantidad*(1-uep_inicial.tasa_cm))*costoE_porUnidadMaterial(esPeps)+
                    (uep_inicial.cantidad*(1-uep_inicial.tasa_cc))*costoE_porUnidadCC(esPeps)+
                    unidades_cyt()*costoE_Total(esPeps)+
                    uep_final.cantidad*uep_final.tasa_cm*costoE_porUnidadMaterial(esPeps) + 
                   uep_final.cantidad*uep_final.tasa_cc*costoE_porUnidadCC(esPeps) ;
            
            
        }
        else {
        
           this.costoContabilizado =  unidadesTerminadas.cantidad*costoE_Total(esPeps) +
                   uep_final.cantidad*uep_final.tasa_cm*costoE_porUnidadMaterial(esPeps) + 
                   uep_final.cantidad*uep_final.tasa_cc*costoE_porUnidadCC(esPeps) ;
        }
    }
    
    

    
    
    
    
    public double costosContabilizarMateriales()
    {
        return costoInicial.costoMaterial + costoFinal.costoMaterial;
        
    }
    
    public double costosContabilizarCC()
    {
        return costoInicial.costoConversion + costoFinal.costoConversion;
    }
    
   public double costoPorContabilizar()
   {
       this.costoContabilizar = costosContabilizarCC()+costosContabilizarMateriales();
       return this.costoContabilizar;
   }
   
   
   
   public double costoE_porUnidadMaterial(boolean esPeps)
   {
       if(esPeps)
       {
           return costoFinal.costoMaterial/ueMateriales;
       } else {
           return costosContabilizarMateriales()/ueMateriales;
       }
       
   }
   public double costoE_porUnidadCC(boolean esPeps)
   {
        if(esPeps)
       {
           return costoFinal.costoConversion/ueCConversion;
       } else {
           return costosContabilizarCC()/ueCConversion;
       }
   }
   
   
   public double costoE_Total(boolean esPeps)
   {
       return costoE_porUnidadCC(esPeps) +costoE_porUnidadMaterial(esPeps);
   }
   

    
    
    
    public void unidades_equivalentes(boolean esPeps)
    {
        if(esPeps)
        {
            this.ueMateriales = unidades_cyt() + uep_inicial.cantidad*(1-uep_inicial.tasa_cm)  + uep_final.cantidad*uep_final.tasa_cm;
            this.ueCConversion = unidades_cyt() + uep_inicial.cantidad*(1-uep_inicial.tasa_cc)  + uep_final.cantidad*uep_final.tasa_cc;
           
        } else {
            this.ueMateriales = unidadesTerminadas.tasa_cm*unidadesTerminadas.cantidad + uep_final.cantidad*uep_final.tasa_cm;
            this.ueCConversion = unidadesTerminadas.tasa_cc*unidadesTerminadas.cantidad + uep_final.cantidad*uep_final.tasa_cc;
        }
    }
    
    
    
    public double unidades_comenzadas()
    {
        return totalCosteado - uep_inicial.cantidad; 
    }
    
    
    public double unidades_cyt()
    {
        return totalCosteado-(uep_final.cantidad+uep_inicial.cantidad);
    }
    
            
            
    
    
    
    
}
