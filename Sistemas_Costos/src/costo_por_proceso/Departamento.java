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

    public Departamento(String nombre, Unidad unidadesTerminadas, Unidad unidadesIniciadas, Costo costoInicial, Costo costoFinal, Unidad uep_inicial, Unidad uep_final) {
        this.nombre = nombre;
        this.unidadesTerminadas = unidadesTerminadas;
        this.unidadesIniciadas = unidadesIniciadas;
        this.costoInicial = costoInicial;
        this.costoFinal = costoFinal;
        this.uep_inicial = uep_inicial;
        this.uep_final = uep_final;
    }
    
    
    
            
            
    
    
    
    
}
