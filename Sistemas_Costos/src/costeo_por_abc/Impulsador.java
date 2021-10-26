/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costeo_por_abc;

/**
 *
 * @author usuario
 */
public class Impulsador {
    private String nombre;
    private double cantidad;

    public Impulsador(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Impulsador{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
