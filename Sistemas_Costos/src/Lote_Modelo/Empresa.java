
package Lote_Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa implements Cloneable
{
    private String nombre;
    private String modalidad; //real, presupuestado, real y presupuestado
    private String tipoCifa; //predeterminada (empresarial) o departamental
    private Base baseAsignacionDeCosto;
    private double Cifa;
    private Orden orden;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Base> listaBases;

    public Empresa(String nombre, String modalidad, String tipoCifa) 
    {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.tipoCifa = tipoCifa;
        listaDepartamentos = new ArrayList<Departamento>();
        listaBases = new  ArrayList<Base>();
    }

    public void setBaseAsignacionDeCosto(Base baseAsignacionDeCosto)
    {
        this.baseAsignacionDeCosto = baseAsignacionDeCosto;
    }

    public String getModalidad() 
    {
        return modalidad;
    }      

    public Base getBaseAsignacionDeCosto() 
    {
        return baseAsignacionDeCosto;
    }

    public String getTipoCifa()
    {
        return tipoCifa;
    }

    public List<Base> getListaBases() 
    {
        return listaBases;
    }
    
    public void addBase(Base base)
    {
        this.listaBases.add(base);
    }

    public ArrayList<Departamento> getListaDepartamentos() 
    {
        return listaDepartamentos;
    }
  
    public void addDepartamento(Departamento departamento)
    {
        this.listaDepartamentos.add(departamento);
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos)
    {
        this.listaDepartamentos.addAll(listaDepartamentos);
    }

    public void setListaBases(List<Base> listaBases) 
    {
        this.listaBases.addAll(listaBases);
    }
    
    @Override
   public Object clone() throws CloneNotSupportedException 
   {
      return (Empresa)super.clone();
   }    
    
}
