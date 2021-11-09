
package Modelo_lote;

public class Base implements Cloneable
{
    private String nombre;
    private int horas;
    private double costoPorHora;

    public Base(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setHoras(int horas)
    {
        this.horas = horas;
    }

    public void setCostoPorHora(double costoPorHora) 
    {
        this.costoPorHora = costoPorHora;
    }

    public int getHoras()
    {
        return horas;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException 
   {
      return (Base)super.clone();
   }    
}
