/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costeo_por_lote;

/**
 *
 * @author ASUS
 */
public class Base {
    private String tipoBase;
    private int horas;

    public Base(String tipoBase, int horas) {
        this.tipoBase = tipoBase;
        this.horas = horas;
    }

    public String getTipoBase() {
        return tipoBase;
    }

    public void setTipoBase(String tipoBase) {
        this.tipoBase = tipoBase;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}
