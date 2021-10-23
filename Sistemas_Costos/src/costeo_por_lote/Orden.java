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
    
    
    
    
}

