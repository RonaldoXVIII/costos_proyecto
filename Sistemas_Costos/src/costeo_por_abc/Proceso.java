/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Costeo_ABC;

import java.util.ArrayList;
import java.util.function.BiPredicate;


/**
 *
 * @author usuario
 */
public class Proceso {
    private ArrayList<Actividad> actividadesUsadas=new ArrayList();
    private ArrayList<Impulsador> impulsadorUsados=new ArrayList();
    private double costoMaterialD, costoManoObraD;
    private String nombreProducto;
    private int numeroUnidades;
    
    private double costoTotal, costoUnitario, cifaTotal;
    
    private ArrayList<Double> cifaActividad=new ArrayList();

    public Proceso(double costoMaterialD, double costoManoObraD, String nombreProducto, int numeroUnidades) {
        this.costoMaterialD = costoMaterialD;
        this.costoManoObraD = costoManoObraD;
        this.nombreProducto = nombreProducto;
        this.numeroUnidades = numeroUnidades;
    }

    public void setActividadesUsadas(ArrayList<Actividad> actividadesUsadas) {
        this.actividadesUsadas = actividadesUsadas;
    }

    public void setImpulsadorUsados(ArrayList<Impulsador> impulsadorUsados) {
        this.impulsadorUsados = impulsadorUsados;
    }
    
    
    public double calculoCifaTotal(){
        double cifatotal=0;
        ArrayList<Double> cCurrent=new ArrayList();
        cCurrent=cifaActividad;
        for(Double cifaActi : cCurrent){
            cifatotal+=cifaActi;
        }
        this.cifaTotal=cifatotal;
        return cifatotal;
    }
    
    /*calculoCifaActividad((a,b)->a.getImpulsador().getNombre().equals(b.getNombre()));*/
    public void calculoCifaActividad(BiPredicate<Actividad,Impulsador> pre){
        ArrayList<Actividad> ACurrent=new ArrayList();
        ACurrent=actividadesUsadas;
        
        ArrayList<Impulsador> ICurrent=new ArrayList();
        ICurrent=impulsadorUsados;
        
        for(Actividad ActividadCurrent : ACurrent){
            for(Impulsador ImpulsadorCurrent : ICurrent){
                if(pre.test(ActividadCurrent, ImpulsadorCurrent)){
                    cifaActividad.add(ActividadCurrent.costoUnidadImpulsador()*ImpulsadorCurrent.getCantidad());
                }
                
            }
        }
        
    }
    
    public double calculoCostoTotal(){
        this.costoTotal=this.cifaTotal+this.costoManoObraD+this.costoMaterialD;
        return this.cifaTotal+this.costoManoObraD+this.costoMaterialD;
    }
    
    public double calculoCostoUnitario(){
        this.costoUnitario=this.costoTotal/this.numeroUnidades;
        return this.costoTotal / this.numeroUnidades;
    }

    public ArrayList<Double> getCifaActividad() {
        return cifaActividad;
    }

    public double getCostoMaterialD() {
        return costoMaterialD;
    }

    public double getCostoManoObraD() {
        return costoManoObraD;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public ArrayList<Actividad> getActividadesUsadas() {
        return actividadesUsadas;
    }

    public ArrayList<Impulsador> getImpulsadorUsados() {
        return impulsadorUsados;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public double getCifaTotal() {
        return cifaTotal;
    }

    //HOLA asdasdasdasdasdasdasdasdasd
    
    @Override
    public String toString() {
        return "Proceso{" + "actividadesUsadas=" + actividadesUsadas + ", impulsadorUsados=" + impulsadorUsados + ", costoMaterialD=" + costoMaterialD + ", costoManoObraD=" + costoManoObraD + ", nombreProducto=" + nombreProducto + ", numeroUnidades=" + numeroUnidades + ", costoTotal=" + costoTotal + ", costoUnitario=" + costoUnitario + ", cifaTotal=" + cifaTotal + ", cifaActividad=" + cifaActividad + '}';
    }
      
    
}
