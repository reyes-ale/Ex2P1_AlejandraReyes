/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Items {
    String nombre;
    double HPpoints;
    double MPpoints;
    
    public Items (String nombre, double hppoints, double mppoints){
        this.nombre=nombre;
        this.HPpoints=hppoints;
        this.MPpoints=mppoints;
        
    
}

    @Override
    public String toString() {
        return "- Item: " + nombre + ", HPpoints= " + HPpoints + ", MPpoints= " + MPpoints + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHPpoints() {
        return HPpoints;
    }

    public void setHPpoints(double HPpoints) {
        this.HPpoints = HPpoints;
    }

    public double getMPpoints() {
        return MPpoints;
    }

    public void setMPpoints(double MPpoints) {
        this.MPpoints = MPpoints;
    }
    
    
}
