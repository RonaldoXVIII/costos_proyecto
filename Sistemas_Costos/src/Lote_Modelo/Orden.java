
package Lote_Modelo;

public class Orden
{
    private int numero;
    private int unidades;
    private double importeMaterialDirecto;
    private double importeBaseAsignadaCostos;
    private double importeCifa;

    public Orden(int numero, int unidades, double importeMaterialDirecto) 
    {
        this.numero = numero;
        this.unidades = unidades;
        this.importeMaterialDirecto = importeMaterialDirecto;
        this.importeBaseAsignadaCostos = 0;
    }
    
    public void EstablecerImporteBaseAsignadoCostos(int horasBaseAsigCos, double costoPorHoraBaseAsigCos)
    {
        this.importeBaseAsignadaCostos += horasBaseAsigCos * costoPorHoraBaseAsigCos;
    }

    public void setImporteCifa(double importeCifa) 
    {
        this.importeCifa = importeCifa;
    }

    public double getImporteCifa() 
    {
        return importeCifa;
    }

    public double getImporteMaterialDirecto()
    {
        return importeMaterialDirecto;
    }

    public double getImporteBaseAsignadaCostos() 
    {
        return importeBaseAsignadaCostos;
    }
    
    public double getImporteBaseAsignadaCostosUnidad()
    {
        return importeBaseAsignadaCostos / unidades;
    }    
    
    public double getImporteMaterialDirectoUnidad()
    {
        return importeMaterialDirecto / unidades;
    }
    
    public double getImporteCifaUnidad()
    {
        return importeCifa / unidades; 
    }
    
    public double getTotal()
    {
        return importeMaterialDirecto + importeBaseAsignadaCostos + importeCifa;
    }
    
    public double getTotalUnidad()
    {
        return getImporteMaterialDirectoUnidad() + getImporteBaseAsignadaCostosUnidad() + getImporteCifaUnidad();
    }
}
