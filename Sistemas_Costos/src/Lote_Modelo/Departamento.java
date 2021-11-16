
package Lote_Modelo;


import java.util.ArrayList;
import java.util.List;

public class Departamento
{
    private String nombre;
    private String nombreBaseTasaDepartamental;
    private double CIPresupuestado;
    private double CIReal;
    private double Cifa;
    private ArrayList<Base> listaBasesPresupuestadas;
    private ArrayList<Base> listaBasesReales;
    private ArrayList<Base> listaBasesParaOrden;

    public Departamento(String nombre, double CIPresupuestado) 
    {
        this.nombre = nombre;
        this.CIPresupuestado = CIPresupuestado;       
    }
    
    public Departamento(double CIReal, String nombre) 
    {
        this.nombre = nombre;
        this.CIReal = CIReal ;
    }

    public Departamento(String nombre, double CIPresupuestado, double CIReal)
    {
        
        this.nombre = nombre;
        this.CIPresupuestado = CIPresupuestado;
        this.CIReal = CIReal;
    }

    public String getNombreBaseTasaDepartamental() 
    {
        return nombreBaseTasaDepartamental;
    }

    public void setNombreBaseTasaDepartamental(String nombreBaseTasaDepartamental) 
    {
        this.nombreBaseTasaDepartamental = nombreBaseTasaDepartamental;
    }
    
    public double getCIPresupuestado() 
    {
        return CIPresupuestado;
    }

    public double getCIReal() 
    {
        return CIReal;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    /*
    public int ObtenerIndiceDeBase(String nombreBase, String modalidad)
    {
        ArrayList<Base> listaBases;
        int  indice = 0;
        
        if(modalidad.equals("Presupuestado"))      
            listaBases =  listaBasesPresupuestadas; //PARA EL CIFA SE USA LA BASE PRESUPUESTADA      
        else       
            listaBases =  listaBasesReales;
               
        while(indice < listaBases.size()) 
        {
            if(nombreBase == listaBases.get(indice).getNombre())
                break;
            indice++;
        }
        
        return indice;
    }    */
    
    public int ObtenerIndiceDeBase(String nombreBase, List<Base> listaBasesEmpresa)
    {
        int indice = 0;
        
        while(indice < listaBasesEmpresa.size()) //PARA EL CIFA SE USA LA BASE PRESUPUESTADA
        {
            if(nombreBase == listaBasesEmpresa.get(indice).getNombre())
                break;
            indice++;
        }
        
        return indice;
    }       
    
    public List<Base> getListaBasesPresupuestadas() 
    {
        return listaBasesPresupuestadas;
    }
  
    public void addBasePresupuestada(Base base)
    {
        this.listaBasesPresupuestadas.add(base);
    }

    public void setListaBasesPresupuestadas(List<Base> listaBases)
    {
        this.listaBasesPresupuestadas = new ArrayList<Base>();
        this.listaBasesPresupuestadas.addAll(listaBases);
    }    
    
    public List<Base> getListaBasesReales() 
    {
        return listaBasesReales;
    }
    
    public void addBaseReal(Base base)
    {
        this.listaBasesReales.add(base);
    }
    
    public void setListaBasesReales(List<Base> listaBases)
    {
        this.listaBasesReales = new ArrayList<Base>();
        this.listaBasesReales.addAll(listaBases);
    }   
    
    public List<Base> getListaBasesParaOrden() 
    {
        return listaBasesParaOrden;
    }
    
    public void addBaseParaOrden(Base base)
    {
        this.listaBasesParaOrden.add(base);
    }
    
    public void setListaBasesParaOrden(List<Base> listaBases)
    {
        this.listaBasesParaOrden = new ArrayList<Base>();
        this.listaBasesParaOrden.addAll(listaBases);
    }   
}
