/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costeo_por_lote;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Orden {
    int id;
    double materialDirecto;
    ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
    double tasa,cifa;
    int unidades;
    
    

    public Orden(int id, double materialDirecto, ArrayList<Departamento> departamentos, double tasa, double cifa, int unidades) {
        this.id = id;
        this.materialDirecto = materialDirecto;
        this.departamentos = departamentos;
        this.tasa = tasa;
        this.cifa = cifa;
        this.unidades = unidades;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void calculandoCifa(String tipoBases, boolean esHetero)
    {
        if(esHetero)
        {
          String bases[] = tipoBases.split(",");
          int i=0;
          for(Departamento depa:departamentos)
          {
              cifa+=depa.calculandoCifa(bases[i]);
              i++;
              
          }
        }
        else {
            double cifps=0;
        int horasAcumuladas=0;
        for(Departamento depa:departamentos)
        {
           horasAcumuladas+= depa.obteniendoBase(tipoBases, false).getHoras();
           cifps += depa.getCifp();
        }
        this.cifa = cifps/horasAcumuladas;
        }
        
    }

    
    
    
    
    
    
}

