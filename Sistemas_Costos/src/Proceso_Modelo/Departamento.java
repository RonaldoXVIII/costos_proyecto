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
public class Departamento {
    
    private String nombre;
    private Unidad unidadesTerminadas;
    private Unidad unidadesIniciadas;
    private Costo costoInicial,costoFinal;
    private Unidad uep_inicial;
    private Unidad uep_final;
    private double totalCosteado,ueMateriales,ueCConversion;
    private double costoContabilizado,costoContabilizar;
    
    

    public Departamento(String nombre, Unidad unidadesTerminadas, Unidad unidadesIniciadas, Costo costoInicial, Costo costoFinal, Unidad uep_inicial, Unidad uep_final) {
        this.nombre = nombre;
        this.unidadesTerminadas = unidadesTerminadas;
        this.unidadesIniciadas = unidadesIniciadas;
        this.costoInicial = costoInicial;
        this.costoFinal = costoFinal;
        this.uep_inicial = uep_inicial;
        this.uep_final = uep_final;
        this.totalCosteado = uep_final.getCantidad() + unidadesTerminadas.getCantidad();
        
    }
    
    
    
    public double margenDeError()
    {
        return this.costoContabilizado-this.costoContabilizar;
    }
    
   
    
    
    public void costoPorContabilizado(boolean esPeps) {
        if(esPeps) {
            this.costoContabilizado = costoInicial.costoTotal() +
                    (uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cm()))*costoE_porUnidadMaterial(esPeps)+
                    (uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cc()))*costoE_porUnidadCC(esPeps)+
                    
                    unidades_cyt()*costoE_Total(esPeps)+
                    
                    uep_final.getCantidad()*uep_final.getTasa_cm()*costoE_porUnidadMaterial(esPeps) + 
                   uep_final.getCantidad()*uep_final.getTasa_cc()*costoE_porUnidadCC(esPeps) ;
            
            
        }
        else {
        
           this.costoContabilizado =  unidadesTerminadas.getCantidad()*costoE_Total(esPeps) +
                   uep_final.getCantidad()*uep_final.getTasa_cm()*costoE_porUnidadMaterial(esPeps) + 
                   uep_final.getCantidad()*uep_final.getTasa_cc()*costoE_porUnidadCC(esPeps) ;
        }
    }
    
    
    
    public double costoContabilizadoUEPInicial(boolean esPeps)
    {
        return costoInicial.costoTotal() +
                    (uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cm()))*costoE_porUnidadMaterial(esPeps)+
                    (uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cc()))*costoE_porUnidadCC(esPeps);
    }
      public double costoContabilizadoUEPFinal(boolean esPeps)
    {
        return uep_final.getCantidad()*uep_final.getTasa_cm()*costoE_porUnidadMaterial(esPeps) + 
                   uep_final.getCantidad()*uep_final.getTasa_cc()*costoE_porUnidadCC(esPeps);
    }
        public double costoContabilizadoUTerminadas(boolean esPeps)
    {
        if(esPeps)
        {
        return unidades_cyt()*costoE_Total(esPeps);
            
        } else {
            
        return unidadesTerminadas.getCantidad()*costoE_Total(esPeps)-costoContabilizadoUEPInicial(esPeps);
        }
    }
    
    

    
    
    
    
    public double costosContabilizarMateriales()
    {
        return costoInicial.getCostoMaterial() + costoFinal.getCostoMaterial();
        
    }
    
    
    
    public double costosContabilizarCC()
    {
        return costoInicial.getCostoConversion() + costoFinal.getCostoConversion();
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
           return costoFinal.getCostoMaterial()/ueMateriales;
       } else {
           return costosContabilizarMateriales()/ueMateriales;
       }
       
   }
   public double costoE_porUnidadCC(boolean esPeps)
   {
        if(esPeps)
       {
           return costoFinal.getCostoConversion()/ueCConversion;
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
            this.ueMateriales = unidades_cyt() + uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cm())  + uep_final.getCantidad()*uep_final.getTasa_cm();
            this.ueCConversion = unidades_cyt() + uep_inicial.getCantidad()*(1-uep_inicial.getTasa_cc())  + uep_final.getCantidad()*uep_final.getTasa_cc();
           
        } else {
            this.ueMateriales = unidadesTerminadas.getTasa_cm()*unidadesTerminadas.getCantidad() + uep_final.getCantidad()*uep_final.getTasa_cm();
            this.ueCConversion = unidadesTerminadas.getTasa_cc()*unidadesTerminadas.getCantidad() + uep_final.getCantidad()*uep_final.getTasa_cc();
        }
    }
    
    
    
    public double unidades_comenzadas()
    {
        return totalCosteado - uep_inicial.getCantidad(); 
    }
    
    
    public double unidades_cyt()
    {
        return totalCosteado-(uep_final.getCantidad()+uep_inicial.getCantidad());
    }
    

    
    public void procesandoInformacion(boolean esPeps)
    {
        
        
                unidades_comenzadas();
        unidades_cyt();
        unidades_equivalentes(esPeps);
        costoE_Total(esPeps);
        costoPorContabilizar();
        costoPorContabilizado(esPeps);
        
        
       String prueba="PP"
               + "TOTAL COSTEADO: "+totalCosteado
               + "TOTAL COMENZADAS"+unidades_comenzadas()
               +"COSTOS CONVERSION"+ueCConversion
               +"COSTOS C. MATERIALES"+costosContabilizarMateriales()
               +"COSTOS C. CCONVERSION"+ costosContabilizarCC()
               +"COSTOS E/UNIDAD Material "+ costoE_porUnidadMaterial(esPeps)
               +"COSTOS E/UNIDAD CC"+costoE_porUnidadCC(esPeps);

        System.out.println(prueba);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proceso_Modelo.Unidad getUnidadesTerminadas() {
        return unidadesTerminadas;
    }

    public void setUnidadesTerminadas(Proceso_Modelo.Unidad unidadesTerminadas) {
        this.unidadesTerminadas = unidadesTerminadas;
    }

    public Proceso_Modelo.Unidad getUnidadesIniciadas() {
        return unidadesIniciadas;
    }

    public void setUnidadesIniciadas(Proceso_Modelo.Unidad unidadesIniciadas) {
        this.unidadesIniciadas = unidadesIniciadas;
    }

    public Proceso_Modelo.Costo getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(Proceso_Modelo.Costo costoInicial) {
        this.costoInicial = costoInicial;
    }

    public Proceso_Modelo.Costo getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(Proceso_Modelo.Costo costoFinal) {
        this.costoFinal = costoFinal;
    }

    public Proceso_Modelo.Unidad getUep_inicial() {
        return uep_inicial;
    }

    public void setUep_inicial(Proceso_Modelo.Unidad uep_inicial) {
        this.uep_inicial = uep_inicial;
    }

    public Proceso_Modelo.Unidad getUep_final() {
        return uep_final;
    }

    public void setUep_final(Proceso_Modelo.Unidad uep_final) {
        this.uep_final = uep_final;
    }

    public double getTotalCosteado() {
        return totalCosteado;
    }

    public void setTotalCosteado(double totalCosteado) {
        this.totalCosteado = totalCosteado;
    }

    public double getUeMateriales() {
        return ueMateriales;
    }

    public void setUeMateriales(double ueMateriales) {
        this.ueMateriales = ueMateriales;
    }

    public double getUeCConversion() {
        return ueCConversion;
    }

    public void setUeCConversion(double ueCConversion) {
        this.ueCConversion = ueCConversion;
    }

    public double getCostoContabilizado() {
        return costoContabilizado;
    }

    public void setCostoContabilizado(double costoContabilizado) {
        this.costoContabilizado = costoContabilizado;
    }

    public double getCostoContabilizar() {
        return costoContabilizar;
    }

    public void setCostoContabilizar(double costoContabilizar) {
        this.costoContabilizar = costoContabilizar;
    }
            
            
    
    
    
    
}
