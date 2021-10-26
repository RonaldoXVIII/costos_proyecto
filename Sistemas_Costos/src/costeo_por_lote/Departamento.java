/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costeo_por_lote;

import java.util.ArrayList;

/**
 *HMOD,HMQ,UNIDADESPRODUCIDAS
 * @author ASUS
 */
public class Departamento {
    private double cifp,cifr,tasa,cifa;
    String nombre;
    
    
    
    
    
    
    ArrayList<Base> basesPresupuestado = new ArrayList<Base>();
    ArrayList<Base> basesReal= new ArrayList<Base>();
    
    

    

    double costoHora;
    double costoMOD;
    int ctnHoras;
    
    

    public Departamento(int ctnHoras,double cifp, double cifr, String nombre, double costoHora,int horaUnidad,ArrayList<Base> bReal,ArrayList<Base> bPresupuestado) {
        this.cifp = cifp;
        this.cifr = cifr;
        this.nombre = nombre;
        this.costoHora = costoHora;
        this.ctnHoras   = ctnHoras;
        this.basesPresupuestado=bPresupuestado;
        this.basesReal = bReal;
    }

    
    public void calculandoMOD()
    {
        this.costoMOD = costoHora*costoMOD;
        
    }
    
    
    public void calculandoTasa(String tipoBase)
    {
        Base base = obteniendoBase(tipoBase,false);
        this.tasa = cifp/base.getHoras();
    }
    
    
    public double calculandoCifa(String tipoBase)
    {
        this.cifa = tasa*(obteniendoBase(tipoBase,true).getHoras());
        return cifa;
    }
    
    
    
    public  Base obteniendoBase(String tipoBase,boolean esReal)
    {
        Base base;
        ArrayList<Base> basesCurrent = new  ArrayList<>(); 
        if(esReal)
        {
            basesCurrent = basesReal;
        }
        else {
            basesCurrent = basesPresupuestado;
        }
        
        
        for(Base baseCurrent: basesCurrent)
        {
            if(baseCurrent.getTipoBase().equals(tipoBase))
            {
                base = baseCurrent;
                return base;
            }
        }
        return null;
        
    }

    public double getCifp() {
        return cifp;
    }
    
    
    
    
}
